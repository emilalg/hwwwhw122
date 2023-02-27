package composite.osat;

public class Verkkokortti implements composite.Osa {

    private double hinta = 0;

    public Verkkokortti (double hinta){
        this.hinta = hinta;
    }

    @Override
    public double hinta() {
        return this.hinta;
    }
}
