/**
 * Created by kamal on 3/10/17.
 */
interface DomainChecker {
    public static void check(String name) throws Exception {
        if(TAOperation.primitives.contains(name))
            throw new Exception(name + " already exists.");
        else
            TAOperation.primitives.add(name);
    }
}
