public class TAInt implements TANumber{

    private int value_int;
    private final String name;


    public TAInt(String s){

        name =s;
    }

    public void evaluate(){

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
}