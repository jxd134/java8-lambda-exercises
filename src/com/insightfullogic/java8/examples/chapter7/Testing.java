package com.insightfullogic.java8.examples.chapter7;

import java.util.List;
import java.util.logging.Logger;

import static java.util.stream.Collectors.toList;

public class Testing {

	private static final Logger logger = Logger.getLogger("LambdaTesting");

	public static List<String> allToUpperCase(List<String> words) {
		return words.stream().map(string -> string.toUpperCase()).collect(toList());
	}

}
