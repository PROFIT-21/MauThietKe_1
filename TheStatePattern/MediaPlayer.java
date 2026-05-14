package TheStatePattern;

public class MediaPlayer {
    private State state;
    private String icon;

    public MediaPlayer() {
        // Trạng thái mặc định ban đầu là Paused
        this.state = new PausedState();
        this.icon = "PLAY_ICON";
    }

    public void setState(State state) { this.state = state; }
    public void setIcon(String icon) { this.icon = icon; }

    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }
}