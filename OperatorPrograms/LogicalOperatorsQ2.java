package OperatorPrograms;

import java.util.Scanner;

public class LogicalOperatorsQ2
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        if(n%5==0 && n%7==0)
        {
            System.out.println("Yes, Divisible by 5 and 7");
        }
        else
        {
            System.out.println("No, not divisible by 5 and 7");
        }
    }
}
