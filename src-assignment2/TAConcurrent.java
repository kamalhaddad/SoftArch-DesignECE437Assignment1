/**
 * Created by Abbas on 14/03/2017.
 */
public class TAConcurrent extends TAList {

    public TAConcurrent(TAAtomic e, TAStatement s) {
        super(e, s);
    }

    @Override
    public void evaluate() {
        if(atomic instanceof TAAssignment) {
            // Compute only
            ((TAAssignment) atomic).compute();
            statement.evaluate();
            // After all computation is complete start assigning recursively
            ((TAAssignment) atomic).assign();
        }
        else {
            atomic.evaluate();
            statement.evaluate();
        }
    }

    @Override
    public void list() {
        System.out.println();
        atomic.list();
        System.out.print(" | ");
        statement.list();
    }
}
