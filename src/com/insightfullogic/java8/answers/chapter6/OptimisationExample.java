package com.insightfullogic.java8.answers.chapter6;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

//import org.openjdk.jmh.Main;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
public class OptimisationExample {

	public static void main(String[] ignore) throws IOException, RunnerException {
		// final String[] args = { ".*OptimisationExample.*", "-wi", "10", "-i",
		// "10", "-f", "1" };
		// Main.main(args);

		Options opt = new OptionsBuilder().include(OptimisationExample.class.getSimpleName()).warmupIterations(5)
				.measurementIterations(5).build();

		new Runner(opt).run();
	}

	private List<Integer> LinkedListOfNumbers;

	@Setup
	public void init() {
		LinkedListOfNumbers = new LinkedList<Integer>();
		addNumbers(LinkedListOfNumbers);
	}

	private void addNumbers(List<Integer> container) {
		IntStream.range(0, 1_000_000).forEach(container::add);
	}

	@Benchmark
	public int slowSumOfSquares() {
		return LinkedListOfNumbers.parallelStream().map(x -> x * x).reduce(0, (acc, element) -> acc + element);
	}

	@Benchmark
	public int fastSumOfSquares() {
		return 0;
	}

}
