package com.insightfullogic.java8.test.chapter6;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import com.insightfullogic.java8.answers.chapter6.BuggyReduce;

public class BuggyReduceTest {

	@Test
	public void testMultiplyThroughBuggyFixed() {
		int result = BuggyReduce.multiplyThroughBuggyFixed(Arrays.asList(1, 2, 3, 4));
		assertEquals(120, result);
	}

}
