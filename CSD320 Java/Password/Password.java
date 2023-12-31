/*
 Ian Spresney
 CSD320 - Java
 11-26-2023
 Module 7 Assignment

Sources:
- https://www3.ntu.edu.sg/home/ehchua/programming/howto/Regexe.html
- Other information used from previous assignments like 'Scanner'.
- https://stackoverflow.com/questions/13674449/checking-password-code
 */

//NOTE!!!
//the program will prompt user to type password again if typed incorrectly...
//when password is valid, then program will end...


//SOURCE - https://www3.ntu.edu.sg/home/ehchua/programming/howto/Regexe.html
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;


public class Password {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        boolean validPassword = false;

        while (!validPassword) {
            // Ask the user for password input
            System.out.print("Enter your password: ");
            String passwordInput = scanner.nextLine();

            // Validate the password
            if (isValidPassword(passwordInput)) {
                System.out.println("Valid password!");
                validPassword = true;
            } else {
                System.out.println("Invalid password. Please make sure it meets the specified criteria.");
            }
        }

        //this is the code for the program to end when password is right or wrong.
        //NO LOOP, but I think the loop is a nice touch.
        /*
            // Ask the user for password input
            System.out.print("Enter your password: ");
            String passwordInput = scanner.nextLine();

            // Validate the password
            if (isValidPassword(passwordInput)) {
                System.out.println("Valid password!");
            } else {
                System.out.println("Invalid password. Please make sure it meets the specified criteria.");
            }
        */

        // Close the scanner
        scanner.close();
    }    

    public static boolean isValidPassword(String password) {

        // Check if the password has at least eight characters
        if (password.length() < 8) {
            return false;
        }

        // Check if the password contains both letters and digits
        if (!password.matches(".*[a-zA-Z].*") || !password.matches(".*\\d.*")) {
            return false;
        }

        // Check if the password contains at least one uppercase character
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        // Check if the password contains at least one lowercase character
        if (!password.matches(".*[a-z].*")) {
            return false;
        }

        // If all conditions are met, the password is valid
        return true;
    }

}
