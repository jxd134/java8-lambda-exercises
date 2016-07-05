package com.insightfullogic.java8.answers.chapter3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FilterUsingReduce {

	public static <I, O> List<O> map(Stream<I> stream, Function<I, O> mapper) {
		
		// reduce参数列表:(List<O> identity, BiFunction<List<O>, ? super I, List<O>> accumulator, BinaryOperator<List<O>> combiner)
		return stream.reduce(new ArrayList<O>(), (acc, x) -> {
			// map接受的Lambda表达式必须是Function接口的一个实例
			// 此处通过Function接口实现数值转换,达到类似效果
			// 每一次操作返回List<O>对象newAcc传递给combiner接口
			List<O> newAcc = new ArrayList<>(acc);
			newAcc.add(mapper.apply(x));
			return newAcc;
			
		}, (List<O> left, List<O> right) -> {
			// left为上次计算保留的List<O>，初始值为new ArrayList<O>()
			// combiner接口将accumulator返回的数值添加全部添加至newLeft
			// 不直接添加的原因是Lambda的特性,局部变量在既成事实上必须是final类型的
			List<O> newLeft = new ArrayList<>(left);
			newLeft.addAll(right);
			return newLeft;
			
		});
	}
}
