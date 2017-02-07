import static java.lang.StrictMath.floor;

public class TAFloor implements TANumber,TAArithOps{

    private int value_floor;
    TADouble operand;

    TAFloor(TADouble d){

        operand = d;
    }

    public Integer getValue() {

        return value_floor;
    }

    public void evaluate(){

        value_floor = (int)floor((double) operand.getValue());
    }

    public void list(){

        System.out.print("(floor ");
        operand.list();
        System.out.print(" )");
    }
}
