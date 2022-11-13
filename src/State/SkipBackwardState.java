package State;

import java.util.Arrays;
import java.util.List;

public class SkipBackwardState extends IState{
    public SkipBackwardState() {
        super(StateType.SKIP_BACKWARD, Arrays.asList(StateType.PLAYING, StateType.STOPPED, StateType.SKIP_FORWARD, StateType.SKIP_BACKWARD));
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
