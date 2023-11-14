package org.lessons.java;

import java.util.Scanner;

public class Carrello {
	static final int PRODOTTI_COUT = 10;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //inizializzo un array per inserire i prodotti
        Prodotto[] prodotti = new Prodotto[PRODOTTI_COUT];
        int i = 0;
        // un ciclo while che fin che non viene inserito qualcosa diverso da si o y o yes 
        //il programma si ferma e restituisce tutti i dati inseirti
        while (true) {
            System.out.println("Vuoi inserire un prodotto? (Si/No)");
            String answer = in.nextLine().toLowerCase();
            //il programma si ferma e stampa in console tutti i dati inseriti 
            if (!answer.equals("si") && !answer.equals("yes") && !answer.equals("y")) {
                for (int j = 0; j <i; j++) {
                    System.out.println(prodotti[j] + "\n");
                }
                break;
            }
            //domande al utente per inserire i dati
            System.out.println("Scegli il tipo di prodotto da inserire (Tv,Cuffie,Smartphone)");
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
            
            System.out.println("Hai tessera fedelta?");
            String fedeltaString = in.nextLine();
            boolean fedelta = false;
            if (fedeltaString.equalsIgnoreCase("si")) {
            	 fedelta = true;
            }

            
            
            
            
            // le varie casistiche di prodotti
            switch (prodotto) {
                case "tv":
                    System.out.println("Inserisci la dimensione dello schermo:");
                    String dimensioneString = in.nextLine();
                    int dimensione = Integer.valueOf(dimensioneString);

                    System.out.println("Questo televisore è smart? (si/no)");
                    String isSmart = in.nextLine();
                    
                    boolean smart = isSmart.equalsIgnoreCase("si");
                    // viene creata una nuova classe e per ogni classe terminata i incrementa per poterne creare un'altra
                    prodotti[i] = new Televisori(nome, descrizione, prezzo, iva, fedelta, dimensione, smart);
                    i++;
                    break;

                case "smartphone":
                    System.out.println("Inserisci la dimensione ram:");
                    String ramString = in.nextLine();
                    int ram = Integer.valueOf(ramString);

                    System.out.println("Inserisci il numero IMEI:");
                    String imei = in.nextLine();
                    // viene creata una nuova classe e per ogni classe terminata i incrementa per poterne creare un'altra
                    prodotti[i] = new Smartphone(nome, descrizione, prezzo, iva, fedelta, imei, ram);
                    i++;
                    break;

                case "cuffie":
                    System.out.println("Colore delle cuffie:");
                    String colore = in.nextLine();

                    System.out.println("Sono Wireless? (si/no)");
                    String isWireless = in.nextLine();

                    boolean wireless = isWireless.equalsIgnoreCase("si");
                    // viene creata una nuova classe e per ogni classe terminata i incrementa per poterne creare un'altra
                    prodotti[i] = new Cuffie(nome, descrizione, prezzo, iva, fedelta, colore, wireless);
                    i++;
                    break;

                default:
                    System.out.println("Prodotto non riconosciuto.");
                    break;
            
            } 
        }


        in.close();
    }
}
