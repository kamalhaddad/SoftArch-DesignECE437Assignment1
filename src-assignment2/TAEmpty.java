/**
 * Created by Abbas on 14/03/2017.
 */
public class TAEmpty implements TAStatement {

    public TAEmpty() {}

    @Override
    public void evaluate() {
        // do nothing
    }

    @Override
    public void list() {
        System.out.println(" --- Empty statement --- ");
    }

    @Override
    public TAPrimitive getValueTA() {
        return null;
    }
}
