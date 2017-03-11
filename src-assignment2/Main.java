public class Main {
/*
Class Main is purely for testing purposes
*/
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
       ai.list();

       TADomain domain = new TADomain(new TAConstant(1), new TAConstant(2), new TAConstant(3));
       TAInt quantifier = new TAInt("quantifer");
       TAInt var = new TAInt("dummy");
       TALessThan formula = new TALessThan(quantifier, var);

       // Testing if the domain: {1,2,3} has all values less than 4 i.e. true
       var.set(4);
       TAForAll forAll = new TAForAll(quantifier, domain, formula);
       forAll.evaluate();
       System.out.println(forAll.getValue());

       // Test conditional
       TABool b = new TABool("b");
       TABool c = new TABool("c");
       b.set(true);
       c.set(false);
       TAAnd e3 = new TAAnd(b, c);
       // If for every int x in the domain {1,2,3} such that x < 4 i.e. true
       // formula should be executed i.e. should print true
       TAConditional myIf = new TAConditional(forAll, formula, e3);
       myIf.evaluate();
       System.out.println(myIf.getValue());

       // Testing if the domain: {1,2,3} has any values less than 0 i.e. false
       var.set(0);
       TAThereExists thereExists = new TAThereExists(quantifier, domain, formula);
       thereExists.evaluate();
       System.out.println(thereExists.getValue());

       // If there exists an int in the domain {1,2,3} such that x < 0 i.e. false
       // e3 should be executed i.e. should print false
       myIf = new TAConditional(thereExists, formula, e3);
       myIf.evaluate();
       System.out.println(myIf.getValue());
    }
}
