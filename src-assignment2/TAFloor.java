import static java.lang.StrictMath.floor;
/*
Type Abstraction for floor operation
*/
public class TAFloor extends TAInt implements TATerm {

    private int value_floor;
    private TADouble operand;
    private String name = null;

    TAFloor(TADouble d){

        operand = d;
    }

    TAFloor(String s, TADouble d){

        operand = d;
        name  = s;
    }

    public Integer getValue() {

        return value_floor;
    }

    public void evaluate(){

        value_floor = (int)floor((double) operand.getValue());
    }

    public void list(){

        if(name == null) {
            System.out.print("(floor ");
            operand.list();
            System.out.print(" )");
        }
        else
            System.out.print(name);
    }
}
