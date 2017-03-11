import java.util.ArrayList;
import java.util.HashSet;
/*
 * Type Abstraction for both arithmetic and boolean operations
 */
public interface TAOperation extends TAObject {
    public void list();
    public void evaluate();
    ArrayList getOperands();
    static HashSet<String> primitives = new HashSet<String>(); //primitives that have a domain set

    // Gets the result object of the evaluate
    // public TAPrimitive getResultClass();
}
