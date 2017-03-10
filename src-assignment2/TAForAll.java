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

        DomainChecker.check(x.getName());
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
        return null;
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

        List<TAConstant> domainList = domain.getList();

        for(TAConstant constant: domainList){

            if(quantifier.getValue() == constant.getValue() && formula.getValue())
                value_forall= true; //just added this because java requires a statement here

            else {
                value_forall = false;
                break;
            }
        }

    }
}
