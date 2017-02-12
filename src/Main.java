
public class Main {

    public static void main(String[] args) throws Exception {

        TAInt x = new TAInt("x");
        TADouble d = new TADouble("d");
        TACeiling y =new TACeiling(d);
        TABool b = new TABool("b");
        TALessThan t1 = new TALessThan(x,y);
        TAAnd t2 = new TAAnd (b,t1);
        t2.list();

        TAAnd a = new TAAnd("hello",b,b);
        TAAnd z = new TAAnd("hello",b,b);




    }
}
