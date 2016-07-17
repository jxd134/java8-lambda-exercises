package com.insightfullogic.java8.answers.chapter5;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class WordCount {

	public static Map<String, Long> countWords(List<String> strings) {
		
		//注意针对自身的引用,使用name -> name
		return strings.stream().collect(groupingBy(name -> name, counting()));
	}
}
