package memento;

public class Memento {
    private int number;

    public Memento(int number) {
        this.number = number;
    }

    protected int getNumber() {
        return number;
    }
}