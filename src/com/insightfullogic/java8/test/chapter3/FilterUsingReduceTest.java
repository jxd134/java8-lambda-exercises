package com.insightfullogic.java8.test.chapter3;

import static org.junit.Assert.*;
import static java.util.Arrays.asList;

import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import org.junit.Test;

import com.insightfullogic.java8.answers.chapter3.FilterUsingReduce;

public class FilterUsingReduceTest {

	@Test
	public void emptyList() {
		assertFiltered(x -> false, Collections.<Object> emptyList(), Collections.<Object> emptyList());
	}

	@Test
	public void trueReturnsEverything() {
		assertFiltered((Integer x) -> true, asList(1, 2, 3), asList(1, 2, 3));
	}

	@Test
	public void filterPartOfList() {
		assertFiltered((Integer x) -> x > 2, asList(1, 2, 3), asList(3));
	}

	private <I> void assertFiltered(Predicate<I> predicate, List<I> input, List<I> exceptedOutput) {
		List<I> output = FilterUsingReduce.filter(input.stream(), predicate);
		assertEquals(exceptedOutput, output);

		List<I> parallelOutput = FilterUsingReduce.filter(input.parallelStream(), predicate);
		assertEquals(exceptedOutput, output);
	}

}
