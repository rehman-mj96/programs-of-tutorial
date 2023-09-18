package Myclasses_MJ;

import java.util.Random;
import java.util.Scanner;

class Game {
    private int gNo;
    private int random;
    private int count = 0;
    Game() {
        Random rand = new Random();
        this.random = rand.nextInt(100);

    }

    public int getRand() {
        return random;
    }
    
    public void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        gNo = sc.nextInt();
    }

    public boolean isCorrectNo() {
        count++;
        if (gNo == random) {
                
            System.out.println("You have guessed the right Number!");
            return true;
            }

            else if (gNo < random) {
                System.out.println("Your guessed number is less than the correct number");
                return false;
            } else {
                System.out.println("Your guessed number is greater than the correct number");
                return false;
            }
            
    }
    
    
    public int score() {
        return count;
    }
}

public class Problem_of_game {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNo();
        }
        System.out.println(g.score());
    }
}
