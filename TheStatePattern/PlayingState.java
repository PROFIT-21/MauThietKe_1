package TheStatePattern;

public class PlayingState implements State {
    @Override
    public void play(MediaPlayer player) {
        System.out.println("Video is already playing. No action.");
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Pausing the video...");
        player.setIcon("PAUSE_ICON");
        player.setState(new PausedState()); // Chuyển trạng thái
    }
}
