package com.example.project;
class AddEquation extends AbstractEquation {
    public int a=1;
    public AddEquation(short num1,short num2){
        super(num1,num2,'+');
    }
    @Override
    public int calculate(short first, short second) {
        return getnum1()+getnum2();
    }

    public static class AddEquationBuilder{
        private short num1;
        private short num2;
        private char ope;

        public AddEquationBuilder num1(short num1) {
            this.num1 = num1;
            return this;
        }

        public AddEquationBuilder num2(short num2) {
            this.num2 = num2;
            return this;
        }

        public AddEquationBuilder ope(char ope) {
            this.ope = ope;
            return this;
        }

        public AddEquation build() {
            return new AddEquation(num1, num2);
        }
    }

}