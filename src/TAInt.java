public class TAInt implements TANumber{

    private int value_int;
    private String name;


    public TAInt(String s){

        name =s;
    }

    protected TAInt(){

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