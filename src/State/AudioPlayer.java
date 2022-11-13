package State;

import java.util.ArrayList;
import java.util.List;

public class AudioPlayer {
    public List<String> songs = new ArrayList<>();
    public int currentSong = 0;
    public IState state = new PlayingState();

    public AudioPlayer(List<String> songs) {
        this.songs = songs;
    }

    public void play() {
        this.state = this.state.switchTo(StateType.PLAYING);
        System.out.println(this.songs.get(this.currentSong) + " is playing now");
    }

    public void stop() {
        this.state = this.state.switchTo(StateType.STOPPED);
        System.out.println(this.songs.get(this.currentSong) + " is on stop now");
    }

    public void skipForward() {
        this.state = this.state.switchTo(StateType.SKIP_FORWARD);
        this.currentSong += 1;
        if (this.currentSong == this.songs.size()) this.currentSong = 0;
        System.out.println("Song switched forward to " + this.songs.get(this.currentSong));
        this.play();
    }

    public void skipBackward() {
        this.state = this.state.switchTo(StateType.SKIP_BACKWARD);
        this.currentSong -= 1;
        if (this.currentSong <= 0) this.currentSong = this.songs.size() - 1;
        System.out.println("Song switched backward to " + this.songs.get(this.currentSong));
        this.play();
    }
}
