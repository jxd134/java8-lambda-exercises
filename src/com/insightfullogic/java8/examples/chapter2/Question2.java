package com.insightfullogic.java8.examples.chapter2;

import java.text.DateFormat;

public class Question2 {

	public static ThreadLocal<DateFormat> threadSafeDateFormat = ThreadLocal.withInitial(() -> DateFormat.getDateInstance());

}
