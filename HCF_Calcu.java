package x30;

import java.util.Scanner;

public class HCF_Calcu 
{
    public static void main(String[] args) 
    {
        // Input handling
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers : ");
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // Copy inputs (good: preserves original values)
        int x = Math.abs(a);
        int y = Math.abs(b);
        
        // Euclidean Algorithm:
        // Repeatedly replace (x, y) with (y, x % y)
        // until remainder becomes 0
        while (y != 0)
        {
            int temp = y;
            y = x % y;   // remainder step (core logic)
            x = temp;
        }
        
        // x now holds the HCF (GCD)
        System.out.println("HCF :" + x);
        
        sc.close();
    }
}