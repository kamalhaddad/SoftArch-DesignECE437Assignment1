public class TANegate implements TANumber, TAArithOps {

    private Number value_negate = 0;

    TANegate(TAInt i){

        value_negate = i.get() * -1;
    }

    TANegate(TADouble d){

        value_negate = d.get() * -1.0;
    }

    protected Number get(){

     return value_negate;
    }

    void evaluate(){}
}
