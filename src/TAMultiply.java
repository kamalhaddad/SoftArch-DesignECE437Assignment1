public class TAMultiply implements TANumber, TAArithOps {

    private Number value_multiply;

    TAMultiply(TAInt a, TAInt b){

        value_multiply = a.get() * b.get();
    }

    TAMultiply(TADouble a, TADouble b){

        value_multiply = a.get() * b.get();
    }

    TAMultiply(TAInt a, TAArithOps b){
        if(b.get() instanceof Integer)
            value_multiply = a.get() * (Integer)b.get();
        else
            throw new IllegalArgumentException();

    }

    TAMultiply(TADouble a, TAArithOps b){
        if(b.get() instanceof Double)
            value_multiply = a.get() * (Double)b.get();
        else
            throw new IllegalArgumentException();

    }

    TAMultiply(TAArithOps a , TAInt b){
        if(a.get() instanceof Integer)
            value_multiply = (Integer)a.get() * b.get();
        else
            throw new IllegalArgumentException();

    }

    TAMultiply(TAArithOps a, TADouble b){
        if(a.get() instanceof Double)
            value_multiply = (Double)a.get() * b.get();
        else
            throw new IllegalArgumentException();

    }

    Number get(){
        return value_multiply;
    }

    void evaluate(){}
}
