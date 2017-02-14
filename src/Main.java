public class Main {

    public static void main(String[] args) throws Exception {

       /* TAInt x = new TAInt("x");
        TADouble d = new TADouble("d");
        TACeiling y =new TACeiling(d);
        TABool b = new TABool("b");
        TALessThan t1 = new TALessThan(x,y);
        TAAnd t2 = new TAAnd (b,t1);
        t2.list();

        TAAnd a = new TAAnd("hello",b,b);
        TAAnd z = new TAAnd("hello",b,b);
        */

       TAConstant N = new TAConstant(16);
       TAConstant one = new TAConstant (1);

       TAInt x = new TAInt("x");

       TADouble d = new TADouble("d");
       TAPair p = new TAPair(x,d);
       TAArray a = new TAArray("a", x.type() , N);
       TAInt i = new TAInt ("i");
       TAPlus exp = new TAPlus(i, one);
       TAArrayAccess ai = new TAArrayAccess(a, one);
       ai.set(2.8);

    }
}
