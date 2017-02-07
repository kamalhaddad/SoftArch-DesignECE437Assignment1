public class TAOr extends TABool implements TABoolOps{

        private Boolean value_or;
        private TABool operand1, operand2;

        TAOr(TABool a, TABool b){

            operand1 = a;
            operand2 = b;
        }

        public Boolean getValue() {

            return value_or;
        }

        public void evaluate(){

            value_or = operand1.getValue() || operand2.getValue();
        }

        public void list(){
            System.out.print("(or ");
            operand1.list();
            System.out.print(" ");
            operand2.list();
            System.out.print(" )");

        }


}
