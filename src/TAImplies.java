public class TAImplies extends TABool implements TANumber{

    private Boolean value_implies;


    TAImplies(TABool a, TABool b) {

    }

    protected Boolean getValue() { return value_implies;}

    void evaluate(){}
}
