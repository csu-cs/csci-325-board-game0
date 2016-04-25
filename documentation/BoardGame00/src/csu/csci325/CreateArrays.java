package csu.csci325;

import java.util.Random;

/**
 * Created by nn352d on 4/12/2016.
 */
public class CreateArrays
{
    public char[] createCharAlphabet()
    {
        char[] alphabetChar = new char[26];
        alphabetChar[0] = 'A';
        alphabetChar[1] = 'B';
        alphabetChar[2] = 'C';
        alphabetChar[3] = 'D';
        alphabetChar[4] = 'E';
        alphabetChar[5] = 'F';
        alphabetChar[6] = 'G';
        alphabetChar[7] = 'H';
        alphabetChar[8] = 'I';
        alphabetChar[9] = 'J';
        alphabetChar[10] = 'K';
        alphabetChar[11] = 'L';
        alphabetChar[12] = 'M';
        alphabetChar[13] = 'N';
        alphabetChar[14] = 'O';
        alphabetChar[15] = 'P';
        alphabetChar[16] = 'Q';
        alphabetChar[17] = 'R';
        alphabetChar[18] = 'S';
        alphabetChar[19] = 'T';
        alphabetChar[20] = 'U';
        alphabetChar[21] = 'V';
        alphabetChar[22] = 'W';
        alphabetChar[23] = 'X';
        alphabetChar[24] = 'Y';
        alphabetChar[25] = 'Z';

        return alphabetChar;
    }

    public char[] createWord(String in)
    {
        char[] word = new char[5];
        word[0] = in.charAt(0);
        word[1] = in.charAt(1);
        word[2] = in.charAt(2);
        word[3] = in.charAt(3);
        word[4] = in.charAt(4);

        return word;
    }

    public String getWordString()
    {
        Random random = new Random();
        String[] words = new String[25];
        words[0] = "GUIDE";
        words[1] = "LUCKY";
        words[2] = "SWARMS";
        words[3] = "LOVER";
        words[4] = "BOOKS";
        words[5] = "CHAIR";
        words[6] = "MOVIE";
        words[7] = "DINER";
        words[8] = "HANDS";
        words[9] = "GLOVE";
        words[10] = "SCARF";
        words[11] = "PUNCH";
        words[12] = "CRANK";
        words[13] = "FEVER";
        words[14] = "SHOOT";
        words[15] = "SHRIMP";
        words[16] = "BROKE";
        words[17] = "CROWN";
        words[18] = "PUNCH";
        words[19] = "CHAMP";
        words[20] = "PRANK";
        words[21] = "PLACE";
        words[22] = "TOKYO";
        words[23] = "PLANE";
        words[24] = "FRAME";

        return words[random.nextInt(24)];
    }
}

