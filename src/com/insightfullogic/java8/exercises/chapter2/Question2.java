package com.insightfullogic.java8.exercises.chapter2;

import java.text.DateFormat;

public class Question2 {

	public static ThreadLocal<DateFormat> formatter = ThreadLocal.withInitial(() -> DateFormat.getInstance());

}
