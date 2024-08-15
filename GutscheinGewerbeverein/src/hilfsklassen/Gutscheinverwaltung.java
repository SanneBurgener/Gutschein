package hilfsklassen;

import java.util.Scanner;

import basisklassen.Adresse;

public class Gutscheinverwaltung {
	
	public static void main(String[]args) {
		neueAdresse();
	}
	
	public static void neueAdresse() {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("**START ERFASSUNG EINER NEUEN ADRESSE**");
		
		//Variablen definieren
		String strasse;
		int hausnummer;
		int plz;
		String ort;
		
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
			
		//Zwischenspeicher
		Adresse adrTemp = new Adresse (strasse, hausnummer, plz, ort);
		
		//Eingabe vom User prüfen
		System.out.println("");
		System.out.println("Die eingegebene Adresse lautet: ");
		System.out.println("");
		System.out.println(adrTemp.toString());
		System.out.println("");
		System.out.println("Ist diese korrekt?");
		System.out.println("(1)/tJa/n(2)/tNein");
		
		//
		int eingabe = sc.nextInt();
		
		if(eingabe==1) {
			
			
		}else if (eingabe==2) {
			
		}
		
		
		
			System.out.println("**ADRESSE ERFOLGREICH ERFASST**");
	
	}

}
