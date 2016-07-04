package com.insightfullogic.java8.answers.chapter2;

import org.junit.Test;

import javax.swing.*;

import java.text.DateFormat;
import java.util.Date;
import java.util.function.Function;
import java.util.function.Predicate;

//see : https://github.com/junit-team/junit4/wiki/Assertions
import static org.junit.Assert.assertEquals;

public class LambdaExercises {

	@Test
	public void chapter2_1b() {
		Function<Double, Double> negate = (x) -> -1 * x;
		Function<Double, Double> square = (x) -> x * x;
		Function<Double, Double> percent = (x) -> 100 * x;
		assertEquals(negate.apply(1.0), -1.0, 1e-10);
		assertEquals(square.apply(11.0), 121, 1e-10);
		assertEquals(percent.apply(1.0), 100, 1e-10);
	}

	@Test
	public void chapter2_1c() {
		Function<Integer, Integer> one = x -> x + 1;
		// 2 isn't
		Function<Integer, Boolean> three = x -> x == 1;
		assertEquals(one.apply(1), Integer.valueOf(1)); //注意类型匹配,否则导致assertEquals二义性
		assertEquals(three.apply(1), true);
	}
}
