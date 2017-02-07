public class TADivide implements TANumber, TAArithOps {

    private Number value_divide;

    TADivide(TAInt a, TAInt b){

    }

    TADivide(TADouble a, TADouble b){

    }

    protected Number getValue(){
        return value_divide;
    }

    void evaluate(){}
}
