package ArrayPrograms;

import java.util.Scanner;
public class ArrayProgramsQ5 {
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

        int even=0,odd=0;
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i]%2 == 0)
            {
                even++;
            }
            else {
                odd++;
            }
        }

        System.out.println("No of Even Numbers = "+even);
        System.out.println("No of Even Numbers = "+odd);
    }
}
