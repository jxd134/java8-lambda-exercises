package com.insightfullogic.java8.test.chapter4;

import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.Test;

import com.insightfullogic.java8.answers.chapter4.ArtistsFixed;
import com.insightfullogic.java8.examples.chapter1.Artist;
import com.insightfullogic.java8.examples.chapter1.SampleData;

public class ArtistsFixedTest {

	private final ArtistsFixed optionalExamples = new ArtistsFixed(SampleData.getThreeAtrists());

	@Test
	public void indexWithinRange() {
		Optional<Artist> artist = optionalExamples.getArtist(0);
		assertTrue(artist.isPresent());
	}

	@Test
	public void indexOutsideRange() {
		Optional<Artist> artist = optionalExamples.getArtist(5);
		assertFalse(artist.isPresent());
	}

	@Test
	public void getNameWithinRange() {
		String artist = optionalExamples.getArtistName(1);
		assertEquals("John Lennon", artist);
	}

	@Test
	public void getNameOutsideRange() {
		String artist = optionalExamples.getArtistName(5);
		assertEquals("unknown", artist);
	}

}
