package day7;

import java.util.Scanner;

public class ColumnWiseSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Rows: ");
        int r = sc.nextInt();

        System.out.print("Columns: ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter elements:");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int j = 0; j < c; j++){
            int sum = 0;
            for(int i = 0; i < r; i++){
                sum += arr[i][j];
            }
            System.out.println("Column " + (j+1) + " Sum = " + sum);
        }
    }
}

