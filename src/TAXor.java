public class TAXor extends TABool implements TABoolOps {

    private Boolean value_xor;


    TAXor(TABool a, TABoolOps b){
        value_xor = a.get() ^ b.get();
    }

    TAXor(TABool a, TABool b){
        value_xor= a.get() ^  b.get();
    }

    TAXor(TABoolOps a, TABool b){
        value_xor = a.get() ^ b.get();
    }
    TAXor(TABoolOps a, TABoolOps b){
        value_xor= a.get() ^ b.get();
    }


    Boolean get() { return value_xor;}

    void evaluate(){}
}
