class MinuuttiViisari extends Viisari {
    public MinuuttiViisari() {
        this.tyyppi = "minuutti";
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