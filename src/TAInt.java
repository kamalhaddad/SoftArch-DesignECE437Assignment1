/*
Type Abstraction for integers
*/
public class TAInt implements TANumber{

    private int value_int;
    private String name = null;

    public TAInt(String s) throws Exception {
        NamesChecker.check(s);
        name = s;
        value_int = 0;
    }

    protected TAInt(){
    }

    public void set(int i){

        value_int = i;
    }

    public Integer getValue(){

        return value_int;
    }

    public void list(){

        System.out.print(name);
    }

    public TAInt type(){
            return new TAInt();
    }

}