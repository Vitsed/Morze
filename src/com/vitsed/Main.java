package com.vitsed;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Morze test = new Morze();
        System.out.println("Enter symbol to see Morse represent");
        System.out.println("Type quit to exit");

        Scanner scanner = new Scanner(System.in);
//        String symbol = scanner.nextLine();
//        while (!symbol.equals("quit")) {
//            test.symbolToMorze(symbol);
//            symbol = scanner.next();
//        }

//        while (!symbol.equals("quit")) {
//            test.morzeToWord(symbol);
//            symbol = scanner.nextLine();
//        }

        String code = scanner.nextLine();
        while(!code.equals("quit") ) {
            System.out.println(test.wordToMorzeCode(code));
            code = scanner.nextLine();
        }

    }

}
