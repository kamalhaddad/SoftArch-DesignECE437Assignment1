public class TAImplies extends TABool implements TABoolOps{

    private Boolean value_implies;
    private TABool operand1, operand2;
    private String name = null;

    TAImplies(TABool a, TABool b) {

        operand1 = a;
        operand2 = b;
    }

    TAImplies(String s, TABool a, TABool b) {

        operand1 = a;
        operand2 = b;
        name = s;
    }


    public Boolean getValue() {

        return value_implies;
    }

    public void evaluate(){

        if (operand1.getValue())
             value_implies = operand2.getValue();
        else
            value_implies = true;
    }

    public void printState(){

        System.out.println(value_implies);
    }

    public void list() {

        if (name == null){
            System.out.print("(implies ");
            operand1.list();
            System.out.print(" ");
            operand2.list();
            System.out.print(" )");
    }

        else
            System.out.print(value_implies);

    }
}
