public class TAConstant implements TADataType {

    private final Number value;

    TAConstant(int op){
        value = op;
    }

    TAConstant(double op){
        value = op;
    }

    public void evaluate(){}

    public void list(){}
}
