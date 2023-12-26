package com.example.project;
import java.util.HashSet;
import java.util.Iterator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EquationCollection implements Iterable<IEqualtion> {
    private HashSet<IEqualtion> equations;
    public EquationCollection() {
        equations = new HashSet<IEqualtion>();
    }
    // 生成n个满足约束的算式
    public int generate(int n, EquationChecker checker) //throws JsonProcessingException
     {
        HashSet<IEqualtion> list=new HashSet<>(n);
        ObjectMapper mapper=new ObjectMapper();
        // 清空原有集合
        equations.clear();
        // 产生算式并加入集合（直到达到n个）
        while (equations.size() < n) {
            IEqualtion equation = EquationFactory.getEquationRandom();
            if (checker.check(equation)) {
                equations.add(equation);
                //String s = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(equation);
               // System.out.println(s);
            }
        }
        int count=0;
        Iterator<IEqualtion> iterator= list.iterator();
        while (iterator.hasNext()){
            count++;
            IEqualtion next=iterator.next();
        }
        return  count;
    }


    // 返回迭代器
    public Iterator<IEqualtion> iterator() {
        return equations.iterator();
    }
}