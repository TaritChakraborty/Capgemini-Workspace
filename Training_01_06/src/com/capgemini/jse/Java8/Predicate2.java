package com.capgemini.jse.Java8;

import java.util.Scanner;
import java.util.function.Predicate;

public class Predicate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Predicate<Integer> obj1 = i -> i > 3;
		System.out.println(obj1.test(str.length()));
        sc.close();
	}
}
