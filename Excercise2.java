package com.revision1;

public class Excercise2 {
	public static void main (String[]args) {
		String he = "jeeva";
		int num = he.length();
		
		if (num>5) {
			System.out.println(he.charAt(0));
		}
		else if(num<5) {
			System.out.println(he.charAt(he.length()-1));		
		}
	else {
		System.out.println(he.toUpperCase()+" "+he.toLowerCase());
	}
		
	}

}
