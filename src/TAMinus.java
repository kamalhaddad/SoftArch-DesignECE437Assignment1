public class TAMinus implements TANumber, TAArithOps {

    private Number value_minus;
    private TANumber operand1, operand2;
    private boolean flag;

    TAMinus(TAInt a, TAInt b){
            flag = true;
            operand1 = a;
            operand2 = b;
    }

    TAMinus(TADouble a, TADouble b){
        flag = false;
        operand1 = a;
        operand2 = b;

    }

    TAMinus(TAInt i){
        flag = false;
        operand1 = i;

    }

    TAMinus(TADouble d){
        flag = false;
        operand2 = d;

    }

    public Number getValue(){

         return value_minus;
    }

    public void evaluate(){
        if(flag)
        value_minus = operand1.getValue().doubleValue() - operand2.getValue().doubleValue();
        else
            value_minus = operand1.getValue().doubleValue() * -1.0;
    }

    public void list(){

        System.out.print("(- ");
        operand1.list();
        if(flag) {
            System.out.print(" ");
            operand2.list();
        }
        System.out.print(" )");
    }


}
