package com.insightfullogic.java8.test.chapter5;

import static org.junit.Assert.*;
import static java.util.Arrays.asList;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.junit.Test;

import com.insightfullogic.java8.answers.chapter5.GroupingBy;

public class GroupingByTest {

	@Test
	public void testGroupingBy() {
		GroupingBy<String, Integer> stringIntegerGroupingBy = new GroupingBy<>(String::length);
		Map<Integer, List<String>> results = Stream.of("a", "b", "cc", "dd").collect(stringIntegerGroupingBy);

		System.out.println(results);

		assertEquals(2, results.size());
		assertEquals(asList("a", "b"), results.get(1));
		assertEquals(asList("cc", "dd"), results.get(2));
	}

}
