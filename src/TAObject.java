import java.util.HashSet;

public interface TAObject{

    abstract void list();
    abstract void evaluate();
    static  HashSet<String> Names = new HashSet<String>();
}