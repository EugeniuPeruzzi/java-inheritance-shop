package org.lessons.java;

import java.util.Scanner;

public class Carrello {

	public static void main(String[] args) {
		// take input from user and store in varaibles
		Scanner in = new Scanner(System.in);
		
		System.out.println("Vuoi inserire un prodotto? (Si/No)");
		String answer = in.nextLine().toLowerCase();
		
		if(answer.equalsIgnoreCase("si") || answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			System.out.println("Scegli il tipo di prodotto da inserire (Tv,Cuffie,Smartphone )");
			String prodotto = in.nextLine().toLowerCase();
			System.out.println("Inserisci il nome del prodotto");
			String nome = in.nextLine();
			System.out.println("Descrvi " + nome);
			String descrizione = in.nextLine();
			System.out.println("Prezzo");
			String prezzoString = in.nextLine();
			float prezzo = Float.valueOf(prezzoString);
			System.out.println("Iva");
			String ivaString = in.nextLine();
			float iva = Float.valueOf(ivaString);

			

			
			switch (prodotto) {
				case "tv":
					
					System.out.println("Inserisci la dimensione dello schermo:");
	                String dimensioneString = in.nextLine();
	                int dimensione = Integer.valueOf(dimensioneString);
	                
	                System.out.println("Questo televisore è smart? (si/no)");
	                
	                String isSmart = in.nextLine();
	                
	                boolean smart = true;
	                if (isSmart.equalsIgnoreCase("si")) {
	                	smart = true;
	                }
	                else {
	                	smart = false;
	                }
	                
	                Televisori t1 = new Televisori(nome, descrizione , prezzo, iva, dimensione, smart);
	                System.out.println(t1);
	                break;
	                
				case "smartphone":
					
					System.out.println("Inserisci la dimensione ram:");
	                String ramString = in.nextLine();
	                int ram = Integer.valueOf(ramString);
	                
					System.out.println("Inserisci la dimensione ram:");
	                String imei = in.nextLine();
	                
	                Smartphone s1 = new Smartphone(nome, descrizione , prezzo, iva, imei, ram);
	                System.out.println(s1);
	                break;
	                
				case "cuffie":
					
					System.out.println("Colore delle cuffie:");
	                String colore = in.nextLine();

	                
	                System.out.println("Sono Wireless? (si/no)");
	                
	                String isWireless = in.nextLine();
	                
	                boolean wireless = true;
	                if (isWireless.equalsIgnoreCase("si")) {
	                	smart = true;
	                }
	                else {
	                	smart = false;
	                }
	                
	                Cuffie c1 = new Cuffie(nome, descrizione , prezzo, iva, colore, wireless);
	                System.out.println(c1);
	                break;

			}
			
			
		}
		
		
		
//		Smartphone s1 = new Smartphone("Iphone", "D1" , 190.22f, 22, "12398510598835619", 16);
//		Televisori t1 = new Televisori("Sony", "D1" , 250.32f, 22, 17, false);
//		Cuffie c1 = new Cuffie("Sony", "D1" , 35.36f, 22, "rosso", true);
//
//
//		
//		System.out.println(t1);
//		System.out.println(s1);
		
		in.close();
	}

}
