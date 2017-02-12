public class TAArrayAccess<T extends TADataType>  implements TADataType{

    private T element;
    private String name;

    TAArrayAccess(TAArray<T> a, TAConstant c){
            element = a.array.get((int)c.getValue());
    }

    TAArrayAccess(String s, TAArray<T> a, TAConstant c) throws Exception {
        NamesChecker.check(s);
        element = a.array.get((int)c.getValue());
    }

    @Override
    public void list() {

    }

    @Override
    public void evaluate() {

    }
}
