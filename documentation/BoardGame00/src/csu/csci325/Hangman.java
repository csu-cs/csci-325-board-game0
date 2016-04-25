package csu.csci325;

import java.util.Scanner;

/**
 * Created by nn352d on 4/11/2016.
 */
public class Hangman
{
    public static void main(String[] args)
    {
        Worker worker = new Worker();
        Scanner scanner = new Scanner(System.in);
        char guess;        //the letter that the user inputs
        String temp;       //used for converting the user's guess (String) to a Char.
        int mistake = 0;   //increments when the user guesses incorrectly...used to determine end of game
        int correct = 0;   //increments when the user guesses correctly...used to determine end of game

        //Uses the mistake and correct flag to determine when to stop
        //The game will continue to run as long as the mistakes are less than 7 OR there is less than 5 correct guesses

        while(mistake < 6 && correct < 5)
        {
            worker.useFormatLines(1);
            worker.drawHangman(mistake);
            worker.useFormatLines(3);
            System.out.print("The word to guess: ");
            worker.printWord();
            worker.useFormatLines(3);
            System.out.print("Letters guessed so far: ");
            worker.printUsedLetters();
            worker.useFormatLines(3);
            System.out.println("Please guess a letter");
            worker.useFormatLines(2);
            temp = scanner.next();
            if(temp.length()<2)
            {
                guess = temp.charAt(0);
                guess = Character.toUpperCase(guess);
                if (worker.isValid(guess))
                {
                    if (!worker.checkForDuplicates(guess))
                    {
                        if (!worker.checkGoalWord(guess))
                        {
                            mistake++;
                        } else
                        {
                            correct = correct + worker.howManyRight(guess);
                        }
                    }
                }
            }
            else
            {
                System.out.println("******You have input more than one letter, please use one letter******");
                System.out.println("**********************************************************************");
            }
        }

        if(correct == 5)
        {
            System.out.println("Congratulations, you have guessed the word!!!");
            System.out.println("The word was: " + worker.getGoalWord());
            worker.useFormatLines(5);
        }
        else
        {
            worker.useFormatLines(1);
            worker.drawHangman(mistake);
            worker.useFormatLines(1);
            System.out.println("You have been HANGED!!!");
            System.out.println("The word was: " + worker.getGoalWord());
            worker.useFormatLines(5);
        }
    }
}