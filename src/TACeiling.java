import static java.lang.StrictMath.ceil;

public class TACeiling extends TAInt implements TAArithOps{

    int value_ceiling;
    TADouble operand;

    TACeiling(TADouble d){

        operand = d;
    }

    public Integer getValue(){

        return value_ceiling;
    }

    public void evaluate(){

        value_ceiling = (int)(ceil((double)operand.getValue()));
    }

    public void list(){
        System.out.print("( ceiling ");
        operand.list();
        System.out.print(" )");
    }

}
