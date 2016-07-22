package com.insightfullogic.java8.answers.chapter6;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class OptimisationExample {

	// 后续使用JMH进行基准测试
	public static void main(String[] ignore) {

		int testNum = 1000;
		long startTime;
		double testTime = 0.0;
		OptimisationExample optimisationExample = new OptimisationExample();

		for (int i = 0; i < testNum; i++) {
			startTime = System.currentTimeMillis();
			optimisationExample.slowSumOfSquares();
			testTime = (double) (System.currentTimeMillis() - startTime) / testNum;
		}
		System.out.println("测试时间: " + testTime + "(ms)");
	}

	private List<Integer> linkedListOfNumbers;

	public OptimisationExample() {
		init();
	}

	public void init() {
		linkedListOfNumbers = new LinkedList<>();
		addNumbers(linkedListOfNumbers);
	}

	private void addNumbers(List<Integer> container) {
		IntStream.range(0, 1_000_000).forEach(container::add);
	}

	public int slowSumOfSquares() {
		return linkedListOfNumbers.parallelStream().map(x -> x * x).reduce(0, (acc, x) -> acc + x);
	}

	public int fastSumOfSquares() {
		return 0;
	}

}
