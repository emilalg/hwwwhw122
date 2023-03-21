package memento;

import java.util.Random;

public class Arvuuttaja {
    private final Random random = new Random();

    public Memento liityPeliin() {
        int randomNumber = random.nextInt(100) + 1;
        return new Memento(randomNumber);
    }

    public boolean arvaus(Memento memento, int guess) {
        return memento.getNumber() == guess;
    }
}