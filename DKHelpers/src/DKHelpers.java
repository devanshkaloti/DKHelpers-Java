// V.1.0.0 Final
// Devansh Kaloti

import java.util.Scanner;

public class DKHelpers {

    // Print a formatted string to console.
    public static void print(Object message, Object... vars) {
        System.out.println(String.format(message.toString(), vars));
    }

    // Take and return string input to user
    public static String input(String message) {
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        return input.next();
    }

    // Return Input to user in int, give no range, min or or min/max (Method Overloaded)
    public static int input(String message, int... range) {
        Boolean isRange = range.length == 2; // Check if range is provided
        while (true) {
            String value = input(message);
            try {
                int val = toInt(value);
                if (range.length == -0) { return val; } // If no range given

                if (isRange) { // If min and max are given
                    if (val < range[0] || val > range[1]) { // If number higher than range
                        print("The number must be between %s and %s", range[0], range[1]);
                        continue;
                    }
                } else {
                    if (val <= range[0]) { // If only Min is given, and condition fails
                        print("The number must be higher than %s", range[0]);
                        continue;
                    }
                }
                return val;
            } catch (NumberFormatException e) { // Error Catching
                print("Invalid number given");
            }
        }
    }



    // Converting Data Types, no error checking needed as this is internal code use. s
    public static int toInt(Object number) { return Integer.parseInt(number.toString()); }
    public static String toString(Object string) { return String.valueOf(string);}
    public static char[] toChars(Object string) { return toString(string).toCharArray(); }

}