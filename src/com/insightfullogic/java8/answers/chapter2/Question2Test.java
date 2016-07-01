package com.insightfullogic.java8.answers.chapter2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.insightfullogic.java8.exercises.chapter2.Question2;

import java.util.Calendar;

public class Question2Test {

	@Test
	public void test() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 1970);
		calendar.set(Calendar.MONTH, Calendar.JANUARY);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		String threadSafeDateFormat = Question2.threadSafeDateFormat.get().format(calendar.getTime());
		assertEquals("1970-1-1", threadSafeDateFormat);
	}

}
