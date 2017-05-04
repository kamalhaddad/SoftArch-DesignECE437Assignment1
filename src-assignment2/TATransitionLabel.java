
// Type abstraction for transition labels
public class TATransitionLabel implements TAObject {
    private TAPort port;
    private TAFormula guard;
    private TAStatement action;

    public TATransitionLabel(TAPort port, TAFormula guard, TAStatement action) {
        this.port = port;
        this.guard = guard;
        this.action = action;
    }

    public TAPort getPort() { return port; }
    public int getPortId() { return port.id; }
    public TAFormula getGuard() { return guard; }
    public TAStatement getAction() { return action; }
    public void setPort(TAPort port) { this.port = port; }
    public void setGuard(TAFormula guard) { this.guard = guard; }
    public void setAction(TAStatement action) { this.action = action; }
}