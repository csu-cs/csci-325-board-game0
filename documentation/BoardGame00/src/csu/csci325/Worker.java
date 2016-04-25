package csu.csci325;

import csu.csci325.CreateArrays;

/**
 * Created by nn352d on 4/12/2016.
 */
public class Worker
{
    CreateArrays create = new CreateArrays();
    char guess = '\0';
    String temp = "";
    boolean keepGoing = true;



    //****************************************************
    //Create the Boolean array and the char array, they will
    //be used like a 2-D array.
    //****************************************************
    char[] goalWord = create.createWord(create.getWordString());
    boolean[] goalWordBool = new boolean[5];
    {
        for (int x=0;x<5;x++)
        {
            goalWordBool[x] = false;
        }
    }

    public String getGoalWord()
    {
        String goal = "";
        for(int x=0; x<5; x++)
        {
            goal = goal + goalWord[x];
        }
        return goal;
    }

    //****************************************************
    //Create the Boolean array and the char array, they will
    //be used like a 2-D array.
    //****************************************************
    boolean[] alphabetBool = new boolean[26];
    char[] alphabetChar = create.createCharAlphabet();


    public boolean checkForDuplicates(char guess)
    {
        boolean returnMe = true;
        for(int x=0;x<26;x++)
        {
            if(alphabetChar[x] == guess)
            {
                if(alphabetBool[x] == false)
                {
                    alphabetBool[x] = true;
                    returnMe = false;
                }
                else
                {
                    System.out.println("");
                    System.out.println("");
                    System.out.println("**********Sorry, you have already guessed that*********");
                    System.out.println("*******************************************************");
                    returnMe = true;
                }
            }
        }return returnMe;
    }

    public boolean checkGoalWord(char guess)
    {
        boolean returnMe = false;
        boolean flag = false;
        for(int x=0;x<5;x++)
        {
            if(goalWord[x] == guess)
            {
                goalWordBool[x] = true;
                returnMe = true;
                flag = true;
            }
            else if(!flag)
            {
                returnMe = false;
            }

        }
        if(!returnMe && !flag)
        {
            System.out.println("");
            System.out.println("");
            System.out.println("**************Your guess was not in the word***********");
            System.out.println("*******************************************************");

        }
        else
        {
            System.out.println("");
            System.out.println("");
            System.out.println("**************You have guessed correctly**************");
            System.out.println("******************************************************");

        }
        return flag;
    }

    public void printUsedLetters()
    {
        boolean flag = false;
        for(int x=0;x<26;x++)
        {
            if(alphabetBool[x] == true)
            {
                if(flag == false)
                {
                    System.out.print(alphabetChar[x]);
                    flag = true;
                }
                else
                {
                    System.out.print(", " + alphabetChar[x]);
                }
            }
        }
    }

    public void printWord()
    {
        for(int x=0;x<5;x++)
        {
            if(goalWordBool[x] == true)
            {
                System.out.print(goalWord[x] + " ");
            }
            else
            {
                System.out.print("* ");
            }
        }
    }

    /**
     * @param guess - the user's letter they input
     * @return true if valid, false in not valid
     */
    public boolean isValid(char guess) {
        boolean flag = false;
        for (int x = 0; x < 26; x++) {
            if (alphabetChar[x] == guess) {
                flag = true;
            }
        }
        if (flag == false)
        {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("********** Sorry, that is not a valid letter **********");
            System.out.println("*******************************************************");
        }

        return flag;
    }

    public void useFormatLines(int num)
    {
        for(int x=0; x<num;x++)
        {
            System.out.println("");
        }
    }

    public void drawHangman(int correct)
    {
        switch (correct) {
            case 0:
                System.out.println("           *************");
                System.out.println("           *           *");
                System.out.println("           *           *");
                System.out.println("                       *");
                System.out.println("                       *");
                System.out.println("                       *");
                System.out.println("                       *");
                System.out.println("                       *");
                System.out.println("                       *");
                System.out.println("                       *");
                System.out.println("                       *");
                System.out.println("                       *");
                System.out.println("                       *");
                System.out.println("            **********************");
                break;
            case 1:
                System.out.println("           *************");
                System.out.println("           *           *");
                System.out.println("          ****         *");
                System.out.println("          *  *         *");
                System.out.println("          ****         *");
                System.out.println("                       *");
                System.out.println("                       *");
                System.out.println("                       *");
                System.out.println("                       *");
                System.out.println("                       *");
                System.out.println("                       *");
                System.out.println("                       *");
                System.out.println("                       *");
                System.out.println("            **********************");
                break;
            case 2:
                System.out.println("           *************");
                System.out.println("           *           *");
                System.out.println("          ****         *");
                System.out.println("          *  *         *");
                System.out.println("          ****         *");
                System.out.println("           **          *");
                System.out.println("           **          *");
                System.out.println("           **          *");
                System.out.println("           **          *");
                System.out.println("           **          *");
                System.out.println("                       *");
                System.out.println("                       *");
                System.out.println("                       *");
                System.out.println("            **********************");
                break;
            case 3:
                System.out.println("           *************");
                System.out.println("           *           *");
                System.out.println("          ****         *");
                System.out.println("          *  *         *");
                System.out.println("          ****         *");
                System.out.println("           **          *");
                System.out.println("           **          *");
                System.out.println("           **          *");
                System.out.println("           **          *");
                System.out.println("           **          *");
                System.out.println("             *         *");
                System.out.println("              *        *");
                System.out.println("               *       *");
                System.out.println("            **********************");
                break;
            case 4:
                System.out.println("           *************");
                System.out.println("           *           *");
                System.out.println("          ****         *");
                System.out.println("          *  *         *");
                System.out.println("          ****         *");
                System.out.println("           **          *");
                System.out.println("           **          *");
                System.out.println("           **          *");
                System.out.println("           **          *");
                System.out.println("           **          *");
                System.out.println("          *  *         *");
                System.out.println("         *    *        *");
                System.out.println("        *       *      *");
                System.out.println("            **********************");
                break;
            case 5:
                System.out.println("           *************");
                System.out.println("           *           *");
                System.out.println("          ****         *");
                System.out.println("          *  *         *");
                System.out.println("          ****  *      *");
                System.out.println("           **  *       *");
                System.out.println("           ** *        *");
                System.out.println("           **          *");
                System.out.println("           **          *");
                System.out.println("           **          *");
                System.out.println("          *  *         *");
                System.out.println("         *    *        *");
                System.out.println("        *      *       *");
                System.out.println("            **********************");
                break;
            case 6:
                System.out.println("           *************");
                System.out.println("           *           *");
                System.out.println("          ****         *");
                System.out.println("          *  *         *");
                System.out.println("       *  ****  *      *");
                System.out.println("        *  **  *       *");
                System.out.println("         * ** *        *");
                System.out.println("           **          *");
                System.out.println("           **          *");
                System.out.println("           **          *");
                System.out.println("          *  *         *");
                System.out.println("         *    *        *");
                System.out.println("        *      *       *");
                System.out.println("            **********************");
                break;
        }
    }

    public int howManyRight(char guess)
    {
        int temp = 0;
        for(int x=0;x<5;x++)
        {
            if(goalWord[x] == guess)
            {
                temp++;
            }
        }
        return temp;
    }
}