package com.example.project;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要产生的算式数");
        int n=scanner.nextInt();
        EquationCollection equations=new EquationCollection();
        EquationChecker checker=new EquationCheckerOfRange(0,100);
        equations.generate(n,checker);// 使用EquationCheckerOfRange产生n个加减法算式
        Iterator<IEqualtion> iterator= equations.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Class<?> jet=Class.forName("AddEquation");
        Method[] methods= jet.getMethods();
        System.out.println(Arrays.toString(methods));//通过反射得到所有方法
        Field[] fields= jet.getFields();//通过反射得到所有字段
        System.out.println(Arrays.toString(fields));
        Constructor<?> [] ob= jet.getConstructors();
        System.out.println(Arrays.toString(ob));
    }
}

