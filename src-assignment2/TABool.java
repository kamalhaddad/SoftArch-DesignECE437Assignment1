import java.util.ArrayList;

/*
Type Abstraction for Boolean data type
*/
public class TABool implements TAPrimitive {

    private Boolean value_boolean;
    private String name = null;

    protected TABool(){

    }

    public TABool(String s) throws Exception {

        NamesChecker.check(s);
        name = s;
    }
    public String getName(){
        return name;
    }

    public void set(Boolean b) {
        value_boolean = b;
    }

    public Boolean getValue(){
        return value_boolean;
    }

    public void setValue(Object o) { this.value_boolean = (boolean) o; }

    public void evaluate(){

    }

    public void list(){
        if(name == null)
            System.out.print("( "+value_boolean+" ) ");

        else
        System.out.print(name);
    }

    public void printState(){
        System.out.println(value_boolean);

    }

    public ArrayList getOperands(){
        ArrayList opList = new ArrayList();
        opList.add(this);
        return opList;
    }

}