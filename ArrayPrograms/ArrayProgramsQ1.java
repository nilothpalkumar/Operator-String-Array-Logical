package ArrayPrograms;

import java.util.*;
public class ArrayProgramsQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array Length:");
        int n = sc.nextInt();
        int arr[] = new int[5];
        System.out.println("Enter the numbers in the Array :");
        for(int i=0; i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}