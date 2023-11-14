package org.lessons.java;

public class Televisori extends Prodotto {
	private int dimensioni;
	private boolean smart;
	
	public Televisori(String nome, String descrizione, float prezzo, float iva, int dimensioni, boolean smart) {
		super(nome, descrizione, prezzo, iva);
		setDimensioni(dimensioni);
		setSmart(smart);
		
	}

	public int getDimensioni() {
		return dimensioni;
	}

	public void setDimensioni(int dimensioni) {
		this.dimensioni = dimensioni;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	
	@Override
	public String toString() {
		
		return super.toString()
		+ "dimensioni: " + getDimensioni() + "\n"
		+ "Smart: " + isSmart() + "\n";
	}
	
}
