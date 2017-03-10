/*
Interface NamesChecker checks the names of all expressions
and data types and throws throwing exception when there are
duplicate names in the Names HashSet.
 */
interface NamesChecker {

    public static void check(String name) throws Exception {
        if(TAObject.Names.contains(name))
            throw new Exception(name + " already exists.");
        else
            TAObject.Names.add(name);
    }
}
