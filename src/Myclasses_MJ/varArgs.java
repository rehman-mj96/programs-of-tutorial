package Myclasses_MJ;

public class varArgs {
    public static int sum(int x, int... arr) {
        int result = x;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to my Program!");
        System.out.println("The sum of nothing is : " + sum(0));
        System.out.println("The sum of 1 is : " + sum(1));
        System.out.println("The sum of 4 and 5 is: " + sum(4, 5));
        System.out.println("The sum of 4, 3 and 5 is: " + sum(4, 3, 5));
    }
}
