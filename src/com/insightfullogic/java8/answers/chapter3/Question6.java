package com.insightfullogic.java8.answers.chapter3;

public class Question6 {

	// ��ȡ�ַ����е�Сд��ĸ����
	public static int countLowercaseLetters(String string) {
		
		return (int) string.chars()                      // chars����IntStream
				.filter(Character::isLowerCase).count();
	}
}
