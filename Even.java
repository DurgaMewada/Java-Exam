// WAP TO FIND THE SUM OF EVEN NUMBERS FROM 1 TO N

import java.util.Scanner;
import static java.lang.System.*;

public  class Even {
    public  static  void main(String args[])
    {
        Integer n,i;
        Integer sum=0;
        out.print("Enter ending number for loop (n) = ");
        Scanner sin= new Scanner(System.in);
        n=sin.nextInt();

        for(i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                sum=sum+i;
            }
            else {}
        }
        out.print("Total Sum of all even number is " + sum);
    }
}
