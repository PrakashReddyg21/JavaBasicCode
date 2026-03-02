package JavaLearning;

import java.util.Scanner;

public class Swap2Numbers
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Before Swap\n"+"a : "+a+"\nb : "+b);

        int temp=a;
        a=b;
        b=temp;

        System.out.println("After Swap\n"+"a : "+a+"\nb : "+b);

        sc.close();
    }
}
