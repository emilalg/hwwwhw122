package observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Subject {
    
    private PropertyChangeSupport support;

    public Subject() {
        support = new PropertyChangeSupport(this);
    }

    public void attach(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void detach(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }

    protected void notifyy(){
        support.firePropertyChange(null, null, this);
    }

}
