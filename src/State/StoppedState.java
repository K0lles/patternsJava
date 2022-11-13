package State;

import java.util.Arrays;
import java.util.List;

public class StoppedState extends IState{
    public StoppedState() {
        super(StateType.STOPPED, Arrays.asList(StateType.PLAYING, StateType.SKIP_FORWARD, StateType.SKIP_BACKWARD));
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
