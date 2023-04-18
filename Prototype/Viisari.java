abstract class Viisari implements Cloneable {
    protected String tyyppi;
    protected int arvo;

    public Viisari clone() {
        Object klooni = null;
        try {
            klooni = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (Viisari) klooni;
    }

    public abstract void setArvo(int arvo);
    public abstract int getArvo();
    public abstract String getTyyppi();
}