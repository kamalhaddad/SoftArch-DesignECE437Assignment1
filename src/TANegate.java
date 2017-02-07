public class TANegate implements TANumber, TAArithOps {

    private Number value_negate = 0;
    TANumber operand;

    TANegate(TAInt i){
        operand = i;

    }

    TANegate(TADouble d){
        operand = d;

    }

    protected Number getValue(){

     return value_negate;
    }

    void evaluate(){}

    public void list(){

        System.out.print("(- ");
        operand.list();
        System.out.print(" )");
    }
}
