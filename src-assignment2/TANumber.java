import java.util.ArrayList;

/*
Type Abstraction for numbers(integers and doubles)
*/
public interface TANumber extends TADataType {
    Number getValue();
    void list();
    String getName();
    ArrayList getOperands();

}
