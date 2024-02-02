package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample
{
    public static void main(String[] args)
    {
        try {
            Scanner kb = new Scanner(
                new File("something")
            );
            int x = kb.nextInt();
            if (x < 0)
            {
                throw new IllegalArgumentException("The first character must be a positive int");
            }
            return;
        }
        catch (FileNotFoundException | InputMismatchException e) {
            System.out.println("Could not read in the file");
        }
        finally {
            System.out.println("That's all");
        }
    }
}
