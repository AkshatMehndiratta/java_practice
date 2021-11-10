package Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class removeDuplicateElementsFromList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> originalList = new ArrayList<>();
        System.out.println("How many integers do you want in list");
        int totalIntegers = sc.nextInt();
        System.out.println("Enter " + totalIntegers + " integers");
        for(int i = 0; i < totalIntegers; i++){
            originalList.add(sc.nextInt());
        }
        List<Integer> newList = new ArrayList<>();
        newList.add(originalList.get(0));
        for(int i = 1; i < originalList.size(); i++){
            if(newList.contains(originalList.get(i))){
                break;
            }
            else{
                newList.add(originalList.get(i));
            }
        }
        System.out.println("List without duplicates is " + newList);
    }
}
