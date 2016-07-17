package com.insightfullogic.java8.answers.chapter5;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class WordCount {

	public static Map<String, Long> countWords(Stream<String> names) {
		
		//注意针对自身的引用,使用name -> name
		return names.collect(groupingBy(name -> name, counting()));
	}
}
