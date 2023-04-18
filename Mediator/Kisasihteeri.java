import java.util.*;
class Kisasihteeri {
    public double laskeKokonaispisteet(Hyppy hyppy, double[] tuomaripisteet, double pituuspisteet) {
    double tyyliPisteetSumma = Arrays.stream(tuomaripisteet).sum();
    return pituuspisteet + tyyliPisteetSumma;
    }
}