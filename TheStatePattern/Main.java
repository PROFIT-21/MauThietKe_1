package TheStatePattern;

public class Main {
    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();

        // Thử nhấn Play khi đang Paused
        player.play(); // Sẽ chuyển sang PlayingState

        // Thử nhấn Play một lần nữa
        player.play(); // PlayingState sẽ báo đã đang phát rồi

        // Nhấn Pause
        player.pause(); // Sẽ chuyển về PausedState
    }
}

