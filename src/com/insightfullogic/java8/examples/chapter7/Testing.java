package com.insightfullogic.java8.examples.chapter7;

import java.util.List;
import java.util.logging.Logger;

import static java.util.stream.Collectors.toList;

public class Testing {

	private static final Logger logger = Logger.getLogger("LambdaTesting");

	public static List<String> allToUpperCase(List<String> words) {
		return words.stream().map(string -> string.toUpperCase()).collect(toList());
	}

	public static List<String> elementFirstToUpperCaseLambdas(List<String> strings) {
		return strings.stream().map(string -> {
			char firstChar = Character.toUpperCase(string.charAt(0));
			return firstChar + string.substring(1);
		}).collect(toList());
	}

	// 将字符串转换抽取成为单独的函数,既可以实现单独测试
	public static String firstTpUpperCase(String string) {
		char firstChar = Character.toUpperCase(string.charAt(0));
		return firstChar + string.substring(1);
	}

	public static List<String> elementFirstToUpperCase(List<String> strings) {
		return strings.stream().map(Testing::firstTpUpperCase).collect(toList());
	}
}
