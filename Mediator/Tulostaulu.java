import java.util.*;

class Tulostaulu {
    Map<Hyppääjä, Double> pisteet = new HashMap<>();
    
    
    public void päivitäPisteet(Hyppääjä hyppääjä, double kokonaispisteet) {
        pisteet.put(hyppääjä, pisteet.getOrDefault(hyppääjä, 0.0) + kokonaispisteet);
    }
    
    public void näytäTulokset() {
        System.out.println("Tulostaulu:");
        for (Map.Entry<Hyppääjä, Double> entry : pisteet.entrySet()) {
            System.out.println(entry.getKey().nimi + ": " + entry.getValue());
        }
    }
    
}