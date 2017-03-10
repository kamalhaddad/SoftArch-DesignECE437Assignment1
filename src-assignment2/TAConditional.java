/**
 * Type Abstraction for Conditional Statements
 * Follows the following form:
 * e1 ? e2 : e3
 * e1 is the condition formula
 * e2 is the executed formula/term when the e1 condition is met
 * e3 is the executed formula/term when the e1 condition is not met
 */
public class TAConditional implements TAObject {
    private TAFormula e1;
    private TAOperation e2;
    private TAOperation e3;

    /**
     * e1 ? e2 : e3
     * where all parameters are formulae
     */
    public TAConditional(TAFormula e1, TAFormula e2, TAFormula e3) {
        this.e1 = e1;
        this.e2 = e2;
        this.e3 = e3;
    }

    /**
     * e1 ? e2 : e3
     * where e2 and e3 are terms
     */
    public TAConditional(TAFormula e1, TATerm e2, TATerm e3) {
        this.e1 = e1;
        this.e2 = e2;
        this.e3 = e3;
    }

    public void list() {
        e1.list();
        System.out.print(" ? ");
        e2.list();
        System.out.println(" : ");
        e3.list();
    }

    public void evaluate() {
        e1.evaluate();
        if (e1.getValue()) {
            e2.evaluate();
        } else {
            e3.evaluate();
        }
    }

    /*
     * public TAPrimitive getValue() {}
     */
}
