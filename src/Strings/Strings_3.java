package Strings;

import java.util.Scanner;

public class Strings_3 {
    public static void main(String[] args) {
//        Input an email from the user. You have to create a username from the email by deleting the part that comes
//        after ‘@’. Display that username to the user.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your email Id");
        String S = sc.next();
        String userName = "";
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == '@') {
                System.out.println("Your user name is:"+userName);
                return;
            }
            else {
                userName += S.charAt(i);
            }
        }
    }
}
