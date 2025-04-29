package Myclasses_MJ.NewJava;

import java.util.Scanner;

// STEP 1: Common abstraction
interface Patterns {
    void draw();  // Common method that each pattern must implement
}

// STEP 2: Record classes (encapsulated implementations)


// 1. Half Inverted Number Pyramid
record HalfInvertedNumberPyramid(int n) implements Patterns {
    @Override
    public void draw() {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

// 2. Half Star Pyramid (ascending then descending)
record HalfStarPyramid(int n) implements Patterns {
    @Override
    public void draw() {
        // Ascending pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Descending pattern
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// 3. Hollow Rectangle
record HollowRectangle(int length, int width) implements Patterns {
    @Override
    public void draw() {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                // Print * on the boundary only
                if (i == 0 || i == length - 1 || j == 0 || j == width - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

// 4. Solid Rectangle
record SolidRectangle(int length, int width) implements Patterns {
    @Override
    public void draw() {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// 5. Floyd's Triangle Pattern
record Floyd_Triangle(int n) implements Patterns {

    @Override
    public void draw() {
        int number = 1;
        for (int i = 1; i<=n ; i++){
            for (int j = 1 ; j<=i ; j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}

// 6. palindromic Pyramid
record PalindromicPyramid(int n) implements Patterns {
    @Override
public void draw() {
    int maxWidth = getLineWidth(n); // Width of the last line (widest)

    for (int i = 1; i <= n; i++) {
        int currentLineWidth = getLineWidth(i);
        int spaces = (maxWidth - currentLineWidth) / 2;

        // Print leading spaces
        for (int s = 0; s < spaces; s++) {
            System.out.print(" ");
        }

        // Print descending numbers
        for (int j = i; j >= 1; j--) {
            System.out.print(j + " ");
        }

        // Print ascending numbers
        for (int j = 2; j <= i; j++) {
            System.out.print(j + " ");
        }

        System.out.println();
    }
}

        // Helper method to compute total width (number + space) for a line
        private int getLineWidth(int row) {
            int width = 0;

            // Width for descending numbers
            for (int j = row; j >= 1; j--) {
                width += String.valueOf(j).length() + 1; // number + space
            }

            // Width for ascending numbers (starts from 2)
            for (int j = 2; j <= row; j++) {
                width += String.valueOf(j).length() + 1;
            }

            return width;
        }
}


        // STEP 3: Factory class to isolate object creation (Scalable design)
class PatternFactory {
    public static Patterns createPattern(int choice, Scanner sc) {
        switch (choice) {
            case 1 -> {
                System.out.print("Enter n: ");
                return new HalfInvertedNumberPyramid(sc.nextInt());
            }
            case 2 -> {
                System.out.print("Enter n: ");
                return new HalfStarPyramid(sc.nextInt());
            }
            case 3 -> {
                System.out.print("Enter length and width: ");
                return new HollowRectangle(sc.nextInt(), sc.nextInt());
            }
            case 4 -> {
                System.out.print("Enter length and width: ");
                return new SolidRectangle(sc.nextInt(), sc.nextInt());
            }
            case 5 -> {
                System.out.print("Enter no. of rows in the pattern: ");
                return new Floyd_Triangle(sc.nextInt());
            }
            case 6 -> {
                System.out.print("Enter height of the pyramid: ");
                return new PalindromicPyramid(sc.nextInt());
            }

            default -> {
                return null;
            }
        }

    }
}
// STEP 4: Main driver class
public class PatternsDemo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {  // Auto-closes scanner
            System.out.println("Choose a pattern to draw:");
            System.out.println("1. Half Inverted Number Pyramid");
            System.out.println("2. Half Star Pyramid");
            System.out.println("3. Hollow Rectangle");
            System.out.println("4. Solid Rectangle");
            System.out.println("5. Floye's Triangle");
            System.out.println("6. Palindromic Pyramid Pattern");
            System.out.print("Enter choice (1-5): ");

            int choice = sc.nextInt();
            Patterns pattern = PatternFactory.createPattern(choice, sc);

            if (pattern != null) {
                pattern.draw();  // Polymorphic behavior
            } else {
                System.out.println("Invalid choice. Exiting.");
            }
        }
    }
}
