package com.insightfullogic.java8.answers.chapter5;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Question1 {

	public static List<String> question1_a(List<String> strings) {
		return strings.stream().map(String::toUpperCase).collect(toList());
	}

	public static int question1_b(List<Integer> integers) {
		return integers.stream().reduce(0, Integer::sum);
	}

	public static List<Integer> question1_c(List<Integer> data1, List<Integer> data2) {
		return Stream.of(data1, data2).flatMap(List<Integer>::stream).collect(toList());
	}
}
