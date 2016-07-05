package com.insightfullogic.java8.answers.chapter3;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Question7 {

	// ��ȡ�ַ����е�Сд��ĸ����
	public static int countLowercaseLetters(String string) {
		return (int) string.chars()             //chars����IntStream
				.filter(Character::isLowerCase)
				.count();
	}

	// �ҳ��ַ����б���,�������Сд��ĸ���ַ���
	// ����Optional���������,���http://www.importnew.com/6675.html
	public static Optional<String> mostLowercaseString(List<String> strings) {
		return strings.stream()
				.max(Comparator.comparing(Question7::countLowercaseLetters));
	}
}
