package com.insightfullogic.java8.answers.chapter6;

import java.util.List;

public class BuggyReduce {

	// 仅支持串行化计算,并行化计算存在问题
	public static int multiplyThrough(List<Integer> linkedListOfIntegers) {
		return linkedListOfIntegers.stream().reduce(5, (acc, element) -> acc * element);
	}

	public static int multiplyThroughBuggyFixed(List<Integer> linkedListOfIntegers) {
		return 5 * linkedListOfIntegers.parallelStream().reduce(1, (acc, element) -> acc * element);
	}
}
