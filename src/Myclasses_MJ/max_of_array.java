package Myclasses_MJ;

public class max_of_array {
    public static void main(String[] args) {

        int[] marks = {45, 96, 76, 89, 12};
        int min = 96;
        for (int element : marks) {
            if (element < min) {
                min = element;

            }

        }
        System.out.println(min);
    }
}
