package com.insightfullogic.java8.examples.chapter7;

import java.util.List;

import com.insightfullogic.java8.examples.chapter1.Album;
import com.insightfullogic.java8.examples.chapter1.Track;

public class CountLength {

	private List<Album> albums;

	public long countRunningTime() {
		long count = 0;
		for (Album album : albums) {
			for (Track track : album.getTrackList()) {
				count += track.getLength();
			}
		}
		return count;
	}

	public long countMusicians() {
		long count = 0;
		for (Album album : albums) {
			count += album.getMusiciansList().size();
		}
		return count;
	}

	public long countTracks() {
		long count = 0;
		for (Album album : albums) {
			count += album.getTrackList().size();
		}
		return count;
	}
}
