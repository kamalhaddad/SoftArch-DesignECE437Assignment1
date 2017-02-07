
public class TANot extends TABool implements TABoolOps {

    private Boolean value_not;

    TANot(TABool b){

    }

    void evaluate(){}

    protected Boolean getValue(){ return value_not;}
}
