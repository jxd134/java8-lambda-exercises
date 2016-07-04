package com.insightfullogic.java8.answers.chapter1;

import java.util.List;
import java.util.stream.Stream;

import com.insightfullogic.java8.examples.chapter1.Album;
import com.insightfullogic.java8.examples.chapter1.Artist;

import static java.util.stream.Collectors.toList;

public class Question1 {

	public static int addUp(Stream<Integer> numbers) {
		return numbers.reduce(0, (acc, element) -> acc + element);
	}

	public static List<String> getNamesAndOriginsOfArtists(List<Artist> artists) {
		return artists.stream()
				.flatMap(artist -> Stream.of(artist.getName(), artist.getNationality()))
				.collect(toList());
	}

	public static List<Album> getAlbumsWithAtMostThreeTracks(List<Album> albums) {
		return albums.stream()
				.filter(album -> album.getTrackList().size() <= 3)
				.collect(toList());
	}
}
