/**
 * Created by Abbas on 14/03/2017.
 */
public class TAAssignment implements TAAtomic {
    private TAOperation expression;
    private TAPrimitive target;

    public TAAssignment(TAOperation e, TAPrimitive t) {
        expression = e;
        target = t;
    }


    /**
     * Evaluate expression and assign the result to the target term
     */
    @Override
    public void evaluate() {
        compute();
        assign();
    }

    @Override
    public void list() {
        target.list();
        System.out.print(" = ");
        expression.list();
    }

    @Override
    public TAPrimitive getValueTA() {
        return target;
    }

    /**
     * Separation of evaluation into computation and assigning
     * Will only evaluate the expression without assigning the result to target term
     * Implemented to be used separately by concurrent lists
     */
    public void compute() {
        expression.evaluate();
    }

    /**
     * Separation of evaluation into computation and assigning
     * Assuming expression is evaluated, then this method will assign its result to target term
     * Implemented to be used separately by concurrent lists
     */
    public void assign() {
        TAPrimitive result = expression.getValueTA();
        target.setValue(result.getValue());
    }
}
