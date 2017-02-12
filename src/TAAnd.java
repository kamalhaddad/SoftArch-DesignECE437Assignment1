public class TAAnd extends TABool implements TABoolOps {

    private Boolean value_and;
    TABool operand1, operand2;

    TAAnd(TABool a, TABool b) {

        operand1 = a;
        operand2 = b;
    }


    Boolean getValue() {

        return value_and;
    }

    public void evaluate(){

        value_and = operand1.getValue() && operand2.getValue();
    }

    public void printState(){

        System.out.println(value_and);
    }

    public void list(){

        System.out.print("(& ");
        operand1.list();
        System.out.print(" ");
        operand2.list();
        System.out.print(" )");

    }

}
