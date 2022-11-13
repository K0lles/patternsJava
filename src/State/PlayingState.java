package State;

import java.awt.*;
import java.util.Arrays;

public class PlayingState extends IState{

    public PlayingState() {
        super(StateType.PLAYING, Arrays.asList(StateType.STOPPED, StateType.SKIP_FORWARD, StateType.SKIP_BACKWARD));
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
