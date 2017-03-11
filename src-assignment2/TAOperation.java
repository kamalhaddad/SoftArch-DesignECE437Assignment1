import java.util.ArrayList;
import java.util.HashSet;
/*
 * Type Abstraction for both arithmetic and boolean operations
 */
public interface TAOperation extends TAObject {
    void list();
    void evaluate();
    TAPrimitive getValueTA();
    ArrayList getOperands();
    HashSet<String> primitives = new HashSet<String>(); //primitives that have a domain set
}
