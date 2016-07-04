package com.insightfullogic.java8.answers.chapter3;

import java.util.List;

import com.insightfullogic.java8.examples.chapter1.Artist;

public class Question2 {

	// int totalMembers=0;
	// for(Artist artist:artists)
	// {
	// Stream<Artist> members = artist.getMembers();
	// totalMembers += members.count();
	// }

	public static int countBandMembersInternal(List<Artist> artists) {
		return artists.stream()
				.map(artist -> artist.getMembers().count()) 
				.reduce(0L, Long::sum).intValue();           //后续需要琢磨
	}
}
