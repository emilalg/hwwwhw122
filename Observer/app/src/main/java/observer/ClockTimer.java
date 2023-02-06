package observer;

public class ClockTimer extends Subject{

    public ClockTimer(){
        super();
    }

    private int time;

    public int getHour(){return time/3600;}

    public int getMinute(){return time/60;}

    public int getSecond(){return time;}

    public void tick(){
        this.time += 1;
        notifyy();
    }

}
