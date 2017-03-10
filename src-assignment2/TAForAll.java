/**
 * Created by Abbas on 10/03/2017.
 */
public class TAForAll implements TAFormula {
    private boolean value;
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
    public TAForAll(TAPrimitive x, TADomain domain, TAFormula formula) {
        this.quantifier = x;
        this.domain = domain;
        this.formula = formula;
    }

    @Override
    public void printState() {}

    /*
     * Get the result of the evaluation
     */
    @Override
    public Boolean getValue() {
        return null;
    }

    @Override
    public void list() {}

    /*
     * First check if quantifier belongs to domain i.e. if quantifier of same type as domain
     * If true check if formula returns true for all values in TADomain
     * If both conditions met then this will evaluate to true
     * Else will evaluate to false
     */
    @Override
    public void evaluate() {}
}
