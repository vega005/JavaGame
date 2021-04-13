import java.util.Scanner;

public class Gra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj dane 1 gracza: ");
        Gracz gracz1 = new Gracz();
        System.out.println("Podaj imie: ");
        gracz1.wpiszImie(scanner.next());
        System.out.println("Podaj nazwisko: ");
        gracz1.wpiszNazwisko(scanner.next());
        System.out.println("Podaj wiek: ");
        gracz1.wpiszWiek(scanner.nextInt());
        gracz1.wypiszDane();

        System.out.println("\nPodaj dane 2 gracza: ");
        Gracz gracz2 = new Gracz();
        System.out.println("Podaj imie: ");
        gracz2.wpiszImie(scanner.next());
        System.out.println("Podaj nazwisko: ");
        gracz2.wpiszNazwisko(scanner.next());
        System.out.println("Podaj wiek: ");
        gracz2.wpiszWiek(scanner.nextInt());
        gracz2.wypiszDane();

        Kostka kostka1 = new Kostka(1, 20);
        System.out.println("\nGracz 1 rzuca:");
        kostka1.wypiszIloscOczek();
        System.out.println("Gracz 2 rzuca:");
        Kostka kostka2 = new Kostka(1, 20);
        kostka2.wypiszIloscOczek();
        if (kostka1.iloscOczek > kostka2.iloscOczek) {
            System.out.println("Wygrał gracz 1!!");
        } else if (kostka2.iloscOczek > kostka1.iloscOczek) {
            System.out.println("Wygrał gracz 2!!");
        } else {
            System.out.println("REMIS!!");
        }
    }
}
