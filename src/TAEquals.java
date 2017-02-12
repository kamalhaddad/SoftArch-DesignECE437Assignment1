public class TAEquals extends TABool implements TABoolOps{

    private Boolean value_equals;
    private TANumber operand1, operand2;

    TAEquals(TAInt a, TAInt b){

    }

    TAEquals(TADouble a, TADouble b){

    }

    public Boolean getValue(){

        return value_equals;
    }

    public void printState(){

        System.out.println(value_equals);
    }

    public void list(){

        System.out.print("(= ");
        operand1.list();
        System.out.println(" ");
        operand2.list();
        System.out.print(")");

    }

}
