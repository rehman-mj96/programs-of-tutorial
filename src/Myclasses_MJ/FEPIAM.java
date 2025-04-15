package Myclasses_MJ;

import java.util.Scanner;

public class FEPIAM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number of rows in a Matrix:\n i=");
        int i = sc.nextInt();
        System.out.println("Enter the number of column in an Matrix:\n j=");
        int j = sc.nextInt();
        int[][] arr = new int[i][j];
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                System.out.printf("arr[%d][%d]=", k, l);
                arr[k][l] = sc.nextInt();
            }
        }

        System.out.println("Enter element to find the place of that element in the matrix:");
        int ele = sc.nextInt();
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                if (arr[k][l] == ele) {
                    System.out.printf("%d,%d", k, l);
                    System.out.println("");
                }


            }
        }
    }
}