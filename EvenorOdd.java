package x30;

public class EvenorOdd 
{
    // Method 1: Repeated subtraction
    // Logic: Keep subtracting 2 until the number becomes 0 (even) or 1 (odd)
    // Inefficient for large numbers and not suitable for real use
    static void repeatedSub()
    {
        int x = 6; // Input number
        
        // Reduce x by 2 repeatedly
        while(x > 1)
        {
            x = x - 2;
        }
        
        // If we end at 0 → even, if 1 → odd
        if(x == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
    
    // Method 2: Bitwise AND operator
    // Logic: Even numbers have last binary bit = 0, odd numbers = 1
    // Efficient and commonly used in low-level optimization
    static void andOp()
    {
        int x = 3; // Input number
        
        // x & 1 extracts the last bit
        if((x & 1) == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
    
    // Method 3: Division and multiplication
    // Logic: If a number is even, dividing by 2 and multiplying back gives same number
    // Less clear and unnecessary compared to modulus
    static void divAndMul() 
    {
        int x = 4; // Input number
        
        // Integer division removes remainder
        if((x / 2) * 2 == x)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
    
    // Method 4: Modulus operator
    // Logic: Even numbers give remainder 0 when divided by 2
    // This is the standard and most readable approach
    static void mod()
    {
        int x = 9; // Input number
        
        // % gives remainder
        if(x % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    // Main method: Calls all methods
    public static void main(String[] args) 
    {
        repeatedSub();
        andOp();
        divAndMul();
        mod();
    }
}