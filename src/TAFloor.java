import static java.lang.StrictMath.floor;

public class TAFloor implements TANumber, TAArithOps{

    private int value_floor;
    TADouble operand;

    TAFloor(TADouble d){
        operand = d;

    }

    protected int get(){
        return value_floor;
    }

    void evaluate(){}

    public void list(){

        System.out.print("(floor ");
        operand.list();
        System.out.print(" )");
    }
}
