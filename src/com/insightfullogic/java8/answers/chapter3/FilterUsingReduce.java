package com.insightfullogic.java8.answers.chapter3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FilterUsingReduce {

	public static <I, O> List<O> map(Stream<I> stream, Function<I, O> mapper) {
		
		// reduce�����б�:(List<O> identity, BiFunction<List<O>, ? super I, List<O>> accumulator, BinaryOperator<List<O>> combiner)
		return stream.reduce(new ArrayList<O>(), (acc, x) -> {
			// map���ܵ�Lambda���ʽ������Function�ӿڵ�һ��ʵ��
			// �˴�ͨ��Function�ӿ�ʵ����ֵת��,�ﵽ����Ч��
			// ÿһ�β�������List<O>����newAcc���ݸ�combiner�ӿ�
			List<O> newAcc = new ArrayList<>(acc);
			newAcc.add(mapper.apply(x));
			return newAcc;
			
		}, (List<O> left, List<O> right) -> {
			// leftΪ�ϴμ��㱣����List<O>����ʼֵΪnew ArrayList<O>()
			// combiner�ӿڽ�accumulator���ص���ֵ���ȫ�������newLeft
			// ��ֱ����ӵ�ԭ����Lambda������,�ֲ������ڼȳ���ʵ�ϱ�����final���͵�
			List<O> newLeft = new ArrayList<>(left);
			newLeft.addAll(right);
			return newLeft;
			
		});
	}
}
