import java.util.Set;

public abstract class TAList implements TAStatement {
    protected TAAtomic atomic;
    protected TAStatement statement;

    public TAList(TAAtomic e, TAStatement s) {
        atomic = e;
        statement = s;
    }

    /**
     * TODO: Need to also return atomic statements in subsequent statements instead of just returning primitive in atomic
     */

    @Override
    public TAPrimitive getValueTA() {
        return atomic.getValueTA();
    }
}
