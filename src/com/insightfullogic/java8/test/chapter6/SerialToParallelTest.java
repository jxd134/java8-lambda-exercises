package com.insightfullogic.java8.test.chapter6;

import static org.junit.Assert.*;

import java.util.stream.IntStream;

import org.junit.Test;

import com.insightfullogic.java8.answers.chapter6.SerialToParallel;

public class SerialToParallelTest {

	@Test
	public void testSerialToParalleTest() {
		assertEquals(328350, SerialToParallel.sequentialSumOfSquares(IntStream.range(0, 100)));
		assertEquals(328350, SerialToParallel.sumOfSquares(IntStream.range(0, 100)));
	}

	@Test
	public void test1() {
		assertEquals(2646700, SerialToParallel.sequentialSumOfSquares(IntStream.range(0, 200)));
	}

	// 并行化处理数据累加,能够较为有效的缩短运算时间
	@Test
	public void test2() {
		assertEquals(2646700, SerialToParallel.sumOfSquares(IntStream.range(0, 200)));
	}
}
