// WAP TO SORT ARRAY IN ASCENDING(LOW TO HIGH) ORDER IN JAVA.

import java.util.Scanner;
import static java.lang.System.*;

public class Ascending {
    public static void main(String[] args) {
        int n, temp;

        out.print("Enter the Size of array = ");
        Scanner sin = new Scanner(System.in);
        n = sin.nextInt();


        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            out.print("Enter element of " + i + " = ");
            arr[i] = sin.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        out.println("Array in ascending order : ");
        for (int i = 0; i < n; i++) {
            out.print(arr[i] + " ");
        }

    }
}