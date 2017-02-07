public class TAXor extends TABool implements TABoolOps {

    private Boolean value_xor;
    private TABool operand1, operand2;

    TAXor(TABool a, TABool b){

        operand1 = a;
        operand2 = b;
    }

    protected Boolean get() { return value_xor;}

    void evaluate(){}

    public void list(){

        System.out.print("(xor ");
        operand1.list();
        System.out.print(" ");
        operand2.list();
        System.out.print(" )");
    }
}
