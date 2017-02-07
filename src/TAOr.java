public class TAOr extends TABool implements TABoolOps{

        private Boolean value_or;
        private TABool operand1, operand2;

        TAOr(TABool a, TABool b){

            operand1 = a;
            operand2 = b;
        }

        protected Boolean get() { return value_or;}

        void evaluate(){}

        public void list(){
            System.out.print("(or ");
            operand1.list();
            System.out.print(" ");
            operand2.list();
            System.out.print(" )");

        }


}
