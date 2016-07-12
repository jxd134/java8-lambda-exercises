package com.insightfullogic.java8.test.chapter3;

import org.junit.Test;
import java.util.stream.Stream;

import com.insightfullogic.java8.answers.chapter3.*;

import static org.junit.Assert.*;

public class Question1Test {

	@Test
	public void testAddUpWithEmptyList() {
		int result = Question1.addUp(Stream.empty());
		assertEquals(0, result);
	}

	@Test
	public void testAddUpWithValues() {
		int result = Question1.addUp(Stream.of(1, 3, -2));
		assertEquals(2, result);
	}

}
