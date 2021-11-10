package Strings;

import java.util.Scanner;

public class Strings_1 {
    public static void main(String[] args) {
//       1. Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
        Scanner sc = new Scanner(System.in);
        String[] S = new String[3];
        for (int i = 0; i < S.length; i++) {
            System.out.println("Type a string");
            S[i] = sc.nextLine();
        }
        int k = 0;
        for (int i = 0; i < S.length; i++) {
            k += S[i].length();
        }
        System.out.println("Combined Length of all strings is " + k);
    }
}
