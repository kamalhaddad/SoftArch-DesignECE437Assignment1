/**
 * Created by Abbas on 14/03/2017.
 */
public interface TAStatement extends TAObject {
    void evaluate();
    void list();
    TAPrimitive getValueTA();
}
