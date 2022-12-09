package C6z1;

public class Zadanie1 {
    public static void main(String[] args) {
        Kadra obj= new Kadra();
        obj.iniciuj1();
        obj.drukuj1();

        System.out.println("Łączne wynagrodzenie: " + obj.wynagrodzenie(39, 39));
        System.out.println("Za nadgodziny: " + obj.wynagrodzeniaZaNadgodziny(39, 10));
        System.out.println("Czy premia: " + Wynagrodzenie.premia(3));
    }
}


