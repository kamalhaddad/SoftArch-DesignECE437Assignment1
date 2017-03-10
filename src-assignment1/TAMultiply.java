/*
Type Abstraction for multiplication operation
*/
public class TAMultiply implements TANumber, TAArithOps {

    private Number value_multiply;
    private TANumber operand1, operand2;
    private String name = null;

    TAMultiply(TAInt a, TAInt b){

        operand1 = a;
        operand2 = b;

    }

    TAMultiply(TADouble a, TADouble b){

        operand1 = a;
        operand2 = b;

    }

    TAMultiply(String s, TAInt a, TAInt b) throws Exception{

        NamesChecker.check(s);
        name = s;
        operand1 = a;
        operand2 = b;

    }

    TAMultiply(String s, TADouble a, TADouble b) throws Exception{

        NamesChecker.check(s);
        name = s;
        operand1 = a;
        operand2 = b;

    }


    public Number getValue(){

        return value_multiply;
    }

    public void evaluate(){

        value_multiply = operand1.getValue().doubleValue() * operand2.getValue().doubleValue();
    }

    public void list(){

        if(name == null) {
            System.out.print("(x ");
            operand1.list();
            System.out.print(" ");
            operand2.list();
            System.out.print(" )");
        }

        else
            System.out.print(name);
    }
}
