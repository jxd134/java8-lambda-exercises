package com.insightfullogic.java8.test.chapter5;

import static org.junit.Assert.*;
import static java.util.Arrays.asList;

import org.junit.Test;
import java.util.Collections;

import com.insightfullogic.java8.answers.chapter5.*;

public class Question1Test {

	@Test
	public void testQuestion1_a() {
		assertEquals(Collections.emptyList(), Question1.question1_a(Collections.emptyList()));
		assertEquals(asList("AA", "BB", "CCC"), Question1.question1_a(asList("aa", "bB", "cCc")));
	}

	@Test
	public void testQuestion1_b() {
		assertEquals(0, Question1.question1_b(Collections.emptyList()));
		assertEquals(6, Question1.question1_b(asList(1, 2, 3)));
	}

	@Test
	public void testQuestion1_c() {
		assertEquals(Collections.emptyList(), Question1.question1_c(Collections.emptyList(), Collections.emptyList()));
		assertEquals(asList(1, 2, 3), Question1.question1_c(Collections.emptyList(), asList(1, 2, 3)));
		assertEquals(asList(1, 3, 5, 2, 4, 6), Question1.question1_c(asList(1, 3, 5), asList(2, 4, 6)));
	}

}
