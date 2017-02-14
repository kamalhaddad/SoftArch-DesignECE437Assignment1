import java.util.ArrayList;

public class TAArrayAccess<T extends TADataType>  implements TADataType{

    private T element;
    private String name;
    private int index;
    private final ArrayList<T> array;

    TAArrayAccess(TAArray<T> a, TAConstant c){
            element = a.array.get((int)c.getValue());
            index =  (int)c.getValue();
            array = a.array;
    }

    TAArrayAccess(String s, TAArray<T> a, TAConstant c) throws Exception {
        NamesChecker.check(s);
        element = a.array.get((int)c.getValue());
        index =  (int)c.getValue();
        array = a.array;
    }

    TAArrayAccess(TAArray<T> a, TAInt i){
        element = a.array.get((int)i.getValue());
        index =  (int)i.getValue();
        array = a.array;
    }

    TAArrayAccess(String s, TAArray<T> a, TAInt i) throws Exception {
        NamesChecker.check(s);
        element = a.array.get((int)i.getValue());
        index =  (int)i.getValue();
        array = a.array;
    }

    public void set(T t){

        if(array.get(0).getClass().equals(t.getClass()))
        array.set(index, t);
    }

    public void set(int i) throws Exception {

        TAInt temp = new TAInt();
        temp.set(i);
        if(array.get(0).getClass().equals(temp.getClass()))
        array.set(index , (T) temp);
        else
            throw new Exception("Invalid types error.");


    }

    public void set(double d) throws Exception {

        TADouble temp = new TADouble();
        temp.set(d);
        if(array.get(0).getClass().equals(temp.getClass()))
        array.set(index , (T) temp);

        else
            throw new Exception("Invalid types error.");

    }

    public void set(boolean b) throws Exception {

        TABool temp = new TABool();
        temp.set(b);
        if(array.get(0).getClass().equals(temp.getClass()))
            array.set(index , (T) temp);

        else
            throw new Exception("Invalid types error.");

    }


    @Override
    public void list() {

    }

    @Override
    public void evaluate() {

    }
}
