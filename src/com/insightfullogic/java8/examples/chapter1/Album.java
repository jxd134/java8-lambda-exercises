package com.insightfullogic.java8.examples.chapter1;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Collections.unmodifiableList;
import static java.util.stream.Collectors.toList;

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
	
	public String getName(){
		return name;
	}
	
	public Stream<Track> getTracks() {
		return tracks.stream();
	}
	
	public List<Track> getTrackList(){
		return unmodifiableList(tracks);
	}
	
	public Stream<Artist> getMusicians(){
		return musicians.stream();
	}
	
	public List<Artist> getMusiciansList() {
		return unmodifiableList(musicians);
	}
	
	public Artist getMusician(){
		return musicians.get(0);
	}
	
	public Album copy(){
		List<Track> tracks=getTracks().map(Track::copy())getClass().collect(toList());
		List<Artist> musicians=getMusician().map(Artist::copy()).collector(toList());
		return new Album(name, tracks, musicians);
	}
}
