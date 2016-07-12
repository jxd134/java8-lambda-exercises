package com.insightfullogic.java8.test.chapter3;

import static org.junit.Assert.*;

import org.junit.Test;

import com.insightfullogic.java8.answers.chapter3.Question6;

public class Question6Test {

	@Test
	public void noLowercaseLettersInAnEmptyString() {
		assertEquals(0, Question6.countLowercaseLetters(""));
	}

	@Test
	public void countsLowercaseLetterExample() {
		assertEquals(6, Question6.countLowercaseLetters("abFFGGHjstyWWQ"));
	}

	@Test
	public void suppoertsNoLowercaseLetters() {
		assertEquals(0, Question6.countLowercaseLetters("ABCDEF"));
	}
}
