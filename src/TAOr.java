public class TAOr extends TABool implements TABoolOps{

        private Boolean value_or;

        TAOr(TABool a, TABool b){
            value_or= a.get() || b.get();
        }

        protected Boolean get() { return value_or;}

        void evaluate(){}


}
