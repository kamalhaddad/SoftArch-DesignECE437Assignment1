

// Type abstraction for mapping between
public class TATransition implements TAObject {
    // Source currentState
    TAState from;
    // Destination currentState
    TAState to;
    // Corresponding transition label
    TATransitionLabel label;

    public TATransition(TAState from, TAState to) {
        this.from = from;
        this.to = to;
    }

    public void setFrom(TAState from) { this.from = from; }
    public void setTo(TAState to) {this.to = to;}
    public void setLabel(TATransitionLabel label) { this.label = label; }
    public TAState getFrom() { return from; }
    public TAState getTo() { return to; }
    public TATransitionLabel getLabel() { return label; }
}