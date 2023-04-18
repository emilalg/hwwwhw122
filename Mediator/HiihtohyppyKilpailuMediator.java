
import java.util.*;
public class HiihtohyppyKilpailuMediator implements Mediator {
    List<Hyppääjä> hyppääjät = new ArrayList<>();
    Tuomarit tuomarit = new Tuomarit();
    Tulostaulu tulostaulu = new Tulostaulu();
    Kisasihteeri kilpailunSihteeri = new Kisasihteeri();

    public void rekisteröiHyppääjä(Hyppääjä hyppääjä) {
        hyppääjät.add(hyppääjä);
    }

    public void lähetäHyppyData(Hyppy hyppy, Hyppääjä hyppääjä) {
        laskePisteet(hyppy, hyppääjä);
    }

    public void laskePisteet(Hyppy hyppy, Hyppääjä hyppääjä) {
        double[] tuomaripisteet = tuomarit.arvioiPisteet(hyppy.tyyliPisteet);
        double pituuspisteet = Hyppyriviiva.laskePituusPisteet(hyppy.pituus);
        double kokonaispisteet = kilpailunSihteeri.laskeKokonaispisteet(hyppy, tuomaripisteet, pituuspisteet);
        päivitäTulostaulu(hyppääjä, kokonaispisteet);
    }

    public void päivitäTulostaulu(Hyppääjä hyppääjä, double kokonaispisteet) {
        tulostaulu.päivitäPisteet(hyppääjä, kokonaispisteet);
        tulostaulu.näytäTulokset();
    }
}
