package basisklassen;

import java.util.Scanner;

public class Adresse {
	private String strasse;
	private int hausnummer;
	private int plz;
	private String ort;
	
	
//---------------------------- KONSTRUKTOR ----------------------------	
	public Adresse(String strasse, int hausnummer, int plz, String ort) {
		super();
		this.strasse = strasse;
		this.hausnummer = hausnummer;
		this.plz = plz;
		this.ort = ort;
	}
	
//---------------------------- TO-STRING METHODE ----------------------------	
	@Override
	public String toString() {
		return (strasse + " " + hausnummer + ", " + plz + " " + ort);
	}
	
	
//---------------------------- GET METHODEN ----------------------------
	public String getStrasse() {
		return strasse;
	}
	public int getHausnummer() {
		return hausnummer;
	}
	public int getPlz() {
		return plz;
	}
	public String getOrt() {
		return ort;
	}
	
	
	
	

}
