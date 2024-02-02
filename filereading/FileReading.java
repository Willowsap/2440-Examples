package filereading;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileReading
{
    public static void main(String[] args)
    {
        int[][] nums = new int[4][5];
        try
        {
            Scanner fileIn = new Scanner(new File("data/nums.txt"));
            for (int i = 0; i < nums.length; i++)
            {
                for (int j = 0; j < nums[i].length; j++)
                {
                    nums[i][j] = fileIn.nextInt();
                }
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Could not open the file");
        }
        printArray(nums);
    }

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