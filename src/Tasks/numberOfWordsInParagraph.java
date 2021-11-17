package Tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class numberOfWordsInParagraph {
    public static void main(String[] args) throws IOException {
        List<String> l = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("paragraph.txt"));
        String line = "";
        while ((line = br.readLine())!=null){
            String string[] = line.toLowerCase().split("([.,\\s]+)");
            for(String e:string){
                l.add(e);
            }
        }
//        System.out.println(l);
        int count = 0;
        List<String> l1 = new ArrayList<>();
        l1.add(l.get(0));
        for(int i = 1; i<l.size(); i++){
            if(l1.contains(l.get(i))){
                count++;
            }
            else {
                l1.add(l.get(i));
            }
        }
//        System.out.println(l1);
        System.out.println("Number of repeated words in given paragraph is : " + count);
    }
}
