package Regex;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex_2 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("output.txt");
        Pattern p = Pattern.compile("(0|91)?[789][0-9]{9}");
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String line = br.readLine();
        while(line !=null){
            Matcher m = p.matcher(line);
            while (m.find() && m.group().equals(line)){
                pw.println(m.group());
            }
            line = br.readLine();
        }
        pw.flush();
        pw.close();
        br.close();
    }
}
