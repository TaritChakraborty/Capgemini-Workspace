package com.capgemini.jse.Java8;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Predicate3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(100);
		l1.add(101);
		l1.add(102);
		l1.add(103);
		l1.clear();
		Predicate<ArrayList<Integer>> obj2 = lobj -> lobj.isEmpty();
		System.out.println(obj2.test(l1));

	}

}
