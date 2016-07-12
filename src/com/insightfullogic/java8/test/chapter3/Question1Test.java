package com.insightfullogic.java8.test.chapter3;

import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

import com.insightfullogic.java8.answers.chapter3.*;
import com.insightfullogic.java8.examples.chapter1.Album;
import com.insightfullogic.java8.examples.chapter1.SampleData;

import static org.junit.Assert.*;
import static java.util.Arrays.asList;

public class Question1Test {

	@Test
	public void testAddUpWithEmptyList() {
		int result = Question1.addUp(Stream.empty());
		assertEquals(0, result);
	}

	@Test
	public void testAddUpWithValues() {
		int result = Question1.addUp(Stream.of(1, 3, -2));
		assertEquals(2, result);
	}

	@Test
	public void testGetNamesAndOriginsOfArtists() {
		List<String> namesAndOriginsOfArtists = Question1.getNamesAndOriginsOfArtists(SampleData.getThreeAtrists());
		assertEquals(asList("John Coltrane", "US", "John Lennon", "UK", "The Beatles", "UK"), namesAndOriginsOfArtists);
	}

	@Test
	public void testFindShortAlbums() {
		List<Album> input = asList(SampleData.manyTrackAlbum, SampleData.sampleShortAlbum, SampleData.aLoveSupreme);
		List<Album> result = Question1.getAlbumsWithAtMostThreeTracks(input);
		assertEquals(asList(SampleData.sampleShortAlbum, SampleData.aLoveSupreme), result);
	}
}
