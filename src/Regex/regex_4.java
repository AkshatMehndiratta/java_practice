package Regex;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex_4 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a-zA-Z0-9.$_]+[.](txt)");
        File f = new File("C:\\Windows\\WinSxS\\wow64_microsoft.powershell.pester_31bf3856ad364e35_10.0.19041.1_none_9478227a478f23d5");
        String[] s = f.list();
        for(int i=0; i< s.length;i++){
            Matcher m = p.matcher(s[i]);
            if (m.find() && m.group().equals(s[i])){
                System.out.println(s[i]);
            }
        }
    }
}
