package TheCommandPattern;

import java.util.Arrays;
import java.util.List;

public class SmartOfficeApp {

	public static void main(String[] args) {
        // Thiết bị
        Light mainLight = new Light();
        Projector projector = new Projector();
        RemoteControl remote = new RemoteControl();

        // 1. Thao tác đơn lẻ
        Command dimLight = new LightDimCommand(mainLight, 50);
        remote.setCommand(dimLight);
        remote.pressButton(); // Light 50%

        // 2. Kịch bản họp (Macro)
        List<Command> meetingList = Arrays.asList(
            new LightDimCommand(mainLight, 10),
            // Thêm các lệnh khác cho máy chiếu, rèm ở đây...
            new Command() { // Ví dụ nhanh cho máy chiếu
                public void execute() { projector.setMode("Working"); }
                public void undo() { projector.off(); }
            }
        );
        Command startMeeting = new MacroCommand(meetingList);
        
        remote.setCommand(startMeeting);
        remote.pressButton();

        // 3. Hoàn tác
        remote.pressUndo(); // Quay lại trạng thái trước khi họp
    }
}