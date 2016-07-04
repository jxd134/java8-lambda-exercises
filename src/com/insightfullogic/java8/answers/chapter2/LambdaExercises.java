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
		assertEquals(one.apply(1), Integer.valueOf(2)); // 注意类型匹配,否则导致assertEquals二义性
		assertEquals(three.apply(1), true);
	}

	@Test
	public void chapter2_2b() {
		ThreadLocal<DateFormat> threadSafeFormatter = ThreadLocal.withInitial(() -> DateFormat.getDateInstance());
		DateFormat formatter = threadSafeFormatter.get();
		assertEquals("1970-1-1", formatter.format(new Date(0)));
	}

	@Test
	public void chapter2_3a() {
		// pass,Runnable是多线程接口
		Runnable helloWorld = () -> System.out.println("Hello World!");
		helloWorld.run();
	}
	
	@Test
	public void chapter2_3b(){
		// pass
		JButton jButton=new JButton();
		jButton.addActionListener(event->System.out.println(event.getActionCommand()));
	}
}
