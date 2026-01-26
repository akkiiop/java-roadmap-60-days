package day7;

import java.util.Scanner;

public class DiagonalElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Size of square matrix: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Main Diagonal:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i][i]+" ");
        }
    }
}

