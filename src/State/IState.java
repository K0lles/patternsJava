package State;

import java.util.ArrayList;
import java.util.List;

public class IState {
    public StateType currentState;
    public List<StateType> allowedStates = new ArrayList<>();

    public IState(StateType currentState, List<StateType> allowedStates) {
        this.currentState = currentState;
        this.allowedStates = allowedStates;
    }

    public IState switchTo(StateType state) {
        if (state == StateType.PLAYING) return new PlayingState();
        else if (state == StateType.STOPPED) return new StoppedState();
        else if (state == StateType.SKIP_FORWARD) return new SkipForwardState();
        else if (state == StateType.SKIP_BACKWARD) return new SkipBackwardState();
        return null;
    }

    @Override
    public String toString() {
        return String.valueOf(currentState);
    }
}
