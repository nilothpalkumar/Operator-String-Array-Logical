package ArrayPrograms;

import java.util.Scanner;

public class ArrayProgramsQ9
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row=s.nextInt();
        System.out.print("Enter number of Colums: ");
        int col=s.nextInt();
        int matrix1[][]=new int[row][col];
        int matrix2[][]=new int[row][col];
        System.out.println("Enter matrix 1 elements: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix1[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter matrix 2 elements: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix2[i][j]=s.nextInt();
            }
        }
        MatrixSum(row,col,matrix1,matrix2);


    }

    public static void MatrixSum(int m, int n,int mat1[][],int mat2[][]){
        System.out.println("Addition of Matrices:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print((mat1[i][j]+mat2[i][j])+" ");
            }
            System.out.println();
        }
    }
}
