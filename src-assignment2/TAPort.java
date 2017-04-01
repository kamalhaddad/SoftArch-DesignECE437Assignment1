/**
 * Created by Abbas on 1/04/2017.
 */
public class TAPort implements TAObject {
    String name;
    int id;

    public TAPort(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public boolean isReady() {
        return false;
    }
}
