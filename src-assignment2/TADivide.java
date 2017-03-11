import java.util.ArrayList;

/*
Type Abstraction for division operator
*/
public class TADivide implements TANumber, TATerm {

    private Number value_divide;
    private TANumber operand1, operand2;
    private String name = null;

    TADivide(TAInt a, TAInt b){

            operand1 = a;
            operand2 = b;

    }

    TADivide(String s, TAInt a, TAInt b) throws Exception {

        NamesChecker.check(s);
        name =s;
        operand1 = a;
        operand2 = b;

    }

    TADivide(String s, TADouble a, TADouble b) throws Exception {

        NamesChecker.check(s);
        name =s;
        operand1 = a;
        operand2 = b;

    }

    TADivide(TADouble a, TADouble b){
            operand1 = a;
            operand2 = b;

    }

    public Number getValue(){

        return value_divide;
    }

    @Override
    public String getName() {
        return name;
    }

    public void evaluate(){

        value_divide = operand1.getValue().doubleValue()/ operand2.getValue().doubleValue();
    }

    public void list(){

        if(name == null) {
            System.out.print("(/ ");
            operand1.list();
            System.out.println(" ");
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
