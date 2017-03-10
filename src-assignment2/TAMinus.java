/*
Type Abstraction for minus operation as was as the negation operator
*/
public class TAMinus implements TANumber, TATerm {

    private Number value_minus;
    private TANumber operand1, operand2;
    private boolean flag;
    private String name = null;

    TAMinus(TAInt a, TAInt b){

            flag = true;
            operand1 = a;
            operand2 = b;
    }

    TAMinus(String s, TAInt a, TAInt b) throws Exception {

        NamesChecker.check(s);
        name = s;
        flag = true;
        operand1 = a;
        operand2 = b;
    }

    TAMinus(TADouble a, TADouble b){

        flag = false;
        operand1 = a;
        operand2 = b;

    }

    TAMinus(String s, TADouble a, TADouble b) throws Exception {

        NamesChecker.check(s);
        name = s;
        flag = false;
        operand1 = a;
        operand2 = b;

    }

    TAMinus(TAInt i){

        flag = false;
        operand1 = i;

    }

    TAMinus(String s, TAInt i) throws Exception {

        NamesChecker.check(s);
        name = s;
        flag = false;
        operand1 = i;

    }


    TAMinus(String s, TADouble d) throws Exception {

        NamesChecker.check(s);
        name = s;
        flag = false;
        operand2 = d;

    }

    TAMinus(TADouble d){

        flag = false;
        operand2 = d;

    }

    public Number getValue(){

         return value_minus;
    }

    @Override
    public String getName() {
        return null;
    }

    public void evaluate(){

        if(flag)
            value_minus = operand1.getValue().doubleValue() - operand2.getValue().doubleValue();

        else
            value_minus = operand1.getValue().doubleValue() * -1.0;
    }

    public void list(){

        if(name == null) {
            System.out.print("(- ");
            operand1.list();

            if (flag) {
                System.out.print(" ");
                operand2.list();
            }

            System.out.print(" )");
        }

        else
            System.out.print(name);
    }


}
