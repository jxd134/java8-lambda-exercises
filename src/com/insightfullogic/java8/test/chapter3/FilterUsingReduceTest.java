package com.insightfullogic.java8.test.chapter3;

import static org.junit.Assert.*;

import java.util.List;
import java.util.function.Predicate;

import org.junit.Test;

import com.insightfullogic.java8.answers.chapter3.FilterUsingReduce;

public class FilterUsingReduceTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	private <I> void assertFiltered(Predicate<I> predicate, List<I> input, List<I> exceptedOutput) {
		List<I> output = FilterUsingReduce.filter(input.stream(), predicate);
		assertEquals(exceptedOutput, output);

		List<I> parallelOutput = FilterUsingReduce.filter(input.parallelStream(), predicate);
		assertEquals(exceptedOutput, output);
	}

}
