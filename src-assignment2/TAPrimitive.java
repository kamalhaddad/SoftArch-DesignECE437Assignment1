public interface TAPrimitive<T>  extends TADataType {
    T getValue(); //added generic and getValue function
    String getName(); //returns the names of TAPrimitive types
    void setValue(Object o);
}
