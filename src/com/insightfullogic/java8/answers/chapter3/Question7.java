package com.insightfullogic.java8.answers.chapter3;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Question7 {

	// 找出字符串列表中,包含最多小写字母的字符串
	// 关于Optional的相关资料,详见http://www.importnew.com/6675.html
	public static Optional<String> mostLowercaseString(List<String> strings) {
		return strings.stream()
				.max(Comparator.comparing(Question6::countLowercaseLetters));
	}
}
