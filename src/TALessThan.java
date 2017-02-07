public class TALessThan extends TABool implements TABoolOps{

    private Boolean state;

    TALessThan(TAInt a, TAInt b){

    }

    TALessThan(TADouble a , TADouble b){

    }



    protected Boolean get() {return state;}

    void evaluate(){};
}