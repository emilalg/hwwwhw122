package composite.osat;

public class Prosessori implements composite.Osa{
    

    private double hinta = 0;

    public Prosessori (double hinta){
        this.hinta = hinta;
    }

    @Override
    public double hinta() {
        return this.hinta;
    }

}
