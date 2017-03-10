/*
Type abstraction for a constant(integer or double)
*/
public class TAConstant implements TANumber {

    private final Number value;
    private String name = null;

    TAConstant(int op){
        value = op;
    }

    TAConstant(double op){
        value = op;
    }

    TAConstant(String s, int op) throws Exception {
        NamesChecker.check(s);
        name = s;
        value = op;
    }

    TAConstant(String s, double op) throws Exception {
        NamesChecker.check(s);
        name = s;
        value = op;
    }

    public void list(){
        if(name == null)
            System.out.print("( "+value+ " )");
        else
            System.out.print(name);
    }

    public Number getValue() {
        return value;
    }
}
