package OperatorPrograms;

import java.util.Scanner;
public class ArithmeticOperatorsQ3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 numbers :");
        int sum=0;
        double avg=0d;
        for (int i=0; i<5; i++)
        {
            int x = sc.nextInt();
            sum = sum + x;
        }
        avg = (double) sum/5;
        System.out.println("Average = "+ avg );
    }
}