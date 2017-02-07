public class TAMultiply implements TANumber, TAArithOps {

    private Number value_multiply;

    TAMultiply(TAInt a, TAInt b){

    }

    TAMultiply(TADouble a, TADouble b){

    }


    protected Number getValue(){
        return value_multiply;
    }

    void evaluate(){}
}
