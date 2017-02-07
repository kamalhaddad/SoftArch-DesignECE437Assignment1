import static java.lang.StrictMath.floor;

public class TAFloor implements TANumber, TAArithOps{

    int value_floor;

    TAFloor(TADouble d){
        value_floor = (int)floor(d.get());
    }

    Integer get(){
        return value_floor;
    }

    void evaluate(){}

}
