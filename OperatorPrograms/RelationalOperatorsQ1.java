package OperatorPrograms;

import java.util.Scanner;

public class RelationalOperatorsQ1
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input 1st String : ");
        String s1 = sc.nextLine();
        System.out.print("Input 2nd String : ");
        String s2 = sc.nextLine();
        if(s1.equals(s2))
        {
            System.out.print("Strings are Equal");
        }
        else
        {
            System.out.print("Strings are not Equal");
        }
    }
}
