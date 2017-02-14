public class TADouble implements TANumber{

    private double value_double;
    private String name = null;


    public TADouble(String s){

        name = s;
    }

    protected TADouble(){
    }

    public void set(double d){

        value_double = d;
    }

    public void evaluate(){

    }

    public Double getValue(){

        return value_double;
    }

    public void list(){
        if(name == null)
        {
            System.out.print("( "+ value_double+" )");
        }
        else
            System.out.print(name);
    }

}
