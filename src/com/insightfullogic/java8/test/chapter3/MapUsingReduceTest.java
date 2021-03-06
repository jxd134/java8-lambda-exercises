package com.insightfullogic.java8.test.chapter3;

import static org.junit.Assert.*;
import static java.util.Arrays.asList;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import org.junit.Test;

import com.insightfullogic.java8.answers.chapter3.*;

public class MapUsingReduceTest {

	@Test
	public void emptyList() {
		assertMapped(Function.<Object> identity(), Collections.<Object> emptyList(), Collections.<Object> emptyList());
	}

	@Test
	public void identityMapsToItself() {
		assertMapped((Integer x) -> x, asList(1, 2, 3), asList(1, 2, 3));
	}

	@Test
	public void incrementingNumbers() {
		assertMapped((Integer x) -> x + 2, asList(1, 2, 3), asList(3, 4, 5));
	}

	@Test
	public void convertIntegerToBooleanTest() {
		assertMapped((Integer x) -> {
			return x >= 0 ? true : false;
		}, asList(1, -2, 3, 0, -11), asList(true, false, true, true, false));
	}

	private <I, O> void assertMapped(Function<I, O> mapper, List<I> input, List<O> expectedOutput) {
		List<O> output = MapUsingReduce.map(input.stream(), mapper);
		assertEquals(expectedOutput, output);

		List<O> paralleOutPut = MapUsingReduce.map(input.parallelStream(), mapper);
		assertEquals(expectedOutput, paralleOutPut);
	}

}
