import java.util.Arrays;
import java.util.Iterator;

public class arrays {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};//Declaring and initializing array in one line
        int[] arr2 = new int[3];//declaring array of size 3
        arr2[0] = 4;//initializing it's first value at index 0
        arr2[1] = 5;//initializing its second value at index 1
        //value at index 2 is not initialized so its value is 0 by default
        for(int i=0; i<arr1.length; i++){//iterating array values using for loop
            System.out.println(arr1[i]+" for loop");
        }
        for(int j: arr2){//iterating array values using for each loop
            System.out.println(j+" for each loop");
        }
    }
}
