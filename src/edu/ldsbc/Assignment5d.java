package edu.ldsbc;

public class Assignment5d {
    /**
     * @author Craig Smith
     * 10/7/2017
     * Package Name: chapter5
     * Objective: Random Numbers, Switch Statements
     * <p>
     * Play Rock, Paper, Scissors against the Computer: The computer randomly generates a number 0, 1, or 2 representing scissor, rock, and paper. The program then prompts the user to enter a number 0, 1, or 2, and then it displays a message indicating whether the game was a draw or if the user or computer won.
     * <p>
     * You must use a switch statement to solve this problem.
     * <p>
     * Examples:
     * Scissor(0), Rock(1), Paper(2): 1
     * The computer is rock. You are rock. It is a draw.
     * <p>
     * Scissor(0), Rock(1), Paper(2): 2
     * The computer is rock. You are paper. You won.
     * <p>
     * Scissor(0), Rock(1), Paper(2): 0
     * The computer is rock. You are scissor. You lost.
     */

    public static void main(String[] args) {

        //make a truth table
        String computer = "Rock";
        String player = "Rock";

        // |computer | player  | winner   |
        if(computer.equals("Rock") && player.equals("Rock"))
        {
            //result = .....
        }
        // | Rock    | Rock    | draw     |
        // | Rock    | Paper   | player   |
        // | Rock    | Scissor | computer |
        // |


    }
}
