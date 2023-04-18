interface Mediator {
    void rekisteröiHyppääjä(Hyppääjä hyppääjä);
    void lähetäHyppyData(Hyppy hyppy, Hyppääjä hyppääjä);
    void laskePisteet(Hyppy hyppy, Hyppääjä hyppääjä);
    void päivitäTulostaulu(Hyppääjä hyppääjä, double kokonaispisteet);
}