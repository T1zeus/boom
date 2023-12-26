package com.example.project;

class EquationCheckerOfRange implements EquationChecker{
    private final int min;
    private final int max;

    public EquationCheckerOfRange(int min,int max){
        this.min=min;
        this.max=max;
    }

    @Override
    public boolean check(IEqualtion equation) {
        short num1=equation.getnum1();
        short num2=equation.getnum2();
        int result= equation.calculate(num1,num2);
        return num1>=min&&num1<=max&& num2>=min&&num2<=max&&result>=min&&result<=max;
    }
}
