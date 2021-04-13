import java.util.Scanner;

public class Gracz {
    Scanner scanner = new Scanner(System.in);
    private String imie;
    private String nazwisko;
    private int wiek;

    public Gracz() {
        imie = "brak";
        nazwisko = "brak";
        wiek = 0;
    }

    public Gracz(String imie, String nazwisko, int wiek) {
        wpiszDane(imie, nazwisko, wiek);
    }

    public void wpiszDane(String imie, String nazwisko, int wiek) {
        wpiszImie(imie);
        wpiszNazwisko(nazwisko);
        wpiszWiek(wiek);

    }

    void wpiszImie(String x){
        this.imie = x;
    }

    void wpiszNazwisko(String x){
        this.nazwisko = x;
    }

    void wpiszWiek(int x){
        while (x < 18){
            System.out.println("Gracz musi być pełnoletni!!");
            x = scanner.nextInt();
        }
        if (x > 18){
            wiek = x;
        }
    }

    void wypiszDane(){
        System.out.println("Imie: " + imie + "\n" + "Nazwisko: " + nazwisko + "\n" + "Wiek: " + wiek);
    }
}