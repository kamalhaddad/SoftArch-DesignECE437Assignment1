
public class TANot extends TABool implements TABoolOps {

    private Boolean value_not;

    TANot(TABool b){

    }

    void evaluate(){}

    protected Boolean get(){ return value_not;}
}
