package Builder;

public class Architect {
    public static void main(String[] args) {
        // Tạo phòng ngủ hiện đại: Có ban công, màu xám
        Bedroom modernRoom = new BedroomBuilder()
                .setSize(25.5)
                .setWindows(2)
                .setWallColor("Grey")
                .setHasBalcony(true)
                .build();

        // Tạo phòng ngủ đơn giản: Chỉ cần kích thước, các thứ khác mặc định
        Bedroom simpleRoom = new BedroomBuilder()
                .setSize(15.0)
                .build();

        // In kết quả kiểm tra
        System.out.println("Modern Room: " + modernRoom);
        System.out.println("Simple Room: " + simpleRoom);
    }
}