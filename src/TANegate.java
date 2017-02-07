public class TANegate implements TANumber, TAArithOps {

    private Number value_negate = 0;

    TANegate(TAInt i){

    }

    TANegate(TADouble d){

    }

    protected Number getValue(){

     return value_negate;
    }

    void evaluate(){}
}
