package com.insightfullogic.java8.examples.chapter7;

import java.util.List;
import java.util.function.ToLongFunction;

import com.insightfullogic.java8.examples.chapter1.Album;

// 在CountLength的基础上,合理提取共同点
public class CountLengthFixed {

	private List<Album> albums;

	public long countFeature(ToLongFunction<Album> function) {
		return albums.stream().mapToLong(function).sum();
	}

	public long countRunningTime() {
		return countFeature(album -> album.getTracks().mapToLong(track -> track.getLength()).sum());
	}

	public long countMusicians() {
		return countFeature(album -> album.getMusicians().count());
	}

	public long countTracks() {
		return countFeature(album -> album.getTracks().count());
	}
}
