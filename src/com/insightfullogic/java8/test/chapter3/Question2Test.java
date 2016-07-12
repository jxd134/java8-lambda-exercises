package com.insightfullogic.java8.test.chapter3;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import com.insightfullogic.java8.answers.chapter3.Question2;
import com.insightfullogic.java8.examples.chapter1.SampleData;

public class Question2Test {

	@Test
	public void testCountBandMembersInternal() {
		assertEquals(4,
				Question2.countBandMembersInternal(Arrays.asList(SampleData.johnColtrane, SampleData.theBeatles)));
	}

}
