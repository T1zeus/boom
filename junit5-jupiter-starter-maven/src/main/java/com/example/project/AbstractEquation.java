package com.example.project;
import java.util.*;
abstract class AbstractEquation implements IEqualtion {
    private short num1;
    private short num2;
    private  char ope;

    public AbstractEquation(short num1, short num2, char ope) {
        this.num1 = num1;
        this.num2 = num2;
        this.ope = ope;
    }

    public short getnum1() {return num1;}

    public void setnum1(short num1) {this.num1 = num1;}

    public short getnum2() {return num2;}

    public void setnum2(short num2) {this.num2 = num2;}

    public char getope() {return ope;}

    public void setope(char ope) {this.ope = ope;}

    public String toString() { return  ""+num1+ ope +num2 +"="+calculate(num1,num2);}
    @Override
    public boolean equals(Object o) {//equals方法检测行参是否相等
        if (this==o) return true;
        if (o==null||getClass()!=o.getClass()) return false;
        AbstractEquation abstractEquation = (AbstractEquation) o;
        return num1==abstractEquation.num1&&
                num2==abstractEquation.num2&&
                ope==abstractEquation.ope;
    }
    @Override
    public int hashCode() {
        return Objects.hash(num1,num2,ope);//使用hashCode方法使算式不相等
    }
}

