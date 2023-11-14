package org.lessons.java;

import java.util.Random;

public class Prodotto {
    private int codice;
    private String nome;
    private String descrizione;
    private float prezzo;
    private float iva;
    private boolean fidelity;

	// Costruttore
    public Prodotto(String nome, String descrizione, float prezzo, float iva, boolean fidelity) {
        setCodice(codice);
        setNome(nome);
        setDescrizione(descrizione);
        setPrezzo(prezzo);
        setIva(iva);
        setFidelity(fidelity);

    }
    

	Random rnd = new Random();

    // Metodi Getter
    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public float getIva() {
        return iva;
    }
    
    public float getPrezzoIvato() {
    	return prezzo+(prezzo * iva / 100);
    }
    
    public String getCodeName() {
    	return codice + "-" + nome;
    }
    
    public String getCodeFormat() {
    	return String.format("%08d", getCodice());
    }

    public boolean isFidelity() {
		return fidelity;
	}

    
    
    // Metodi Setter

	public void setFidelity(boolean fidelity) {
		this.fidelity = fidelity;
	}

    private void setCodice(int codice) {
        this.codice = rnd.nextInt(1, 1000);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }
    
    //funzione
    public float calcolaPrezzoScontato() {
        float scontoBase = 0.02f;
        float prezzoIvato = getPrezzoIvato();
        if (isFidelity()) {
            float sconto = prezzoIvato * scontoBase;
            return prezzoIvato - sconto;
        } else {
            return prezzoIvato; // Nessuno sconto
        }
    }
    
    
	@Override
	public String toString() {
		System.out.println("\n----------------------------");
		return "Prodotto:\n"
				+ "Codice: " + getCodeFormat() + "\n"
				+ "Nome: " + getNome() + "\n"
				+ "Descrizione: " + getDescrizione() + "\n"
				+ "Prezzo: " + getPrezzo() + "$\n"
				+ "Iva: " + getIva() + "%\n"
				+ "Tessera: " + isFidelity() + "\n"
				+ "Prezzo ivato: " + getPrezzoIvato() + "$\n"
				+ "Nome completo: " + getCodeName() + "\n"
				+ "Prezzo scontato: " + calcolaPrezzoScontato() + "\n";



	}
}

