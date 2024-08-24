// WAP TO FIND THE SUM OF PRIME NUMBERS FROM 1 TO N.

import java.util.Scanner;

import static java.lang.System.*;

public class Prime {
    public static void main(String args[]) {
        Integer n, i;
        Integer sum = 0;
        Integer count = 0;
        out.print("Enter ending number for loop (n) = ");
        Scanner sin = new Scanner(System.in);
        n = sin.nextInt();

        for (i = 2; i <= n / 2; i++) {
            if (i % 1 == 0) {

                sum = sum + i;
            }

        }
        out.print("Total Sum of all prime number is " + sum);
    }
}
