package Strings;

import java.util.Scanner;

public class Strings_2 {
    public static void main(String[] args) {

//       2. Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’
//          in the original string with letter ‘i’
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a string");
        String S = sc.nextLine();
        System.out.println(S.replace('e','i'));
    }
}
