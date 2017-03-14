/**
 * Created by Abbas on 14/03/2017.
 */
public class TASequential extends TAList {

    public TASequential(TAAtomic e, TAStatement s) {
        super(e, s);
    }

    @Override
    public void evaluate() {
        atomic.evaluate();
        statement.evaluate();
    }

    @Override
    public void list() {
        System.out.println();
        atomic.list();
        System.out.print(" ; ");
        statement.list();
    }
}
