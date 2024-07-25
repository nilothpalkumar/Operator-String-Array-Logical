package OperatorPrograms;

import java.util.Scanner;

public class ArithmeticOperatorsQ1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition = "+ (a+b));
        if(a>b)
        {
            System.out.println("Subration = "+ (a-b));
        }
        else
        {
            System.out.println("Subration = "+ (b-a));
        }
    }
}