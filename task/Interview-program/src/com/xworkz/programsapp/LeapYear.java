// Java program to find a leap year
 
class LeapYear {
 
    // Method to check leap year
    public static void isLeapYear(int year)
    {
        // flag to take a non-leap year by default
        boolean isLeapYear = false;
 
        // If year is divisible by 4
        if (year % 4 == 0) {
          isLeapYear = true;
            // To identify whether it 
            // is a century year or not
            if (year % 100 == 0) {
                // Checking if year is divisible by 400
                // therefore century leap year
                if (year % 400 == 0)
                    isLeapYear = true;
                else
                    isLeapYear = false;
            }
        }
        // We land here when corresponding if fails
        // If year is not divisible by 4
        else
            // Flag dealing-  Non leap-year
            isLeapYear = false;
        if (!isLeapYear)
            System.out.println(year + " : Non Leap-year");
        else
            System.out.println(year + " : Leap-year");
    }
 
    // Main method
    public static void main(String[] args)
    {
        // Calling our function by passing century year not divisible by 400
        isLeapYear(2000);
 
        // Calling our function by passing Non-century year
        isLeapYear(2002);
    }
}