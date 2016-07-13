package com.insightfullogic.java8.answers.chapter4;

import java.util.stream.Stream;

import com.insightfullogic.java8.examples.chapter1.Artist;

public interface Performance {
	
	public String getName();
	
	public Stream<Artist> getMusicians();
}
