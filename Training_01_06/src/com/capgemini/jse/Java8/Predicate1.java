package com.capgemini.jse.Java8;

import java.util.function.Predicate;

// Predicate to check whether a number is greater than 10 or not
public class Predicate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p = i -> i>10;
		System.out.println(p.test(1000));
	}

}