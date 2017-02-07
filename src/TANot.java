
public class TANot extends TABool implements TABoolOps {

    private Boolean value_not;
    private TABool operand;

    TANot(TABool b){

    }

    void evaluate(){}

    protected Boolean getValue(){ return value_not;}

    public void list(){
        System.out.print("(~ ");
        operand.list();
        System.out.print(" )");
    }
}
