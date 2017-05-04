import java.util.HashSet;
import java.util.Set;

public class Main {
/*
Class Main is purely for testing purposes
*/
    public static void main(String[] args) throws Exception {
        TAConstant N = new TAConstant(16);
        TAConstant one = new TAConstant (1);

        TAInt x = new TAInt("x");

        TAArray a = new TAArray("a", x.type() , N);
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
        TABool e = new TABool("e");
        TABool f = new TABool("f");
        b.set(true);
        c.set(true);
        e.set(false);
        f.set(false);
        TAAnd e3 = new TAAnd(b, c);
        TAAnd e4 = new TAAnd(e, f);
        TAAssignment t = new TAAssignment(e3, c);
        TAAssignment t1 = new TAAssignment(e4, f);
        // If for every int x in the domain {1,2,3} such that x < 4 i.e. true
        // formula should be executed i.e. should print true
        TAConditional myIf = new TAConditional(forAll, t, t1);
        myIf.evaluate();
        System.out.println("Conditional 1 " + myIf.getValue());

        // Testing if the domain: {1,2,3} has any values less than 0 i.e. false
        var.set(0);
        TAThereExists thereExists = new TAThereExists(quantifier, domain, formula);
        thereExists.evaluate();
        thereExists.list();

        // If there exists an int in the domain {1,2,3} such that x < 0 i.e. false
        // e3 should be executed i.e. should print false
        myIf = new TAConditional(thereExists, t, t1);
        myIf.evaluate();
        System.out.println("Conditional 2 " + myIf.getValue());

        // Test TASystem
        TASystem system = new TASystem();

        // states
        TAState s1 = new TAState("s1", 1);
        TAState s2 = new TAState("s2", 2);
        TAState s3 = new TAState("s3", 3);
        Set<TAState> s = new HashSet<>();
        s.add(s1); s.add(s2); s.add(s3);

        //ports
        TAPort p1 = new TAPort("p1", 1);
        TAPort p2 = new TAPort("p2", 1);
        TAPort p3 = new TAPort("p3", 1);
        Set<TAPort> p = new HashSet<>();
        p.add(p1); p.add(p2); p.add(p3);

        // components
        TAComponent c1 = new TAComponent(s1, s, p);
        TAComponent c2 = c1;

        // transitions
        TATransition tr1 = new TATransition(s1, s2);
        TATransition tr2 = new TATransition(s2, s3);
        TATransition tr3 = new TATransition(s3, s1);
        // transition labels
        TATransitionLabel trl1 = new TATransitionLabel(p1, new TAAnd(b, c), new TAAssignment(e4, c));
        TATransitionLabel trl2 = new TATransitionLabel(p2, new TAAnd(b, c), new TAAssignment(e4, c));
        TATransitionLabel trl3 = new TATransitionLabel(p3, new TAAnd(b, c), new TAAssignment(e4, c));
        //map
        c1.mapTransitionToLabel(tr1, trl1);
        c1.mapTransitionToLabel(tr2, trl2);
        c1.mapTransitionToLabel(tr3, trl3);

        // interaction
        TAInteraction i1 = new TAInteraction();
        i1.addAction(new TAAssignment(e4, c));
        i1.addComponent(c1, p1);
        i1.addComponent(c2, p1);
        i1.addGuard(new TAAnd(b, c));
        System.out.println("ready check for interaction: " + i1.readyCheck());
        c1.list();

        // system
        system.addComponent(c1);
        system.addComponent(c2);
        System.out.println(system.checkConflicts());
        System.out.println(system.deadlockCheck());
        // test execute
        system.execute(4);

    }
}