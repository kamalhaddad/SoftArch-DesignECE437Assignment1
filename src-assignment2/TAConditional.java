/**
 * Type Abstraction for Conditional Statements
 * Follows the following form:
 * e ? s1 : s2
 * e is the condition formula
 * s1 is the executed formula/term when the e condition is met
 * s2 is the executed formula/term when the e condition is not met
 */
public class TAConditional implements TAAtomic {
    private TAPrimitive result;
    private TAFormula e;
    private TAStatement s1;
    private TAStatement s2;
    private int flag;

    /**
     * e ? s1 : s2
     * where all parameters are formulae
     */
    public TAConditional(TAFormula e, TAStatement s1, TAStatement s2) {
        this.e = e;
        this.s1 = s1;
        this.s2 = s2;
        this.flag = -1;
    }

    @Override
    public void list() {
        System.out.println();
        e.list();
        System.out.print(" ? ");
        s1.list();
        System.out.println(" : ");
        s2.list();
    }

    @Override
    public TAPrimitive getValueTA() {
        if (flag == -1) {
            try {
                throw new Exception("Need to evaluate before getting result object.");
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }

        if (flag == 1)
            return s1.getValueTA();

        return  s2.getValueTA();
    }

    @Override
    public void evaluate() {
        e.evaluate();
        if (e.getValue()) {
            s1.evaluate();
            result = s1.getValueTA();
            flag = 1;
        } else {
            s2.evaluate();
            result = s2.getValueTA();
            flag = 2;
        }
    }

    public Object getValue() {
        return result.getValue();
    }
}
