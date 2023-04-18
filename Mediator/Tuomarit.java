import java.util.*;
class Tuomarit {
    public double[] arvioiPisteet(double[] tyyliPisteet) {
        return Arrays.stream(tyyliPisteet).sorted().skip(1).limit(3).toArray();
    }
}