public class TAPair implements TADataType{
    private final TADataType first;
    private final TADataType second;
    private  String name;
    private boolean flag;

    TAPair(TADataType a, TADataType b){
        flag =false;
        first = a;
        second = b;
    }

    TAPair(String s, TADataType a, TADataType b) throws Exception {
        NamesChecker.check(s);
        flag = true;
        name = s;
        first = a;
        second = b;

    }

    public TADataType first(){
        return first;
    }

    public TADataType next(){
        return second;
    }

    public void evaluate(){};

    public void list(){
        if(flag)
            System.out.println(name);
        else
            System.out.print("( ");
            first.list();
            System.out.print(", ");
            second.list();
            System.out.print(" ) ");
    }



}
