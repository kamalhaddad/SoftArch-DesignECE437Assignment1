public class TADivide implements TANumber, TAArithOps {

    private Number value_divide;
    TANumber operand1, operand2;

    TADivide(TAInt a, TAInt b){
            operand1 = a;
            operand2 = b;
    }

    TADivide(TADouble a, TADouble b){
            operand1 = a;
            operand2 = b;

    }

    protected Number getValue(){
        return value_divide;
    }

    void evaluate(){}

    public void list(){

        System.out.print("(/ ");
        operand1.list();
        System.out.println(" ");
        operand2.list();
        System.out.print(" )");
    }
}
