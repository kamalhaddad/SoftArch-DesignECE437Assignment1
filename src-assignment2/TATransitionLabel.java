
// Type abstraction for transition labels
public class TATransitionLabel implements TAObject {
    private Integer port;
    private TAFormula guard;
    private TAStatement action;

    public TATransitionLabel(Integer port, TAFormula guard, TAStatement action) {
        this.port = port;
        this.guard = guard;
        this.action = action;
    }

    public Integer getPort() { return port; }
    public TAFormula getGuard() { return guard; }
    public TAStatement getAction() { return action; }
    public void setPort(Integer port) { this.port = port; }
    public void setGuard(TAFormula guard) { this.guard = guard; }
    public void setAction(TAStatement action) { this.action = action; }
}