
public class Main {



    public static void main(String[] args){

        TAInt x = new TAInt();
        TADouble d = new TADouble();
        TACeiling y =new TACeiling(d);
        TABool b = new TABool();
        TALessThan t1 = new TALessThan(d,d);
        TAAnd t2 = new TAAnd (b,t1);

    }
}
