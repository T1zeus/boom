package com.example.project;

public interface IEqualtion {
    short getnum1();
    void setnum1(short num1);

    short getnum2();
    void setnum2(short num2);

    char getope();
    void setope(char ope);

    public abstract int calculate(short first, short second);
}
