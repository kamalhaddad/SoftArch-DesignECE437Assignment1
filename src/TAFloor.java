import static java.lang.StrictMath.floor;

public class TAFloor implements TANumber, TAArithOps{

    private int value_floor;

    TAFloor(TADouble d){

    }

    protected int get(){
        return value_floor;
    }

    void evaluate(){}

}
