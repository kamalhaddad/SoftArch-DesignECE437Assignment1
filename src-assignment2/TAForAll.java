import java.util.ArrayList;
import java.util.List;

/**
 * Created by Abbas on 10/03/2017.
 */
public class TAForAll implements TAFormula {
    private boolean value_forall;
    private TAPrimitive quantifier;
    private TADomain domain;
    private TAFormula formula;

    /*
     * For all x in domain: evaluate formula
     * TAFormula can have another quantifier with another domain and another formula
     * which should also be evaluated
     * NOTE: There  cannot be the same quantifiers among different formulas
     * For example, it would not make sense to have there exists x in D and there exists x in D
     * Different quantifiers should be used
     */
    public TAForAll(TAPrimitive x, TADomain domain, TAFormula formula) throws Exception {

        //DomainChecker.check(x.getName()); Needs fixing

        ArrayList opList = formula.getOperands();

        if(!opList.contains(x))
            throw new Exception("variable " + x.getName() +" not in formula");

        this.quantifier = x;
        this.domain = domain;
        this.formula = formula;
    }

    @Override
    public void printState() { System.out.print(quantifier.getName());}

    /*
     * Get the result of the evaluation
     */
    @Override
    public Boolean getValue() {
        return value_forall;
    }

    @Override
    public void list() {

        System.out.print("There exists at least one ");
        quantifier.list();
        System.out.print(" in ");
        domain.list(); //need to figure out how to implement this
        formula.list();
    }

    /*
     * First check if quantifier belongs to domain i.e. if quantifier of same type as domain
     * If true check if formula returns true for all values in TADomain
     * If both conditions met then this will evaluate to true
     * Else will evaluate to false
     */
    @Override
    public void evaluate() {
        // Get the domain for the current quantifier
        List<TAConstant> domainList = domain.getList();

        // Begin evaluation
        value_forall = true;
        for (TAConstant constant: domainList) {
            quantifier.setValue(constant.getValue());
            formula.evaluate();
            if (!formula.getValue()) {
                value_forall = false;
                break;
            }
        }
    }

    @Override
    public TAPrimitive getValueTA() {
        return new TABool(value_forall);
    }

    public ArrayList getOperands(){
        ArrayList opList = new ArrayList();
        opList.addAll(formula.getOperands());
        return opList;
    }
}
