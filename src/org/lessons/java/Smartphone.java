package org.lessons.java;

// sub-class extends super class Prodotto > Smartphone
public class Smartphone extends Prodotto{
	// declaration of sub-class features
	private String imei;
	private int ram;
	
	// subclass costructor composed with superclass and subclass
	public Smartphone(String nome, String descrizione, float prezzo, float iva, String imei, int ram) {
		
		//before sub-class
		super(nome, descrizione, prezzo, iva);
		// sub-class
		setImei(imei);
		setRam(ram);
		
	}
	
	// classic getters and setters
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
	
	// ovveride super class inside this subclass, gets to string from super class and add whatever you need
	@Override
	public String toString() {
		
		return super.toString() 				
				+ "ram: " + getRam() + "\n"
				+ "imei: " + getImei() + "\n";
	}

}
