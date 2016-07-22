package com.insightfullogic.java8.answers.chapter6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class OptimisationExampleFixed {

	// 后续使用JMH进行基准测试
	public static void main(String[] ignore) {

		int testNum = 1000;
		long startTime;
		double testTime = 0.0;
		OptimisationExampleFixed optimisationExample = new OptimisationExampleFixed();

		for (int i = 0; i < testNum; i++) {
			startTime = System.currentTimeMillis();
			optimisationExample.slowSumOfSquares();
			testTime = (double) (System.currentTimeMillis() - startTime) / testNum;
		}
		System.out.println("slowSumOfSquares 测试时间: " + testTime + "(ms)");
		
		for (int i = 0; i < testNum; i++) {
			startTime = System.currentTimeMillis();
			optimisationExample.serialSlowSumOfSquares();
			testTime = (double) (System.currentTimeMillis() - startTime) / testNum;
		}
		System.out.println("serialSlowSumOfSquares 测试时间: " + testTime + "(ms)");
		
		for (int i = 0; i < testNum; i++) {
			startTime = System.currentTimeMillis();
			optimisationExample.intermediateSumOfSquares();
			testTime = (double) (System.currentTimeMillis() - startTime) / testNum;
		}
		System.out.println("intermediateSumOfSquares 测试时间: " + testTime + "(ms)");
		
		for (int i = 0; i < testNum; i++) {
			startTime = System.currentTimeMillis();
			optimisationExample.serialIntermediateSumOfSquares();
			testTime = (double) (System.currentTimeMillis() - startTime) / testNum;
		}
		System.out.println("serialIntermediateSumOfSquares 测试时间: " + testTime + "(ms)");
		
		for (int i = 0; i < testNum; i++) {
			startTime = System.currentTimeMillis();
			optimisationExample.fastSumOfSquares();
			testTime = (double) (System.currentTimeMillis() - startTime) / testNum;
		}
		System.out.println("fastSumOfSquares 测试时间: " + testTime + "(ms)");
		
		for (int i = 0; i < testNum; i++) {
			startTime = System.currentTimeMillis();
			optimisationExample.serialFastSumOfSquares();
			testTime = (double) (System.currentTimeMillis() - startTime) / testNum;
		}
		System.out.println("serialFastSumOfSquares 测试时间: " + testTime + "(ms)");
	}

	private List<Integer> linkedListOfNumbers;
	private ArrayList<Integer> arrayListOfNumbers;

	public OptimisationExampleFixed() {
		init();
	}

	public void init() {
		linkedListOfNumbers = new LinkedList<>();
		addNumbers(linkedListOfNumbers);

		arrayListOfNumbers = new ArrayList<>();
		addNumbers(arrayListOfNumbers);
	}

	private void addNumbers(List<Integer> container) {
		IntStream.range(0, 1_000_000).forEach(container::add);
	}

	public int slowSumOfSquares() {
		return linkedListOfNumbers.parallelStream().map(x -> x * x).reduce(0, (acc, x) -> acc + x);
	}

	public int serialSlowSumOfSquares() {
		return linkedListOfNumbers.stream().map(x -> x * x).reduce(0, (acc, x) -> acc + x);
	}

	public int intermediateSumOfSquares() {
		return arrayListOfNumbers.parallelStream().map(x -> x * x).reduce(0, (acc, x) -> acc + x);
	}

	public int serialIntermediateSumOfSquares() {
		return arrayListOfNumbers.stream().map(x -> x * x).reduce(0, (acc, x) -> acc + x);
	}

	public int fastSumOfSquares() {
		return arrayListOfNumbers.parallelStream().mapToInt(x -> x * x).sum();
	}

	public int serialFastSumOfSquares() {
		return arrayListOfNumbers.stream().mapToInt(x -> x * x).sum();
	}
}
