public class TAPlus implements TANumber,TAArithOps{

    private Number value_plus;
    private TANumber operand1, operand2;

    TAPlus(TAInt a, TAInt b){

        operand1 = a;
        operand2 = b;
    }

    TAPlus(TADouble a, TADouble b){

        operand1 = a;
        operand2 = b;
    }

    public Number getValue(){

        return value_plus;
    }

    public void evaluate(){

        value_plus = operand1.getValue().doubleValue() + operand2.getValue().doubleValue();

    }

    public void list(){

        System.out.print("(+ ");
        operand1.list();
        System.out.print(" ");
        operand2.list();
        System.out.print(" )");
    }
}
