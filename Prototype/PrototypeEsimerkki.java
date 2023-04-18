public class PrototypeEsimerkki {
    public static void main(String[] args) {
        Kello kello = new Kello();
        kello.lisaaViisari(new TuntiViisari());
        kello.lisaaViisari(new MinuuttiViisari());

        Kello klooni = kello.clone();

        kello.viisarit.get("tunti").setArvo(10);
        kello.viisarit.get("minuutti").setArvo(30);

        System.out.println("Alkuperäisen kellon aika: " + kello.viisarit.get("tunti").getArvo() + ":" + kello.viisarit.get("minuutti").getArvo());
        System.out.println("Kloonin kellon aika: " + klooni.viisarit.get("tunti").getArvo() + ":" + klooni.viisarit.get("minuutti").getArvo());

        klooni.viisarit.get("tunti").setArvo(5);
        klooni.viisarit.get("minuutti").setArvo(15);
        System.out.println("Alkuperäisen kellon aika muutoksen jälkeen: " + kello.viisarit.get("tunti").getArvo() + ":" + kello.viisarit.get("minuutti").getArvo());
        System.out.println("Kloonin kellon aika muutoksen jälkeen: " + klooni.viisarit.get("tunti").getArvo() + ":" + klooni.viisarit.get("minuutti").getArvo());
    
        // Matalakopiointi esimerkki
        Kello matalaKlooni = new Kello();
        matalaKlooni.lisaaViisari(kello.viisarit.get("tunti"));
        matalaKlooni.lisaaViisari(kello.viisarit.get("minuutti"));
    
        matalaKlooni.viisarit.get("tunti").setArvo(2);
        matalaKlooni.viisarit.get("minuutti").setArvo(45);
    
        System.out.println("Alkuperäisen kellon aika matalakopiointi muutoksen jälkeen: " + kello.viisarit.get("tunti").getArvo() + ":" + kello.viisarit.get("minuutti").getArvo());
        System.out.println("Matalakloonin kellon aika muutoksen jälkeen: " + matalaKlooni.viisarit.get("tunti").getArvo() + ":" + matalaKlooni.viisarit.get("minuutti").getArvo());
    }
}