package TheObserverPattern;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Connection {
    private String status;
    private PropertyChangeSupport support;

    public Connection() {
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void setStatus(String newStatus) {
        // Thông báo cho các Observer nếu giá trị thay đổi
        support.firePropertyChange("status", this.status, newStatus);
        this.status = newStatus;
    }
}
