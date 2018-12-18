package org.shzhong.iterable;

import com.google.common.collect.Iterables;

import java.util.*;

public class Demo {
    public static Map<String, List<Integer>> getElementPositions(List<String> list) {
        Map<String, List<Integer>> positionsMap = new HashMap<>();

        IterablesUtils.forEach(list, (index, str) -> {
//            jdk8
            positionsMap.computeIfAbsent(str, k -> new ArrayList<>(1)).add(index);
        });

        return positionsMap;
    }

    public static void main(String[] args) throws Exception {

        List<String> list = Arrays.asList("a", "b", "b", "c", "c", "c", "d", "d", "d", "f", "f", "g");

        //获取index
        //有点像js的callback
        System.out.println("使用iterable");
        IterablesUtils.forEach(list, (index, str) -> System.out.println(index + " -> " + str));

        System.out.println("使用 computeIfAbsent 和 Iterable.forEach：");
        Map<String, List<Integer>> elementPositions = getElementPositions(list);
        System.out.println(elementPositions);
    }
}
