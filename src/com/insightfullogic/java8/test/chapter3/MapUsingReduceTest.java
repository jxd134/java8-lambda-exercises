package com.insightfullogic.java8.test.chapter3;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import org.junit.Test;

import com.insightfullogic.java8.answers.chapter3.*;

public class MapUsingReduceTest {
	
	@Test
	public void emptyList(){
		assertMapped(Function.<Object>identity(), Collections.<Object>emptyList(), Collections.<Object>emptyList());
	}

	private <I,O> void assertMapped(Function<I,O> mapper,List<I> input,List<O> expectedOutput){
		List<O> output=MapUsingReduce.map(input.stream(), mapper);
		assertEquals(expectedOutput, output);
	}
	
}
