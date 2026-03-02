package JavaLearning;

import java.util.Scanner;

public class EvenOrOdd
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(n % 2 ==0)
        {
            System.out.println( n+" Is Even");
        }
        else
        {
            System.out.println(n +" Is Odd");
        }
        sc.close();
    }
}
