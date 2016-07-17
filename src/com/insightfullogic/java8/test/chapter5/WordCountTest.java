package com.insightfullogic.java8.test.chapter5;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.stream.Stream;

import org.junit.Test;

import com.insightfullogic.java8.answers.chapter5.WordCount;

public class WordCountTest {

	@Test
	public void testCountWords() {

		Stream<String> names = Stream.of("John", "Paul", "George", "John", "Paul", "John");
		Map<String, Long> countWords = WordCount.countWords(names);

		assertEquals(3, countWords.size());
		assertEquals(Long.valueOf(3), countWords.get("John"));
		assertEquals(Long.valueOf(2), countWords.get("Paul"));
		assertEquals(Long.valueOf(1), countWords.get("George"));
	}

}
