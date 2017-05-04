/**
 * Created by Abbas on 1/04/2017.
 */
public class TAState implements TAObject {
    String name;
    int id;

    public TAState(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return name + ":" + id;
    }
}
