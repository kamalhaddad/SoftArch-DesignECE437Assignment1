public class TAPlus implements TANumber,TAArithOps{

    private Number value_plus;

    TAPlus(TAInt a, TAInt b){

        value_plus = a.get() + b.get();
    }

    TAPlus(TADouble a, TADouble b){

        value_plus = a.get() + b.get();
    }

    TAPlus(TAInt a, TAArithOps b){
        if(b.get() instanceof Integer)
        value_plus = a.get() + (Integer)b.get();
        else
            throw new IllegalArgumentException();

    }

    TAPlus(TADouble a, TAArithOps b){
        if(b.get() instanceof Double)
            value_plus = a.get() + (Double)b.get();
        else
            throw new IllegalArgumentException();

    }

    TAPlus(TAArithOps a , TAInt b){
        if(a.get() instanceof Integer)
            value_plus = (Integer)a.get() + b.get();
        else
            throw new IllegalArgumentException();

    }

    TAPlus(TAArithOps a, TADouble b){
        if(a.get() instanceof Double)
            value_plus = (Double)a.get() + b.get();
        else
            throw new IllegalArgumentException();

    }

    Number get(){
        return value_plus;
    }

    void evaluate(){}
}
