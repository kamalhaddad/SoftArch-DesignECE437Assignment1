public class TAMinus implements TANumber, TAArithOps {

    private Number value_minus;

    TAMinus(TAInt a, TAInt b){

        value_minus = a.get() - b.get();
    }

    TAMinus(TADouble a, TADouble b){

        value_minus = a.get() - b.get();
    }

    TAMinus(TAInt a, TAArithOps b){
        if(b.get() instanceof Integer)
            value_minus = a.get() - (Integer)b.get();
        else
            throw new IllegalArgumentException();

    }

    TAMinus(TADouble a, TAArithOps b){
        if(b.get() instanceof Double)
            value_minus = a.get() - (Double)b.get();
        else
            throw new IllegalArgumentException();

    }

    TAMinus(TAArithOps a , TAInt b){
        if(a.get() instanceof Integer)
            value_minus = (Integer)a.get() - b.get();
        else
            throw new IllegalArgumentException();

    }

    TAMinus(TAArithOps a, TADouble b){
        if(a.get() instanceof Double)
            value_minus = (Double)a.get() - b.get();
        else
            throw new IllegalArgumentException();

    }

    Number get(){
        return value_minus;
    }

    void evaluate(){}
}
