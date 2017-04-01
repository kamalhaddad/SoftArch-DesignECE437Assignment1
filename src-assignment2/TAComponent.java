
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

    public void addTransitionLabel(TATransitionLabel transitionLabel) {
        transitionLabels.add(transitionLabel);
    }

    public void mapTransitionToLabel(TATransition transition, TATransitionLabel label) {
        transition.setLabel(label);
        transitions.add(transition);
    }

    public  void evaluate() {
        while (true)
            for (TATransition transition : transitions)
                if (transition.getFrom() == currentState) {
                    TAFormula guard = transition.getLabel().getGuard();
                    guard.evaluate();
                    if (guard.getValue()) {
                        currentState = transition.getTo();
                        break;
                    }
                }
    }

    public TAComponent clone() { return null; }

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

    public boolean addState(TAState state) { return states.add(state); }
    public boolean addPort(TAPort port) { return ports.add(port); }
    public void addTransition(TATransition transition) { transitions.add(transition); }
    public boolean isPortReady() { return false; }



}
