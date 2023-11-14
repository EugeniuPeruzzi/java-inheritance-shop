package org.lessons.java;

public class Smartphone extends Prodotto{

	private String imei;
	private int ram;
	
	public Smartphone(String nome, String descrizione, float prezzo, float iva, String imei, int ram) {
		super(nome, descrizione, prezzo, iva);
		
		setImei(imei);
		setRam(ram);
		
	}
	

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}
	
	
	@Override
	public String toString() {
		
		return super.toString() 				
				+ "ram: " + getRam() + "\n"
				+ "imei: " + getImei() + "\n";
	}

}
