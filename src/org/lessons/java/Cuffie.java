package org.lessons.java;

public class Cuffie extends Prodotto{
	
	private String colore;
	private boolean wireless;
	
	public Cuffie(String nome, String descrizione, float prezzo, float iva, String colore, boolean wireless) {
		super(nome, descrizione, prezzo, iva);
		setColore(colore);
		setWireless(wireless);
	}
	
	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public boolean isWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}


	@Override
	public String toString() {
		
		return super.toString()
		+ "Colore: " + getColore() + "\n"
		+ "Wireless: " + isWireless() + "\n";
	}



}
