import java.util.Random;
import java.util.Scanner;


class Game{
    int RandomNo,InputNo;
    private int noOfGuesses;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    public Game(){
        Random rand = new Random();
        this.RandomNo = rand.nextInt(100);
    }
    public void takeUserInput(){
        System.out.println("------    Guess the number  -------");
        Scanner sc = new Scanner(System.in);
        this.InputNo = sc.nextInt();
        sc.nextLine();
    }
    public boolean isCorrectNumber(){
        if (InputNo==RandomNo ){
            System.out.println("------   You Gussed Correct  :)  ---");
            return true;
        } else if (InputNo>RandomNo) {
            System.out.println("------Incorrect  No is Smaller  :(  ---");
            return false;
        }
        else if (InputNo<RandomNo) {
            System.out.println("------Incorrect  No is Bigger  :(  ---");
            return false;
        }
        else
            return false;
    }

    public  void PlayGame(){
       Game newGame = new Game();
        int gussNO = 0;
        do {
            this.takeUserInput();
            // no need to use newGame too
            //newGame.isCorrectNumber();
            // -- no need because it is running in while loop
            //or put while (InputNo!=RandomNo) so it will not print.
            gussNO++;
        }
        while (!this.isCorrectNumber());
        System.out.println("------WHEEE Your score   ---" +gussNO );

    }
}

public class Guess_the_No_Game {
    /*
           Create a class Game, which allows a user to play "Guess the Number"
           game once. Game should have the following methods:
           1. Constructor to generate the random number
           2. takeUserInput() to take a user input of number
           3. isCorrectNumber() to detect whether the number entered by the user is true
           4. getter and setter for noOfGuesses
           Use properties such as noOfGuesses(int), etc to get this task done!
        */
    public static void main(String[] args) {

            Game NGame = new Game();
            NGame.PlayGame(); // playgame

    }
}



