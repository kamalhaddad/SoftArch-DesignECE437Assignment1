public class TALessThan extends TABool implements TABoolOps{

    private Boolean state;
    private TANumber operand1, operand2;

    TALessThan(TAInt a, TAInt b){
        operand1 = a;
        operand2 = b;
    }

    TALessThan(TADouble a , TADouble b){
        operand1 = a;
        operand2 = b;
    }

    protected Boolean getValue() {return state;}

    void evaluate(){};

    public void list(){

        System.out.print("(< ");
        operand1.list();
        System.out.print(" ");
        operand2.list();
        System.out.print(" )");
    }
}