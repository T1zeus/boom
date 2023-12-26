package com.example.project;

import java.util.Random;
public class EquationFactory {

    // 根据类型返回相应的算式对象
    public IEqualtion getEquation(String type) {

        if (type.equals("Add")) {
            AddEquation.AddEquationBuilder add=new AddEquation.AddEquationBuilder().num1((short)0).num2((short)0);
            return add.build();
        } else if (type.equals("Sub")) {
            SubEquation.SubEquationBuilder sub=new SubEquation.SubEquationBuilder().num1((short)0).num2((short)0);
            return sub.build();
        }
        return null;
    }

    // 随机返回算式对象
    public static IEqualtion getEquationRandom() {
        Random random=new Random();
        int randomNumber = (int) Math.round(Math.random());
        return randomNumber == 0 ? new AddEquation((short)random.nextInt(101), (short)random.nextInt(101)) :
                new SubEquation((short)random.nextInt(101), (short)random.nextInt(101));

    }


}