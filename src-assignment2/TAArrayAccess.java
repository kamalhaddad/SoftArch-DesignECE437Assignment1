/*
Type Abstraction for elements in TAArray
*/
public class TAArrayAccess<T extends TADataType>  implements TADataType{

    private T element;
    private String name = null;
    private int index;
    private final TAArray Array;

    TAArrayAccess(TAArray<T> a, TAConstant c){

            element = a.array.get((int)c.getValue());
            index =  (int)c.getValue();
            Array = a;
    }

    TAArrayAccess(String s, TAArray<T> a, TAConstant c) throws Exception {

        NamesChecker.check(s);
        element = a.array.get((int)c.getValue());
        index =  (int)c.getValue();
        Array = a;
    }

    TAArrayAccess(TAArray<T> a, TAInt i){

        element = a.array.get((int)i.getValue());
        index =  (int)i.getValue();
        Array = a;
    }

    TAArrayAccess(String s, TAArray<T> a, TAInt i) throws Exception {

        NamesChecker.check(s);
        element = a.array.get((int)i.getValue());
        index =  (int)i.getValue();
        Array = a;
    }

    public void set(T t){

        if(Array.array.get(0).getClass().equals(t.getClass()))
            Array.array.set(index, t);
    }

    public void set(int i) throws Exception {

        TAInt temp = new TAInt();
        temp.set(i);

        if(Array.array.get(0).getClass().equals(temp.getClass()))
            Array.array.set(index , (T) temp);

        else
            throw new Exception("Invalid Types Error.");

    }

    public void set(double d) throws Exception {

        TADouble temp = new TADouble();
        temp.set(d);

        if(Array.array.get(0).getClass().equals(temp.getClass()))
            Array.array.set(index , (T) temp);

        else
            throw new Exception("Invalid Types Error.");

    }

    public void set(boolean b) throws Exception {

        TABool temp = new TABool();
        temp.set(b);

        if(Array.array.get(0).getClass().equals(temp.getClass()))
            Array.array.set(index , (T) temp);

        else
            throw new Exception("Invalid Types Error.");

    }


    public void list() {
        if(name == null) {

            System.out.print("( ");
            Array.list();
            System.out.print("[" +index + "]) ");
        }

        else
            System.out.print(name);
    }

}
