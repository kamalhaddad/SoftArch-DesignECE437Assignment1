import java.util.ArrayList;
/*
Type Abstraction for arrays of TADataType
*/
public class TAArray<T extends TADataType> implements TADataType{

    private String name = null;
    private int size;
    ArrayList<T> array;

    TAArray(String s, T t, TAInt n) throws Exception {

            NamesChecker.check(s);
            name = s;
            size = n.getValue();
            array = new ArrayList<T>(size);
            for(int i = 0;i<size;i++)
            array.add(t);
    }

    TAArray(String s, T t, TAConstant n) throws Exception {

        NamesChecker.check(s);
        name = s;
        size = n.getValue().intValue();
        array = new ArrayList<T>(size);
        for(int i = 0;i<size;i++)
        array.add(t);
    }

    public int size(){
        return size;
    }

    public void list() {
        System.out.print(name);
    }


}
