package memento;

public class Asiakas implements Runnable {
    private final Arvuuttaja arvuuttaja;
    private final Memento memento;

    public Asiakas(Arvuuttaja arvuuttaja) {
        this.arvuuttaja = arvuuttaja;
        this.memento = arvuuttaja.liityPeliin();
    }

    @Override
    public void run() {
        boolean arvausOikein = false;
        while (!arvausOikein) {
            int guess = (int) (Math.random() * 100) + 1;
            arvausOikein = arvuuttaja.arvaus(memento, guess);
            System.out.println(Thread.currentThread().getName() + " arvasi " + guess + " - " + (arvausOikein ? "OIKEIN" : "VÄÄRIN"));
            if (!arvausOikein) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}