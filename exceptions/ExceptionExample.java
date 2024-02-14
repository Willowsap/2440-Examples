package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Examples of exception handling in java.
 * 
 * @author Willow Sapphire
 * @version 02/14/2024
 */
public class ExceptionExample
{
    /**
     * A function that handles and throws exceptions.
     */
    public static void exceptions()
    {
        // code that could cause an exception
        try
        {
            Scanner kb = new Scanner(new File("something"));
            int x = kb.nextInt();
            kb.close();
            if (x < 0)
            {
                throw new IllegalArgumentException("The first character must be a positive int");
            }
        }
        // catches two different types of exceptions in one block.
        catch (FileNotFoundException | InputMismatchException e)
        {
            System.out.println("Could not read in the file");
        }
        // always runs
        finally
        {
            System.out.println("That's all");
        }
    }
}
