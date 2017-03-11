import java.util.ArrayList;

/*
Type Abstraction for double data type
*/
public class TADouble implements TANumber{

    private double value_double;
    private String name = null;


    public TADouble(String s){

        name = s;
    }

    protected TADouble(){
    }

    public void set(double d){

        value_double = d;
    }

    public void evaluate(){

    }

    public Double getValue(){

        return value_double;
    }

    @Override
    public String getName() {
        return null;
    }

    public void list(){

        if(name == null)
            System.out.print("( "+ value_double+" )");

        else
            System.out.print(name);
    }

    public ArrayList getOperands(){
        ArrayList opList = new ArrayList();
        opList.add(this);
        return opList;
    }

}
