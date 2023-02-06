package composite.osat;

public class Naytonohjain implements composite.Osa{

    private double hinta = 0;

    public Naytonohjain (double hinta){
        this.hinta = hinta;
    }

    @Override
    public double hinta() {
        return this.hinta;
    }
    
}
