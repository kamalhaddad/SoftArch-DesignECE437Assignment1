/**
 * Created by Abbas on 14/03/2017.
 */
public class TALoop implements TAAtomic {
    private TAFormula formula;
    private TAStatement statement;

    public TALoop(TAFormula e, TAStatement s) {
        formula = e;
        statement = s;
    }

    @Override
    public void evaluate() {
        formula.evaluate();
        while(formula.getValue()) {
            statement.evaluate();
        }
    }

    @Override
    public void list() {
        System.out.print("while(");
        formula.list();
        System.out.print(") {");
        System.out.println();
        statement.list();
        System.out.println();
        System.out.println("}");
    }

    @Override
    public TAPrimitive getValueTA() {
        return statement.getValueTA();
    }
}
