public interface NamesChecker {

    public static void check(String name) throws Exception {
        if(TAObject.Names.contains(name))
            throw new Exception(name + " already exists.");
        else
            TAObject.Names.add(name);
    }
}
