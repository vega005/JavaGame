import java.util.Random;

public class Kostka {
    Random random = new Random();

    int iloscOczek;
    int x;
    int y;

    public Kostka(int x, int y) {
        this.x = x;
        this.y = y;
        iloscOczek = random.nextInt(y - x + 1) + x;
    }

    void wypiszIloscOczek() {
        System.out.println("Ilość oczek: " + iloscOczek);
    }
}
