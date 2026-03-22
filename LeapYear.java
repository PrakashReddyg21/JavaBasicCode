package x30;

public class LeapYear 
{
    public static void main(String[] args) 
    {
        // Loop through years from 1950 to 2026
        for(int year = 1950; year <= 2026; year++)
        {
            // Leap year condition:
            // (Divisible by 4 AND not by 100) OR divisible by 400
            // NOTE: You used single '&' instead of '&&' (important issue)
            if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            {
                System.out.println(year + " Is leap year");
            }
            else
            {
                System.out.println(year + " is Not a leap year");
            }
        }
    }
}