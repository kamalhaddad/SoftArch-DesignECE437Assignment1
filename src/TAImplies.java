public class TAImplies extends TABool implements TANumber{

    private Boolean value_implies;
    TABool operand1, operand2;

    TAImplies(TABool a, TABool b) {
        operand1 = a;
        operand2 = b;
    }

    protected Boolean getValue() { return value_implies;}

    void evaluate(){}

    public void list(){

        System.out.print("(implies ");
        operand1.list();
        System.out.print(" ");
        operand2.list();
        System.out.print(" )");

    }
}
