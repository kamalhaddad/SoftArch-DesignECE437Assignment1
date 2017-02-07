import static java.lang.StrictMath.ceil;

public class TACeiling implements TAArithOps, TANumber{

    int value_ceiling;

    TACeiling(TADouble d){

    }

    protected Integer getValue(){
        return value_ceiling;
    }

    void evaluate(){}

}
