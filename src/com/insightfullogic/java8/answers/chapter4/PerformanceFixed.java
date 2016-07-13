package com.insightfullogic.java8.answers.chapter4;

import java.util.stream.Stream;

import com.insightfullogic.java8.examples.chapter1.Artist;

import static java.util.stream.Stream.concat;

public interface PerformanceFixed {

	public String getName();

	public Stream<Artist> getMusicians();

	public default Stream<Artist> getAllMusicians() {
		return getMusicians()
				.flatMap(artist -> concat(Stream.of(artist), artist.getMembers()));
	}
}
