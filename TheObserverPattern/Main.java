package TheObserverPattern;

public class Main {
    public static void main(String[] args) {
        // 1. Khởi tạo đối tượng
        Connection userConnection = new Connection();
        SocialMediaFeed myFeed = new SocialMediaFeed();

        // Ban đầu cập nhật status sẽ không hiện gì vì chưa quan sát
        userConnection.setStatus("Hello world!"); 

        // 2. Thiết lập sự quan sát (Subscribe)
        userConnection.addPropertyChangeListener(myFeed);

        // 3. Thay đổi trạng thái
        userConnection.setStatus("Enjoying the sun at the beach!");
        userConnection.setStatus("Learning Design Patterns is fun!");

        // 4. Kiểm tra kết quả
        myFeed.printFeed();
    }
}
