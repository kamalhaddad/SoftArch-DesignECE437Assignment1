import java.util.ArrayList;
import java.util.List;

/**
 * Created by Abbas on 10/03/2017.
 */
public class TAThereExists implements TAFormula {
    private TAPrimitive quantifier;
    private TADomain domain;
    private TAFormula formula;
    private boolean value_exists; //Added it to store the result of the evaluation

    /*
     * There exists x in domain: evaluate formula
     * TAFormula can have another quantifier with another domain and another formula
     * which should also be evaluated
     * NOTE: There  cannot be the same quantifiers among different formulas
     * For example, it would not make sense to have there exists x in D and there exists x in D
     * Different quantifiers should be used
     */
    public TAThereExists(TAPrimitive x, TADomain domain, TAFormula formula) throws Exception {

        //DomainChecker.check(x.getName()); //Checks if x has already been set a domain previously
        ArrayList opList = formula.getOperands();

        if(!opList.contains(x))
            throw new Exception("variable " + x.getName() +" not in formula");

        this.quantifier = x;
        this.domain = domain;
        this.formula = formula;

    }

    @Override
    public void printState() { System.out.print(value_exists);}

    /*
    * Get the result of the evaluation
    */
    @Override
    public Boolean getValue() {
        return value_exists;
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
     * If true check if formula returns true for one value in TADomain
     * If both conditions met then this will evaluate to true
     * Else will evaluate to false
     */
    @Override
    public void evaluate() {
        // Get the domain for the current quantifier
        List<TAConstant> domainList = domain.getList();

        // Begin evaluation
        value_exists = false;
        for (TAConstant constant: domainList) {
            quantifier.setValue(constant.getValue());
            formula.evaluate();
            if (formula.getValue()) {
                value_exists = true;
                break;
            }
        }
    }

    @Override
    public TAPrimitive getValueTA() {
        return new TABool(value_exists);
    }

    public ArrayList getOperands(){
        ArrayList opList = new ArrayList();
        opList.addAll(formula.getOperands());
        return opList;
    }
}