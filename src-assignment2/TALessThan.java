import java.util.ArrayList;

/*
Type Abstraction for less than operation
*/
public class TALessThan extends TABool implements TAFormula {

    private Boolean value_lessthan;
    private TANumber operand1, operand2;
    private String name = null;

    TALessThan(TAInt a, TAInt b){

        operand1 = a;
        operand2 = b;

    }

    TALessThan(String s, TAInt a, TAInt b) throws Exception {

        NamesChecker.check(s);
        name = s;
        operand1 = a;
        operand2 = b;

    }

    TALessThan(TADouble a , TADouble b){
        operand1 = a;
        operand2 = b;
    }

    TALessThan(String s,TADouble a , TADouble b) throws Exception {

        NamesChecker.check(s);
        name = s;
        operand1 = a;
        operand2 = b;
    }

    public Boolean getValue() {
        return value_lessthan;
    }

    public void evaluate(){

        if(operand1.getValue().doubleValue() < operand2.getValue().doubleValue())
            value_lessthan = true;
        else
            value_lessthan = false;
    }

    @Override
    public TAPrimitive getValueTA() {
        return new TABool(value_lessthan);
    }

    public void list(){

        if(name == null) {
            System.out.print("(< ");
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
//        opList.addAll(operand1.getOperands());
//        opList.addAll(operand2.getOperands());
        opList.add(operand1);
        opList.add(operand2);
        return opList;
    }



    public void printState(){
        System.out.println(value_lessthan);
    }

}