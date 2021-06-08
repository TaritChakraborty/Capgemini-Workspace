package com.capgemini.jse.Java8;

import java.util.TreeSet;

public class SortTreeSetLambda {

	public static void main(String[] args) {
	/*	ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(0);
		l.add(5);
		l.add(20);
		
		
		System.out.println("before sorting: " + l);
		Collections.sort(l,(i1,i2)->(i1<i2)?-1:(i1>i2)?1:0);
		
		System.out.println("after sorting: " + l); */
		TreeSet<Integer> l = new TreeSet<Integer>((i1,i2) -> (i1>i2) ? -1 : (i1<i2) ? 1 : 0);
		l.add(10);
		l.add(0);
		l.add(5);
		l.add(20);
		
		System.out.println("Sorted TreeSet : " + l);

	}

}
