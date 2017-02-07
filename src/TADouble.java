public class TADouble implements TANumber{

    private double value_double;
    private String name;

    public TADouble() {

    }

    public TADouble(String s){
        name = s;
    }

    public void set(double d){
        value_double = d;
    }

    public void evaluate(){

    }

    protected double getValue(){
        return value_double;
    }

    public void list(){
        System.out.print(name);
    }

}
