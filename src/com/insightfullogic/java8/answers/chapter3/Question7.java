package com.insightfullogic.java8.answers.chapter3;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Question7 {

	// 获取字符串中的小写字母个数
	public static int countLowercaseLetters(String string) {
		return (int) string.chars()             //chars返回IntStream
				.filter(Character::isLowerCase)
				.count();
	}

	// 找出字符串列表中,包含最多小写字母的字符串
	public static Optional<String> mostLowercaseString(List<String> strings) {
		return strings.stream()
				.max(Comparator.comparing(Question7::countLowercaseLetters));
	}
}
