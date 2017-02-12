import java.util.ArrayList;

public class TAArray<T extends TADataType> implements TADataType{

    private final String name;
    private int size;
    private ArrayList<T> array;

    TAArray(String s, T t, TAInt n) throws Exception {

            NamesChecker.check(s);
            name = s;
            size = n.getValue();
            array = new ArrayList<T>(size);
    }

    TAArray(String s, T t, TAConstant n) throws Exception {

        NamesChecker.check(s);
        name = s;
        size = n.getValue().intValue();
        array = new ArrayList<T>(size);

    }

    @Override
    public void list() {

    }

    @Override
    public void evaluate() {

    }
}
