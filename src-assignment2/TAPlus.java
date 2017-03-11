import java.util.ArrayList;

/*
Type abstraction for addition operation
*/
public class TAPlus implements TANumber, TATerm {

    private Number value_plus;
    private TANumber operand1, operand2;
    private String name = null;

    TAPlus(TAInt a, TAInt b){

        operand1 = a;
        operand2 = b;
    }

    TAPlus(String s, TAInt a, TAInt b) throws Exception {

        NamesChecker.check(s);
        name = s;
        operand1 = a;
        operand2 = b;
    }

    TAPlus(TADouble a, TADouble b){

        operand1 = a;
        operand2 = b;
    }

    TAPlus(String s, TADouble a, TADouble b) throws Exception {

        NamesChecker.check(s);
        name = s;
        operand1 = a;
        operand2 = b;
    }

    TAPlus(TAInt a , TAConstant b){

        operand1 = a;
        operand2 = b;
    }

    TAPlus(String s, TAInt a, TAConstant b) throws Exception {

        NamesChecker.check(s);
        name = s;
        operand1 = a;
        operand2 = b;
    }

    public Number getValue(){

        return value_plus;
    }

    @Override
    public String getName() {
        return null;
    }

    public void evaluate(){

        value_plus = operand1.getValue().doubleValue() + operand2.getValue().doubleValue();

    }

    @Override
    public TAPrimitive getValueTA() {
        return new TAConstant(value_plus);
    }

    public void list(){

        if(name == null) {

            System.out.print("(+ ");
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
