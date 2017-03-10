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

        DomainChecker.check(x.getName()); //Checks if x has already been set a domain previously
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
    public void evaluate() { //Should we return a boolean here? Or should we store it in value_exists?

        List<TAConstant> domainList = domain.getList();

        for(TAConstant constant: domainList){
            if(quantifier.getValue() == constant.getValue() && formula.getValue())
                value_exists = true; //just added this because java requires a statement here
                //return true;
        }

        //return false;
    }
}