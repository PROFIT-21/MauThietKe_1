package TheObserverPattern;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class SocialMediaFeed implements PropertyChangeListener {
    private List<String> statuses = new ArrayList<>();

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        // Khi nhận được thông báo, cập nhật vào danh sách feed
        String newStatus = (String) evt.getNewValue();
        statuses.add(newStatus);
        System.out.println("[Feed Update] New post added to your feed: " + newStatus);
    }

    public void printFeed() {
        System.out.println("--- Current Social Media Feed ---");
        for (String s : statuses) {
            System.out.println("- " + s);
        }
    }
}
