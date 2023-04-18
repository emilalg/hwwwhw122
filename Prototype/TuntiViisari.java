class TuntiViisari extends Viisari {
    public TuntiViisari() {
        this.tyyppi = "tunti";
        this.arvo = 0;
    }

    public void setArvo(int arvo) {
        this.arvo = arvo;
    }

    public int getArvo() {
        return arvo;
    }

    public String getTyyppi() {
        return tyyppi;
    }
}