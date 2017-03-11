import java.util.ArrayList;

/*
Type Abstraction for And operation
 */
public class TAAnd extends TABool implements TAFormula {

    private boolean value_and;
    private TABool operand1, operand2;
    private String name = null;


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

    public Boolean getValue() {

        return value_and;
    }

    public void evaluate(){

        value_and = operand1.getValue() && operand2.getValue();
    }

    public void printState(){

        System.out.println(value_and);
    }

    public void list(){

        if(name !=  null) {
            System.out.print("(& ");
            operand1.list();
            System.out.print(" ");
            operand2.list();
            System.out.print(" )");
        }

        else
            System.out.print(name);

    }

    public ArrayList getOperands(){
        ArrayList opList = new ArrayList();
        opList.addAll(operand1.getOperands());
        opList.addAll(operand2.getOperands());
        return opList;
    }



}
