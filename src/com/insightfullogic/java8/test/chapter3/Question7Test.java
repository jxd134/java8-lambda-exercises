package com.insightfullogic.java8.test.chapter3;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

import org.junit.Test;

import com.insightfullogic.java8.answers.chapter3.Question7;

public class Question7Test {

	@Test
	public void noStringReturnedForEmptyList() {
		assertFalse(Question7.mostLowercaseString(Collections.<String> emptyList()).isPresent());
	}

	@Test
	public void findsMostLowercaseString() {
		Optional<String> result = Question7.mostLowercaseString(Arrays.asList("a", "abc", "ABCde"));
		assertEquals(result, Optional.of("abc")); // 注意optional的用法
	}

}
