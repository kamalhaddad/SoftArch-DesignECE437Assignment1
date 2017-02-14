public class TAPair implements TADataType{
    private final TADataType first;
    private final TADataType second;
    private  String name = null;

    TAPair(TADataType a, TADataType b){
        first = a;
        second = b;
    }

    TAPair(String s, TADataType a, TADataType b) throws Exception {
        NamesChecker.check(s);
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
        if(name != null)
            System.out.print(name);
        else
            System.out.print("( ");
            first.list();
            System.out.print(", ");
            second.list();
            System.out.print(" ) ");
    }



}
