package com.radiance.gupao.p5.genericity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunhao
 * @date 2020/10/13 22:59
 * @Description:
 */
public class Demo03 {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("gupao");
        list1.add("bobo");
        list1.add("mic");
//        loop(list1);

        List<Number> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        loop(list2);
    }

    /**
     *  ?  extends Number
     *  通用的类型必须是Number及其子类
     * @param list
     */
    public static void loop(List<? extends Number> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
