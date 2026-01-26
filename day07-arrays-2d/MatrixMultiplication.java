package day7;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Rows of A: ");
        int r1 = sc.nextInt();

        System.out.print("Cols of A: ");
        int c1 = sc.nextInt();

        System.out.print("Cols of B: ");
        int c2 = sc.nextInt();

        int[][] a = new int[r1][c1];
        int[][] b = new int[c1][c2];
        int[][] result = new int[r1][c2];

        System.out.println("Enter Matrix A:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter Matrix B:");
        for(int i=0;i<c1;i++){
            for(int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    result[i][j]+=a[i][k]*b[k][j];
                }
            }
        }

        System.out.println("Result:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}

