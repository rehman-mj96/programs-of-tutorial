package Myclasses_MJ;

public class Method_Overloading {
    static void foo() {
        System.out.println("Good Morning bro");
    }

    static void foo(int a) {
        System.out.println("Good Morning " + a + " bro!");
    }

    static int foo(int a, int b) {
        System.out.println("Good Morning " + a + " bro!");
        System.out.println("Good Morning " + b + " bro!");
        return 3;
    }

    static void change(int a) {
        int x = 98;
    }

    static void tellJoke() {
        System.out.println("I invented a new word \n" + "Plagiarism");

    }

    static void change2(int[] array) {
        array[0] = 85;
    }

    public static void main(String[] args) {
        // tellJoke();
        /*int x = 45;
        change(x);
        System.out.println("the value of x after change is :"+ x);*/
        // int [] marks = {45, 96, 75, 67, 98};
        // change2(marks);
        // System.out.println("The value of marks[0] after change2 is:"+marks[0]);

        // Method Overloading
        foo();
        foo(3000);
        foo(2000, 3000);
    }
}
