
public class TANot extends TABool implements TABoolOps {

    private Boolean value_not;
    private TABool operand;
    private String name;

    TANot(TABool b){
        operand = b;
    }

    TANot(String s, TABool b) throws Exception {
        NamesChecker.check(s);
        name = s;
        operand = b;
    }

    public void evaluate(){

        value_not = !operand.getValue();
    }

    public Boolean getValue(){

        return value_not;
    }

    public void list(){
        System.out.print("(~ ");
        operand.list();
        System.out.print(" )");
    }

    public void printState(){
        System.out.println(value_not);

    }
}
