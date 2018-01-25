package com.kodilla.stream.beautifier;

public class StreamMain {
    public static void main(String[] args) {
        String inStr = "To jest przykładowy tekst";
        String outStr;
        System.out.println("Zdanie: " +inStr);
        PoemDecorator reverse = (str) -> {
            String result = "";

            for (int i = str.length()-1; i>= 0; i--)
                result += str.charAt(i);
            return result;
        };
        outStr = PoemBeautifier.changeStr(reverse, inStr);
        System.out.println("Zdanie od tyłu: " + outStr );

        outStr = PoemBeautifier.changeStr((str) -> str.replace(' ', '-'), inStr);
        System.out.println("Dodanie - zamiast spacji: " + outStr);

        outStr = PoemBeautifier.changeStr((str) -> {
            String result = "";
            char a;

            for (int i = 0; i < str.length(); i++) {
                a = str.charAt(i);
                if (Character.isUpperCase(a));
                result += Character.toUpperCase(a);
            }
            return result;
        }, inStr);
        System.out.println("Tekst z dużych liter: " + outStr );

    }
}



