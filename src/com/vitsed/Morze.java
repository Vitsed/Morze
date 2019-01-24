package com.vitsed;

import java.util.HashMap;
import java.util.Map;

public class Morze {

    private static Map<String, String> map = new HashMap<>();

    static {
        map.put("A", ". -");
        map.put("B", "- . . .");
        map.put("C", "- . - .");
        map.put("D", "- . .");
        map.put("E", ".");
        map.put("F", ". . - .");
        map.put("G", "- - .");
        map.put("H", ". . . .");
        map.put("I", ". .");
        map.put("J", ". - - -");
        map.put("K", "- . -");
        map.put("L", ". - . .");
        map.put("M", "- -");
        map.put("N", "- .");
        map.put("O", "- - -");
        map.put("P", ". - - .");
        map.put("Q", "- - . -");
        map.put("R", ". - .");
        map.put("S", ". . .");
        map.put("T", "-");
        map.put("U", ". . -");
        map.put("V", ". . . -");
        map.put("W", ". - -");
        map.put("X", "- . . -");
        map.put("Y", "- . - -");
        map.put("Z", "- - . .");

        map.put("1", ". - - - -");
        map.put("2", ". . - - -");
        map.put("3", ". . . - -");
        map.put("4", ". . . . -");
        map.put("5", ". . . . .");
        map.put("6", "- . . . .");
        map.put("7", "- - . . .");
        map.put("8", "- - - . .");
        map.put("9", "- - - - .");
        map.put("0", "- - - - -");
    }

    private String symbolToMorze_(String symbol) {
        return map.get(symbol.toUpperCase());
    }

    private String morzeToSymbol_(String code) {
        for (var pair : map.entrySet()) {
            if (code.equals(pair.getValue())) {
                return pair.getKey();
            }
        }
        return "There is no symbols";
    }

    public void symbolToMorze(String symbol) {
        System.out.println(symbolToMorze_(symbol));
    }

    public void morzeToSymbol(String code) {
        System.out.println(morzeToSymbol_(code));
    }


    public void morzeToWord(String morze) {
        StringBuilder sb = new StringBuilder();
        String[] str = morze.split("_");
        for (String test : str) {
            String string = morzeToSymbol_(test);
            sb.append(string);
            sb.append(" ");
        }
        System.out.println(sb);
    }

    public String wordToMorzeCode(String word) {
        StringBuilder sb = new StringBuilder();
        char[] wordArray = word.toCharArray();
        for (char symbol : wordArray) {
            if (!" ".equals(symbol + "")) {
                sb.append(symbol + " -> "+symbolToMorze_(symbol + ""));
                sb.append("\n");
            } else {
                sb.append("\n");
            }

        }
        return sb.toString();
    }
}
