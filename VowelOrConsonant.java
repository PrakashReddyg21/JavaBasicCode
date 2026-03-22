package x30;

import java.util.Scanner;

public class VowelOrConsonant 
{
    public static void main(String[] args) 
    {
        // Create Scanner to read input from user
        Scanner sc = new Scanner(System.in);
        
        // Ask user for a character
        System.out.println("Enter Character");
        
        // Read first character of input (ignores rest if user enters more than one)
        char ch = sc.next().charAt(0);
        
        // Step 1: Validate input → check if character is a letter
        // Prevents digits/symbols from being misclassified
        if(Character.isLetter(ch))
        {
            // Step 2: Check if character is a vowel
            // Explicit comparison against all vowels (both cases)
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch =='U')
            {
                System.out.println("Vowel");
            }
            else
            {
                // If it's a letter but not a vowel → must be a consonant
                System.out.println("Consonant");
            }
        }
        else 
        {
            // Handles invalid input like digits or special characters
            System.out.println("Not an alphabet");
        }
        
        // Close scanner to release system resources
        sc.close();
    }
}