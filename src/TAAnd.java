import javax.lang.model.element.Name;

public class TAAnd extends TABool implements TABoolOps {

    private boolean value_and;
    private TABool operand1, operand2;
    private String name;


    TAAnd(TABool a, TABool b) {

        operand1 = a;
        operand2 = b;
    }

    TAAnd(String s,TABool a, TABool b) throws Exception {

        operand1 = a;
        operand2 = b;
        NamesChecker.check(s);
        name = s;

    }

    Boolean getValue() {

        return value_and;
    }

    public void evaluate(){

        value_and = operand1.getValue() && operand2.getValue();
    }

    public void printState(){

        System.out.println(value_and);
    }

    public void list(){

        System.out.print("(& ");
        operand1.list();
        System.out.print(" ");
        operand2.list();
        System.out.print(" )");

    }



}
