import static java.lang.StrictMath.ceil;

public class TACeiling extends TAInt implements TAArithOps{

    int value_ceiling;
    private TADouble operand;
    private String name;

    TACeiling(TADouble d){

        operand = d;
    }

    TACeiling(String s, TADouble d) throws Exception {

        NamesChecker.check(s);
        name = s;
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
