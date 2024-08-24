// WAP TO FIND THE LARGEST ELEMENT FROM THE ARRAY IN JAVA

import java.util.Scanner;
import static java.lang.System.*;

public class Largest {
    public static void main(String[] args) {
        int n,largest=0;

        out.print("Enter the Size of array = ");
        Scanner sin= new Scanner(System.in);
         n = sin.nextInt();


        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            out.print("Enter element of " + i + " = ");
            arr[i] = sin.nextInt();
        }


        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        out.println("The largest element in the Array is = " + largest);
    }
}