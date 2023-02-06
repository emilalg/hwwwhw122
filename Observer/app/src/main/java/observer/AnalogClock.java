package observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class AnalogClock implements PropertyChangeListener{

    private ClockTimer timer;

    public AnalogClock(ClockTimer ct){
        timer = ct;
        ct.attach(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        ClockTimer timer = (ClockTimer) evt.getNewValue();
        draw(timer.getSecond());
    }
    
    private void draw(int time) {
        System.out.println("Analog time is : " + time);
    }

}