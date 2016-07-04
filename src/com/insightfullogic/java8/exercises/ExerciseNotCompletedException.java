package com.insightfullogic.java8.exercises;

@SuppressWarnings("serial")
public class ExerciseNotCompletedException extends RuntimeException {

	public ExerciseNotCompletedException() {
		super("Please remove this line of code and implement the exercise");
	}
}
