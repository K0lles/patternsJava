package State;

import java.util.Arrays;
import java.util.List;

public class SkipForwardState extends IState{
    public SkipForwardState() {
        super(StateType.SKIP_FORWARD, Arrays.asList(StateType.PLAYING, StateType.STOPPED, StateType.SKIP_FORWARD, StateType.SKIP_BACKWARD));
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
