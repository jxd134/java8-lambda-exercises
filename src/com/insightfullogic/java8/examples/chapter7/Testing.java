package com.insightfullogic.java8.examples.chapter7;

import java.util.List;
import java.util.Set;

import com.insightfullogic.java8.examples.chapter1.Album;
import com.insightfullogic.java8.examples.chapter1.Artist;

import static java.util.stream.Collectors.toSet;
import static java.util.stream.Collectors.toList;

import java.util.HashSet;

public class Testing {

	public static List<String> allToUpperCase(List<String> words) {
		return words.stream().map(string -> string.toUpperCase()).collect(toList());
	}

	public static List<String> elementFirstToUpperCaseLambdas(List<String> strings) {
		return strings.stream().map(string -> {
			char firstChar = Character.toUpperCase(string.charAt(0));
			return firstChar + string.substring(1);
		}).collect(toList());
	}

	// ���ַ���ת����ȡ��Ϊ�����ĺ���,�ȿ���ʵ�ֵ�������
	public static String firstTpUpperCase(String string) {
		char firstChar = Character.toUpperCase(string.charAt(0));
		return firstChar + string.substring(1);
	}

	public static List<String> elementFirstToUpperCase(List<String> strings) {
		return strings.stream().map(Testing::firstTpUpperCase).collect(toList());
	}

	// ��־�ʹ�ӡ��Ϣ
	public static Set<String> imperativeNationalityReport(Album album) {
		Set<String> nationalities = new HashSet<>();
		for (Artist artist : album.getMusiciansList()) {
			if (artist.getName().startsWith("The")) {
				String nationality = artist.getNationality();
				System.out.println("Found nationality: " + nationality);
				nationalities.add(nationality);
			}
		}
		return nationalities;
	}

	public static Set<String> forEachLoggingFailure(Album album) {
		album.getMusicians()
				.filter(artist -> artist.getName().startsWith("The"))
				.map(artist -> artist.getNationality())
				.forEach(nationality -> System.out.println("Found: " + nationality));

		Set<String> nationalities = album.getMusicians()
				.filter(artist -> artist.getName().startsWith("The"))
				.map(artist -> artist.getNationality()).collect(toSet());
		return nationalities;
	}
	
	// ʹ��peek�����ڽ����������Ӷϵ��Ա����
	public static Set<String> nationalityReportUsingPeek(Album album) {
		Set<String> nationalities = album.getMusicians()
				.filter(artist -> artist.getName().startsWith("The"))
				.map(artist -> artist.getNationality())
				.peek(nation -> System.out.println("Found nationality: " + nation))
				.collect(toSet());
		return nationalities;
	}
}
