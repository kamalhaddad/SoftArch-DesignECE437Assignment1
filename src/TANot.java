
public class TANot extends TABool implements TABoolOps {

    private Boolean value_not;
    private TABool operand;

    TANot(TABool b){

    }

    public void evaluate(){

        value_not = !operand.getValue();
    }

    public Boolean getValue(){

        return value_not;
    }

    public void list(){
        System.out.print("(~ ");
        operand.list();
        System.out.print(" )");
    }
}
