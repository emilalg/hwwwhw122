package composite.osat;

public class Muistipiiri implements composite.Osa{

    private double hinta = 0;

    public Muistipiiri (double hinta){
        this.hinta = hinta;
    }

    @Override
    public double hinta() {
        return this.hinta;
    }
    
}
