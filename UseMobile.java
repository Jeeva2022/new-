package com.revision1;

public class UseMobile {
	public static void main (String[]args) {
		
		Mobile mob1 = new Mobile ();
		
		mob1.brand = "Apple";
		mob1.price = 10000;
		mob1.color = "Black";
		
		Mobile mob2 = new Mobile ();
		
		mob2.brand = "oppo";
		mob2.price = 8000;
		mob2.color = "white";
		
		Mobile mob3 = new Mobile ();
		
		mob3.brand = "vivo";
		mob3.price = 7000;
		mob3.color = "blue";
		
		if (mob1.price<mob2.price&&mob1.price<mob3.price) {
			System.out.println(mob1.brand.toUpperCase()+", "+mob1.price+", "+mob1.color.toLowerCase());
			
		}
		else if (mob2.price<mob1.price&&mob2.price<mob3.price) {
			System.out.println(mob2.brand.toUpperCase()+", "+mob2.price+", "+mob2.color.toLowerCase());
		}
		else if (mob3.price<mob1.price&&mob3.price<mob2.price) {
			System.out.println(mob3.brand.toUpperCase()+", "+mob3.price+", "+mob3.color.toLowerCase());
		}
		
		
		
		
		
		
	}

}
