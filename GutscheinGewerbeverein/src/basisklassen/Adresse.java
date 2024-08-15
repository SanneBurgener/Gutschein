package basisklassen;

import java.util.Scanner;

public class Adresse {
	private String strasse;
	private int hausnummer;
	private int plz;
	private String ort;
	
	public void neueAdresse() {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("**START ERFASSUNG EINER NEUEN ADRESSE**");
		
		//Strasse einlesen
		System.out.println("Bitte Strassenname eingeben: ");
		strasse = sc.next();
		
		//Hausnummer einlesen
		System.out.println("Bitte Hausnnummer eingeben: ");
		hausnummer = sc.nextInt();
		
		//Postleitzahl einlesen
		System.out.println("Bitte Postleitzahl eingeben: ");
		plz = sc.nextInt();
		
		//Ortsname einlesen
		System.out.println("Bitte Ortsname eingeben: ");
		ort = sc.next();	
			
			System.out.println("**ADRESSE ERFOLGREICH ERFASST**");
	
	}
	
	
	
	public String getStrasse() {
		return strasse;
	}
	
	public void setStrasse(String strasse) {
		this.strasse = strasse;
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
