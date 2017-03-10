/*
 * Type Abstraction for both arithmetic and boolean operations
 */
public interface TAOperation extends TAObject {
    public void list();
    public void evaluate();
    // Gets the result object of the evaluate
    // public TAPrimitive getResultClass();
}
