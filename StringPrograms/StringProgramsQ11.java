package StringPrograms;

import java.util.Scanner;
public class StringProgramsQ11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word to check pallindrome :");
        String str = sc.next();
        StringBuilder pallindromeCheck = new StringBuilder(str);
        pallindromeCheck.reverse();
        String strRev = pallindromeCheck.toString();
        boolean result = str.equalsIgnoreCase(strRev);
        if (result)
        {
            System.out.println("Yes, It's a Pallindrome.");
        }
        else
        {
            System.out.println("No, It's not a Pallindrome.");
        }
    }
}