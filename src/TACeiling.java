import static java.lang.StrictMath.ceil;

public class TACeiling implements TANumber,TAArithOps{

    int value_ceiling;
    TANumber operand;

    TACeiling(TANumber d){
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
