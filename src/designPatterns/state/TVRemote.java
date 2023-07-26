package designPatterns.state;

import designPatterns.state.states.State;
import designPatterns.state.states.TVContext;
import designPatterns.state.states.TVStartState;
import designPatterns.state.states.TVStopState;

public class TVRemote {
    public static void main(String[] args) {
        TVContext context = new TVContext();
        State tvTurnOn = new TVStartState();
        State tvTurnOff = new TVStopState();

        context.setState(tvTurnOn);
        context.doAction();

        context.setState(tvTurnOff);
        context.doAction();
    }
}
