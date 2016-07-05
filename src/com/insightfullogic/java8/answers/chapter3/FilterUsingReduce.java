package com.insightfullogic.java8.answers.chapter3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterUsingReduce {
	
	public static <I> List<I> filter(Stream<I> stream,Predicate<I> predicate){
	
		List<I> initial = new ArrayList<>();
		return stream.reduce(initial,
							(acc,x)->{
								if(predicate.test(x)){
									List<I> newAcc=new ArrayList<I>(acc);
									newAcc.add(x);
									return newAcc;
								}else{
									return acc;
								}
							}
						},FilterUsingReduce::combineLists);
	}


	private static <I> List<I> combinLists(List<I> left,List<I> right){
		List<I> newLeft=new ArrayList<>(left);
		newLeft.addAll(right);
		return newLeft;
	}
}
