package org.lessons.java;

public class Televisori extends Prodotto {
	private int dimensioni;
	private boolean smart;
	
	public Televisori(String nome, String descrizione, float prezzo, float iva, boolean fidelity, int dimensioni, boolean smart) {
		super(nome, descrizione, prezzo, iva, fidelity);
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
	public float calcolaPrezzoScontato() {
	    float prezzoIvato = getPrezzoIvato();
	    if (isFidelity()) {
	        if (!isSmart()) {
	            float sconto = prezzoIvato * 0.10f;
	            return prezzoIvato - sconto;
	        } else {
	            float sconto = prezzoIvato * 0.02f;
	            return prezzoIvato - sconto;
	        }

	    } 
	    else {
	        return prezzoIvato;
	    }

	}
	
	@Override
	public String toString() {
		
		return super.toString()
		+ "Dimensione schermo: " + getDimensioni() + "\n"
		+ "Smart: " + isSmart() + "\n";
	}
	
	
}
