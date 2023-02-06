package composite.komposiitit;

import java.util.ArrayList;
import composite.Osa;

public class Emolevy implements composite.Osa{
    
    private double hinta = 0;
    private ArrayList<Osa> osat = new ArrayList<Osa>();

    public Emolevy(double hinta) {
        this.hinta = hinta;
    }

    public void lisaaOsa(Osa osa) {
        osat.add(osa);
    }

    @Override
    public double hinta() {
        double temp = 0;

        for (Osa i: osat){
            temp += i.hinta();
        }

        return temp + this.hinta;
    }

}
