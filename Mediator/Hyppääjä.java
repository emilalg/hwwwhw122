class Hyppääjä {
    String nimi;
    Hyppy[] hypyt;
    Mediator välittäjä;

    public Hyppääjä(String nimi, Mediator välittäjä) {
        this.nimi = nimi;
        this.hypyt = new Hyppy[2];
        this.välittäjä = välittäjä;
        välittäjä.rekisteröiHyppääjä(this);
    }

    public void suoritaHyppy(int hyppyNumero, double pituus, double[] tyyliPisteet) {
        hypyt[hyppyNumero - 1] = new Hyppy(pituus, tyyliPisteet);
        välittäjä.lähetäHyppyData(hypyt[hyppyNumero - 1], this);
    }
}