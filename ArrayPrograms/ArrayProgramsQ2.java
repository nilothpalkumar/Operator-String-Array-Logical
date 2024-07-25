package ArrayPrograms;

import java.util.Scanner;
public class ArrayProgramsQ2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array Length:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the numbers in the Array :");
        for(int i=0; i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        int sum=0;
        double avg = 0d;
        for(int i=0; i<arr.length;i++)
        {
            sum = sum+arr[i];
        }
        avg = (double) sum/arr.length;
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+avg);
    }
}