public class TABool implements TADataType{

    private Boolean value_boolean;
    private String name;

    protected TABool(){

    }
    public TABool(String s) throws Exception {

        NamesChecker.check(s);
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

    public void printState(){
        System.out.println(value_boolean);

    }
}