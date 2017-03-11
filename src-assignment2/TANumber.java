import java.util.ArrayList;

/*
Type Abstraction for numbers(integers and doubles)
*/
public interface TANumber extends TAPrimitive {
    Number getValue();
    void list();
    ArrayList getOperands();

}
