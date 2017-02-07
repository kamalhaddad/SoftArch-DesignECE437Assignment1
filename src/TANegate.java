public class TANegate implements TANumber, TAArithOps {

    private Number value_negate = 0;
    TANumber operand;

    TANegate(TAInt i){
        operand = i;

    }

    TANegate(TADouble d){
        operand = d;

    }

    public Number getValue(){

     return value_negate;
    }

    public void evaluate(){

        value_negate = operand.getValue().doubleValue() * -1.0;
    }

    public void list(){

        System.out.print("(- ");
        operand.list();
        System.out.print(" )");
    }
}
