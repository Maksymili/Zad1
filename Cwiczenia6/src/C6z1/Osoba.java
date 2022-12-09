package C6z1;

import java.util.Scanner;
public class Osoba {
        String Imie, Nazwisko, Ulica, Kod, Miasto;
        void iniciuj() {
            Scanner scnr = new Scanner(System.in);
            System.out.printf("Imie: ");
            Imie = scnr.next();
            System.out.printf("Nazwisko: ");
            Nazwisko = scnr.next();
            System.out.printf("Ulice: ");
            Ulica = scnr.next();
            System.out.printf("Kod: ");
            Kod = scnr.next();
            System.out.printf("Miasto: ");
            Miasto = scnr.next();
        }
        void drukuj() {
            System.out.printf("Imie: " + Imie + "\n");
            System.out.printf("Nazwisko: " + Nazwisko + "\n");
            System.out.printf("Ulica: " + Ulica + "\n");
            System.out.printf("Kod: " + Kod + "\n");
            System.out.printf("Miasto: " + Miasto);
        }

    }

