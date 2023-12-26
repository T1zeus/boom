package com.example.project;

class SubEquation extends AbstractEquation {
    public SubEquation(short num1,short num2){
        super(num1,num2,'-');
    }

    @Override
    public int calculate(short first, short second) {
        return getnum1()-getnum2();
    }

    public static class SubEquationBuilder {
        private short num1;
        private short num2;
        private char ope;
        public SubEquationBuilder num1(short num1) {
            this.num1 = num1;
            return this;
        }

        public SubEquationBuilder num2(short num2) {
            this.num2 = num2;
            return this;
        }

        public SubEquation.SubEquationBuilder ope(char ope) {
            this.ope = ope;
            return this;
        }
        public SubEquation build() {
            return new SubEquation(num1, num2);
        }
    }
}