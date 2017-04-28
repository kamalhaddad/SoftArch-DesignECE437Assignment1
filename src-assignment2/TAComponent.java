
import java.util.ArrayList;
import java.util.Set;

public class TAComponent implements TAObject {
    TAState currentState;
    Set<TAState> states;
    Set<TAPort> ports;
    Set<TATransition> transitions;
    Set<TATransitionLabel> transitionLabels;

    public TAComponent(TAState initState, Set<TAState> states, Set<TAPort> ports) {
        this.currentState = initState;
        this.states = states;
        this.ports = ports;
    }

    private TAComponent(TAState initState,
                        Set<TAState> states,
                        Set<TAPort> ports,
                        Set<TATransition> transitions,
                        Set<TATransitionLabel> labels) {
        this.currentState = initState;
        this.states = states;
        this.ports = ports;
        this.transitions = transitions;
        this.transitionLabels = labels;
    }

    public void addTransitionLabel(TATransitionLabel transitionLabel) {
        transitionLabels.add(transitionLabel);
    }

    public void mapTransitionToLabel(TATransition transition, TATransitionLabel label) {
        transition.setLabel(label);
        transitions.add(transition);
    }

    public void evaluate() {
        while (true)
            for (TAPort port : ports) {
                TATransition transition = getPortTransition(port);
                if (transition != null) {
                    currentState = transition.getTo();
                    return;
                }
            }
    }

    public TAComponent clone() { return new TAComponent(currentState, states, ports, transitions, transitionLabels); }

    public void list() {
        System.out.print("Component with states:" + states.toString());
        System.out.print("; ports: " + ports.toString());
        System.out.print("; transitions: " + transitions.toString());
        System.out.print("; transitions labels: " + transitions.toString());
        System.out.println("; mapping between transitions and labels: " + transitions.toString());
    }

    public void printState() { System.out.println(currentState); }

    public void printVariables() {
        ArrayList<String> names = new ArrayList<>();
        for (TATransition transition : transitions) {
            ArrayList<TABool> variables = transition.getLabel().getGuard().getOperands();
            for (TABool variable : variables) names.add(variable.getName());
        }
        System.out.println(names.toString());
    }

    // if port is ready it will return its transition
    public TATransition getPortTransition(TAPort port) {
        if (!ports.contains(port))
            return null;

        for (TATransition transition : transitions) {
            if (transition.getFrom() == currentState) {
                TATransitionLabel ithLabel = transition.getLabel();
                if (ithLabel.getPort() != port.id) continue;

                TAFormula guard = ithLabel.getGuard();
                guard.evaluate();
                if (guard.getValue()) {
                    return transition;
                }
            }
        }
        return null;
    }

    public boolean addState(TAState state) { return states.add(state); }
    public boolean addPort(TAPort port) { return ports.add(port); }
    public void addTransition(TATransition transition) { transitions.add(transition); }
}
