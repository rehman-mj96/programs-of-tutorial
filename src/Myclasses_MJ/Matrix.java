package Myclasses_MJ;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("enter array");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("arr[%d][%d]=", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter eigen values:");
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int sum1 = a1 + a2 + a3;
        int sum2 = arr[0][0] + arr[1][1] + arr[2][2];
        int determinant = arr[0][0] * (arr[1][1] * arr[2][2] - arr[1][2] * arr[2][1]) - arr[0][1] * (arr[1][0] * arr[2][2] - arr[2][0] * arr[1][2]) + arr[0][2] * (arr[1][0] * arr[2][1] - arr[2][0] * arr[1][1]);
        int prdt = a1 * a2 * a3;
        if (sum1 == sum2 && prdt == determinant) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}        