package mdarrays;

/**
 * Multi-Dimensional Array Examples!
 * 
 * @author Willow Sapphire
 * @version 01/22/2024
 */
public class ArrayExample
{
    public static void main(String[] args)
    {
        /*
         * This creates a ragged array. There will be 8 arrays in the array.
         * Each array in the array will be a random length
         */
        int[][] myArray = new int[8][];
        for (int i = 0; i < myArray.length; i++)
        {
            myArray[i] = getRandomArray();
        }
        // prints the entire array
        System.out.println("Entire Array");
        for (int i = 0; i < myArray.length; i++)
        {
            for (int j = 0; j < myArray[i].length; j++)
            {
                System.out.print(myArray[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Evens");
        printEvens(myArray);

        /* Simple, hard-coded 2D array */
        // int[][] myArray = {
        //     {1, 2, 3, 4, 5},
        //     {6, 7, 8, 9, 10},
        //     {11, 12, 13, 14, 15}
        // };
    }

    /**
     * Prints a 2D array using regular for loops.
     * 
     * @param myArray the array to print.
     */
    public static void printRegular(int[][] myArray)
    {
        for (int i = 0; i < myArray.length; i++)
        {
            for (int j = 0; j < myArray[i].length; j++)
            {
                System.out.print(myArray[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * Prints a 2D array using enhanced for loops.
     * 
     * @param myArray the array to print.
     */
    public static void printEnhanced(int[][] myArray)
    {
        for (int[] row : myArray)
        {
            for (int element : row)
            {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    /**
     * Generates a random array of ints.
     * 
     * @return the random array of ints.
     */
    public static int[] getRandomArray()
    {
        int[] a = new int[(int)(Math.random() * 10) + 5];
        for (int i = 0; i < a.length; i++)
        {
            a[i] = (int)(Math.random() * 100);
        }
        return a;
    }

    /**
     * Prints all the numbers in a 2d array that are in even rows
     * and are even themselves.
     * 
     * @param numbers the array from which to print.
     */
    public static void printEvens(int[][] numbers)
    {
        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = 0; j < numbers[i].length; j++)
            {
                if (i % 2 == 0 && numbers[i][j] % 2 == 0)
                {
                    System.out.print(numbers[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}