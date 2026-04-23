package TheProxyPattern;

public class RealImage implements DisplayObject {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(); 
    }

    private void loadFromDisk() {
        System.out.println(">>> [EXPENSIVE] Loading " + fileName + " from disk...");
        try { Thread.sleep(2000); } catch (InterruptedException e) {} // Giả lập độ trễ
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}
