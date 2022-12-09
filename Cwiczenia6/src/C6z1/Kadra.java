package C6z1;

import C6z1.Osoba;
import C6z1.Wynagrodzenie;

import java.util.Scanner;
public class Kadra extends Osoba implements Wynagrodzenie {
    String Wyksztalcenie, Stanowisko;
    void iniciuj1() {
        Scanner scnr = new Scanner(System.in);
        iniciuj();
        System.out.printf("Wykrztałcenie: ");
        Wyksztalcenie = scnr.next();
        System.out.printf("Stanowisko: ");
        Stanowisko = scnr.next();
        System.out.printf("\n");
    }
    void drukuj1() {
        drukuj();
        System.out.printf("\nWykrztałcenie: "+ Wyksztalcenie + "\n");
        System.out.printf("Stanowisko: "+ Stanowisko + "\n");
    }

    @Override
    public double wynagrodzenie(double zaGodzine, double godzinyPracy){
        if(godzinyPracy <= 50){
            return (zaGodzine*godzinyPracy);
        } else return (zaGodzine*godzinyPracy + wynagrodzeniaZaNadgodziny(zaGodzine, 10));
    }

    @Override
    public double wynagrodzeniaZaNadgodziny (double zaGodzine, double nadgodzinyPracy){
        return (zaGodzine * 1.25 * nadgodzinyPracy);
    }
}
