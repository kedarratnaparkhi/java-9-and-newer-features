package org.kedar.java9;

import java.util.*;

public class CollectionsMethod {
    public static void main(String[] args) {
        List<String> newList = List.of("ABCD","XYZ");
        System.out.println(newList);



        Map<Integer, String> newMap = Map.of(1,"ABCD", 2, "XYZ");
        System.out.println(newMap);

        Set<String> newSet = Set.of("ABCD", "XYZ");
        System.out.println(newSet);

    }
}
