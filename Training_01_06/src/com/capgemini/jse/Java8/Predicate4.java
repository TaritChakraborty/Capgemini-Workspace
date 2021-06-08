package com.capgemini.jse.Java8;

import java.util.function.Predicate;

public class Predicate4 {
	public static void m1(Predicate<String> p,String[] x)
	{		
		for(String x1 : x)
		{
			if(p.test(x1))
				System.out.println(x1);
		}
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] x = {"toy" , "roof" , "book" , "rail" , "road"};		
		Predicate<String> p1 = a -> a.charAt(0) == 'r';		
		System.out.println("String starting with r: ");
		m1(p1,x);
	}
}

