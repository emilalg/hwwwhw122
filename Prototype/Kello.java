import java.util.HashMap;
import java.util.Map;


class Kello {
    protected Map<String, Viisari> viisarit = new HashMap<>();

    public void lisaaViisari(Viisari viisari) {
        viisarit.put(viisari.getTyyppi(), viisari);
    }

    public Kello clone() {
        Kello klooni = new Kello();
        for (String tyyppi : viisarit.keySet()) {
            klooni.lisaaViisari(viisarit.get(tyyppi).clone());
        }
        return klooni;
    }
}