public class TAConstant implements TANumber {

    private final Number value;
    private String name;

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

    public void evaluate(){}

    public void list(){}

    public Number getValue() {
        return value;
    }
}
