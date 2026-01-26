package day7;

import java.util.Scanner;

public class MatrixSubtraction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Rows: ");
        int r = sc.nextInt();

        System.out.print("Columns: ");
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        int[][] b = new int[r][c];
        int[][] diff = new int[r][c];

        System.out.println("Enter first matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter second matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                b[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                diff[i][j] = a[i][j] - b[i][j];
            }
        }

        System.out.println("Result:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(diff[i][j]+" ");
            }
            System.out.println();
        }
    }
}

