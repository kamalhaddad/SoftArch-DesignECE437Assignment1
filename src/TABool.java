public class TABool implements TAObject{

    private Boolean value_boolean;
    private final String name;

    public TABool(){

        name = "";
    }

    public TABool(String s){

        name = s;
    }

    public void set(Boolean b){

        value_boolean = b;
    }

    Boolean getValue(){

        return value_boolean;
    }

    public void evaluate(){

    }

    public void list(){

        System.out.print(name);
    }
}