public class TALessThan extends TABool implements TABoolOps{

    private Boolean value_lessthan;
    private TANumber operand1, operand2;
    private String name;

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

    public void list(){

        System.out.print("(< ");
        operand1.list();
        System.out.print(" ");
        operand2.list();
        System.out.print(" )");

    }

    public void printState(){
        System.out.println(value_lessthan);

    }
}