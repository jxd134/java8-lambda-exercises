package com.insightfullogic.java8.examples.chapter7;

import java.util.List;
import java.util.function.ToLongFunction;

import com.insightfullogic.java8.examples.chapter1.Album;

public class CountLengthFixed {
	
	private List<Album> albums;

	public long countFeature(ToLongFunction<Album> function){
		return albums.stream().mapToLong(function).sum();
	}
}
