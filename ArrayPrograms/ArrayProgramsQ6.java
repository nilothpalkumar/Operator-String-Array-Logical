package ArrayPrograms;

import java.util.Scanner;
public class ArrayProgramsQ6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array Length:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] posArr = new int[n];
        int[] negArr = new int[n];
        System.out.println("Enter the numbers in the Array :");
        for(int i=0; i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        int posCount=0,negCount=0;
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                posArr[posCount] = arr[i];
                posCount++;
            }
            else
            {
                negArr[negCount] = arr[i];
                negCount++;
            }
        }

        for(int i=0; i<posArr.length;i++)
        {
            System.out.print(posArr[i]+ " ");
        }
        System.out.println();
        for(int i=0; i<negArr.length;i++)
        {
            System.out.print(negArr[i]+ " ");
        }
    }
}
