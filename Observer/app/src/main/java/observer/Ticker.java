package observer;

public class Ticker implements Runnable{

    private ClockTimer timer;

    public Ticker(ClockTimer ct) {
        this.timer = ct;
    }

    @Override
    public void run() {
        
        while (true) {
            try {
                Thread.sleep(1000);
                timer.tick();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }
    
}
