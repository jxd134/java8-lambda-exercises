package com.insightfullogic.java8.answers.chapter3;

public class Question6 {

	// 获取字符串中的小写字母个数
	public static int countLowercaseLetters(String string) {
		
		return (int) string.chars()                      // chars返回IntStream
				.filter(Character::isLowerCase).count();
	}
}
