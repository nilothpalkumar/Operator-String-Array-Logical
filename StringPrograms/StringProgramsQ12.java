package StringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class StringProgramsQ12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String : ");
        String str1 = sc.nextLine();
        System.out.print("Enter 1st String : ");
        String str2 = sc.nextLine();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String sortSt1 = new String(arr1);
        String sortst2 = new String(arr2);
        if(sortSt1.equals(sortst2))
        {
            System.out.println("Yes, It's an Anagram");
        }
        else
        {
            System.out.println("No, It's not an Anagram");
        }

    }
}