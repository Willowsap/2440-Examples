package filereading;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * File Reading Example.
 * 
 * @author Willow Sapphire
 * @version 02/14/2024
 */
public class FileReading
{
    /**
     * Reads in a file of numbers like a grid.
     * @param args
     */
    public void readFile()
    {
        String filename = "data/nums.txt";
        int[][] nums = new int[4][5];
        try
        {
            Scanner fileIn = new Scanner(new File(filename));
            for (int i = 0; i < nums.length; i++)
            {
                for (int j = 0; j < nums[i].length; j++)
                {
                    nums[i][j] = fileIn.nextInt();
                }
            }
            fileIn.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Could not open the file");
        }
        printArray(nums);
    }

    /**
     * Prints a two-dimensional array of numbers.
     * 
     * @param a the array to print.
     */
    public static void printArray(int[][] a)
    {
        for (int[] row : a)
        {
            for (int elem : row)
            {
                System.out.print(elem + "\t");
            }
            System.out.println();
        }
    }
}