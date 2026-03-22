package x30;

import java.util.Scanner;

public class LCM_Calc 
{
    @SuppressWarnings("resource")
	public static void main(String[] args) 
    {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        
        // Read two integers from user
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // Convert inputs to absolute values for HCF calculation
        // Ensures correctness even if inputs are negative
        int x = Math.abs(a);
        int y = Math.abs(b);
        
        // Euclidean Algorithm to compute HCF (GCD)
        // Repeatedly replace (x, y) with (y, x % y)
        while(y != 0)
        {
            int temp = y;
            y = x % y;   // remainder step reduces problem size
            x = temp;
        }
        
        // After loop, x contains HCF
        int hcf = x;
        
        // Handle special case:
        // If either number is 0 → LCM is 0
        if(a == 0 || b == 0)
        {
            System.out.println("LCM : 0");
            return; // stops further execution (avoids division issues)
        }
        
        // Calculate LCM using formula:
        // LCM = |a * b| / HCF
        // Using (a / hcf) * b to reduce overflow risk
        int lcm = Math.abs((a / hcf) * b);
        
        // Output result
        System.out.println("LCM : " + lcm);
        
        // Close scanner (good practice to release resources)
        sc.close();
    }
}