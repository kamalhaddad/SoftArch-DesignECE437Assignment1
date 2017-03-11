import java.util.ArrayList;

/*
Type Abstraction for integers
*/
public class TAInt implements TANumber, TAPrimitive {

    private int value_int;
    private String name = null;

    public TAInt(String s) throws Exception {
        NamesChecker.check(s);
        name = s;
        value_int = 0;
    }

    protected TAInt(){
    }

    public String getName(){
        return name;
    }

    public void set(int i){

        value_int = i;
    }

    public Integer getValue(){

        return value_int;
    }

    public void setValue (Object o) {
        this.value_int = (int) o;
    }

    public void list(){

        System.out.print(name);
    }

    public TAInt type(){
            return new TAInt();
    }

    public ArrayList getOperands(){
        ArrayList opList = new ArrayList();
        opList.add(this);
        return opList;
    }

}