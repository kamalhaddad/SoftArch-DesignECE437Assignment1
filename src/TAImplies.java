public class TAImplies extends TABool implements TABoolOps{

    private Boolean value_implies;
    TABool operand1, operand2;

    TAImplies(TABool a, TABool b) {
        operand1 = a;
        operand2 = b;
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

    public void list(){

        System.out.print("(implies ");
        operand1.list();
        System.out.print(" ");
        operand2.list();
        System.out.print(" )");

    }
}
