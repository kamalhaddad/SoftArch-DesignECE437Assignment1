public class TAXor extends TABool implements TABoolOps {

    private Boolean value_xor;
    private TABool operand1, operand2;

    TAXor(TABool a, TABool b){

        operand1 = a;
        operand2 = b;
    }

    public Boolean getValue() {

        return value_xor;
    }

    public void evaluate(){

        value_xor = operand1.getValue() ^ operand2.getValue();
    }

    public void list(){

        System.out.print("(xor ");
        operand1.list();
        System.out.print(" ");
        operand2.list();
        System.out.print(" )");
    }
}
