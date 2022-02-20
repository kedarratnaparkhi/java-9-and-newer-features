package org.kedar.java11;

import java.util.List;
import java.util.stream.Collectors;

public class NewStringMethods {
    public static void main(String[] args) {
        String name = "kedar\nratnaparkhi";

        List<String> lines = name.lines().collect(Collectors.toList());
        System.out.println(lines);

        String blankString = "";
        System.out.println(blankString.isBlank());
    }
}
