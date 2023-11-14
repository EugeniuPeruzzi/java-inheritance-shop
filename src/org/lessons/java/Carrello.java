package org.lessons.java;

public class Carrello {

	public static void main(String[] args) {
		
		Smartphone s1 = new Smartphone("Iphone", "D1" , 190.22f, 22, "12398510598835619", 16);
		Televisori t1 = new Televisori("Sony", "D1" , 250.32f, 22, 17, false);
		Cuffie c1 = new Cuffie("Sony", "D1" , 35.36f, 22, "rosso", true);


		
		System.out.println(c1);
		System.out.println(t1);
		System.out.println(s1);
	}

}
