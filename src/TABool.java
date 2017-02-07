public class TABool implements TAObject{

    private Boolean value_boolean;

    public TABool(){

    }

    public void set(Boolean b){
        value_boolean = b;
    }

    Boolean get(){
        return value_boolean;
    }

    void evaluate(){}
}