public class TAInt implements TANumber{

    private int value_int;

    public TAInt(){

        value_int = 0;

    }

    public void evaluate(){

    }

    public void set(int i){
        value_int = i;
    }

    protected int getValue(){
        return value_int;
    }
}