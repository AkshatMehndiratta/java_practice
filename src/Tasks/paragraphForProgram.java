package Tasks;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class paragraphForProgram  {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("paragraph.txt");
        pw.println("The collections framework defines several algorithms that can be applied to collections and maps." +
                " These algorithms are defined as static methods within the Collections class.\n" +
                "\n" +
                "Several of the methods can throw a ClassCastException, which occurs when an attempt is made to compare" +
                " incompatible types, or an UnsupportedOperationException, which occurs when an attempt is made to" +
                " modify an unmodifiable collection.");
        pw.flush();
        pw.close();
    }
}
