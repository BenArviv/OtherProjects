package FreeProjects;
import java.util.Scanner;
import java.util.Random;
/*
Class: Game (Rock-Paper-Scissors)
Author: Ben Arviv
Date: 16/10/2020
Description: This is an home-made Rock-Paper-Scissors game
*/


//The Game class will include the game parameter, as well as winning results, player's choice
//and a win-lose counter, for both the player and the pc.
public class Game{
    public static String s = "Scissors!";
    public static String r = "Rock!";
    public static String p = "Paper!";
    public static String opt1 = "Its a tie!";
    public static String opt2 = "You won!";
    public static String opt3 = "You lost!";
    String choice;
    int pCount;
    int cCount;
    
    //Game's constractor.
    public Game(String pChoice){
        choice = pChoice;
        pCount = 0;
        cCount = 0;
    }

    //This method gets the player's choice and randomly chooses a game parameter and send 
    //it to whoWin() method.
    public void play(String pl){
        Random rand = new Random();
        int cInput = rand.nextInt(3) + 1;
        String cChoice = finalChoice(cInput);
        System.out.println("You chose: " + pl);
        System.out.println("The computer chose: " + cChoice);
        System.out.println(this.whoWon(pl, cChoice));
        System.out.println("The score is: " + pCount +" : " + cCount);
        
    }

    //This method gets both player and computer's choices and decides who win by the rules. 
    //Then, it adds a point to winner's counter, and returns a winning (or tie) statement.
    public String whoWon(String player, String comp){
        if (player == comp){
            System.out.println();
            return opt1;
        }
        switch (player){
            case "Rock!":
                if (comp == s){
                    pCount++;
                    return opt2;
                } else if (comp == p){
                    cCount++;
                    return opt3;
                }
                break;
            case "Paper!":
                if (comp == r){
                    pCount++;
                    return opt2;
                } else if (comp == s){
                    cCount++;
                    return opt3;
                }
                break;
            case "Scissors!":
                if (comp == r){
                    cCount++;
                    return opt3;
                } else if (comp == p){
                    pCount++;
                    return opt2;
                }
                break;
        }
        return null;
     }

     //This method gets the inputted integer and translates it to the player's choice.
    public static String finalChoice(int num){
        if (num == 1){
            return r;
        } else if (num == 2){
            return p;
        } else if (num == 3){
            return s;
        }
        return null;
    }

    //A description and welcome note. 
    public static void helloNote(){
        System.out.println("Hello you!");
        System.out.println("This is a Rock-Paper-Scissors game.");
        System.out.println(" You have to chose one of the " + 
        "options below, while the computer will randomly choose too.");
        System.out.println("Please select: ");
        menu();
    }

    //Parameter options menu.
    public static void menu(){
        System.out.println("1. Rock!");
        System.out.println("2. Paper!");
        System.out.println("3. Scissors!");
    }

    public static void main(String[] args) {
        helloNote();
        int ifAgain;
        Scanner scan = new Scanner(System.in);          
        int input = scan.nextInt();
        Game rockPaperScissors = new Game(finalChoice(input));
        rockPaperScissors.play(rockPaperScissors.choice); //First round.

        System.out.println("Do you want to play again? 1. Yes, 2. No");
        ifAgain = scan.nextInt();
        while (ifAgain != 2) { //Second round and more, if player wants to. 
            menu();
            input = scan.nextInt();
            rockPaperScissors.play(finalChoice(input));
            System.out.println("Do you want to play again? 1. Yes, 2. No");
            ifAgain = scan.nextInt();
        } 
        System.out.println("Good bye!");
}
}
