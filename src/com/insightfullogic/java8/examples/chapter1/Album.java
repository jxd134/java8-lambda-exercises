package com.insightfullogic.java8.examples.chapter1;

import java.util.List;
import java.util.Objects;

public final class Album implements Performance {
	
	private String name;
	private List<Track> tracks;
	private List<Artist> musicians;

	public Album(String name, List<Track> tracks, List<Artist> musicians) {
		Objects.requireNonNull(name);
		Objects.requireNonNull(tracks);
		Objects.requireNonNull(musicians);

		this.name = name;
		this.tracks = tracks;
		this.musicians = musicians;
	}
	
	
}
