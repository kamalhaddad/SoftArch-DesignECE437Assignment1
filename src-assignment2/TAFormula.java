import java.util.ArrayList;

/*
Interface for Boolean operations
*/
public interface TAFormula extends TAOperation {
    public void printState();
    public Boolean getValue();
    public ArrayList getOperands();
}
