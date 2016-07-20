package com.insightfullogic.java8.answers.chapter6;

import java.io.IOException;

import org.openjdk.jmh.Main;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.RunnerException;;

@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
public class OptimisationExample {

	public static void main(String[] ignore) throws IOException,RunnerException{
		final String[] args={
                ".*OptimisationExample.*",
                "-wi",
                "10",
                "-i",
                "10",
                "-f",
                "1"
		};
		Main.main(args);
	}
}
