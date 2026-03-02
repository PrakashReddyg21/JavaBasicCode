package JavaLearning;

import java.util.Scanner;

public class SumOfSquaresOfFirst
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;

        for(int i=1;i <=n;i++)
        {
            sum = sum+(i*i);
        }
        System.out.println(sum);

//        second method
        int reSum=n*(n+1)*(2*n+1)/6;

        System.out.println(reSum);
        sc.close();
    }
}
