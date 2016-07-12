package com.insightfullogic.java8.examples.chapter1;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class SampleData {

	public static final Artist johnColtrane = new Artist("John Coltrane", "US");

	//TheBeatles
	public static final Artist johnLennon = new Artist("John Lennon", "UK");
	public static final Artist paulMcCartney = new Artist("Paul McCartney", "UK");
	public static final Artist georgeHarrison = new Artist("George Harrison", "UK");
	public static final Artist ringoStarr = new Artist("Ringo Starr", "UK");

	public static final List<Artist> membersOfTheBeatles = Arrays.asList(johnLennon, paulMcCartney, georgeHarrison,
			ringoStarr);
	
	public static final Artist theBeatles=new Artist("The Beatles", membersOfTheBeatles,"UK");
	
	public static final Album aLoveSupreme=new Album("A Love Supreme", asList(new Track("Acknowledgement", 467), new Track("Resolution", 442)), asList(johnColtrane));
}
