public class TAMinus implements TANumber, TAArithOps {

    private Number value_minus;
    private TANumber operand1, operand2;

    TAMinus(TAInt a, TAInt b){
            operand1 = a;
            operand2 = b;
    }

    TAMinus(TADouble a, TADouble b){
        operand1 = a;
        operand2 = b;

    }

    public Number getValue(){

         return value_minus;
    }

    public void evaluate(){

        value_minus = operand1.getValue().doubleValue() - operand2.getValue().doubleValue();
    }

    public void list(){

        System.out.print("(- ");
        operand1.list();
        System.out.print(" ");
        operand2.list();
        System.out.print(" )");
    }
}
