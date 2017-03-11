import java.util.ArrayList;

/*
Type abstraction for a constant(integer or double)
*/
public class TAConstant implements TANumber, TAPrimitive {

    private final Number value;
    private String name = null;

    TAConstant(int op){
        value = op;
    }

    TAConstant(double op){
        value = op;
    }

    TAConstant(String s, int op) throws Exception {
        NamesChecker.check(s);
        name = s;
        value = op;
    }

    TAConstant(String s, double op) throws Exception {
        NamesChecker.check(s);
        name = s;
        value = op;
    }

    public void list(){
        if(name == null)
            System.out.print("( "+value+ " )");
        else
            System.out.print(name);
    }

    public void setValue(Object o) {
    }

    public Number getValue() {
        return value;
    }

    public ArrayList getOperands(){
        ArrayList opList = new ArrayList();
        opList.add(this);
        return opList;
    }

    public String getName(){
        return name;
    }
}
