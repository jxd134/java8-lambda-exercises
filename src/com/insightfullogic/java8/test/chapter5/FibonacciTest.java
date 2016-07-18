package com.insightfullogic.java8.test.chapter5;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.Test;

import com.insightfullogic.java8.answers.chapter5.Fibonacci;

public class FibonacciTest {

	@Test
	public void testFibonacci() {

		List<Long> fibonacciSequence = Arrays.asList(0L, 1L, 1L, 2L, 3L, 5L, 8L, 13L, 21L, 34L, 55L);

		// 很巧妙也很美妙的做法
		IntStream.range(0, fibonacciSequence.size()).forEach(x -> {
			Fibonacci fibonacci = new Fibonacci();
			long result = fibonacci.fibonacci(x);
			long expectedResult = fibonacciSequence.get(x);
			assertEquals(expectedResult, result);
		});
	}

}
