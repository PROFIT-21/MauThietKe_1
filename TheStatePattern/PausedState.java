package TheStatePattern;

public class PausedState implements State {
    @Override
    public void play(MediaPlayer player) {
        System.out.println("Resuming the video...");
        player.setIcon("PLAY_ICON");
        player.setState(new PlayingState()); // Chuyển trạng thái
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Video is already paused. No action.");
    }
}
