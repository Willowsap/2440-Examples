package mdarrays;

/**
 * A class for playing with multi dimensional arrays.
 * 
 * @author Willow Sapphire
 * @version 02/14/2024
 */
public class MultiDimArrays
{
    /**
     * The array being played with.
     */
    private int[][][] a;

    /**
     * Creates a new multi dimensional array.
     */
    public MultiDimArrays()
    {
        this.a = build3dArray(3, 3, 3);
    }

    /**
     * Increments a value in the array.
     * 
     * @param i the middle array to access.
     * @param j the inner array to access.
     * @param k the item to access in the inner array.
     */
    public void increment(int i, int j, int k)
    {
        this.a[i][j][k]++;
    }

    /**
     * Gets a subarray.
     * 
     * @param i which middle array to access.
     * @param j which innter array to access.
     * @return the accessed array.
     */
    public int[] getArray(int i, int j)
    {
        return this.a[i][j];
    }

    /**
     * Builds a three dimensionsal array with the given dimensions.
     * 
     * @param dim1 the dimension of the outermost array
     * @param dim2 the dimension of the middle arrays
     * @param dim3 the dimension of the innermost arrays
     * @return the built array
     */
    public int[][][] build3dArray(int dim1, int dim2, int dim3)
    {
        int[][][] words = new int[dim1][dim2][dim3];
        for (int i = 0; i < words.length; i++)
        {
            for (int j = 0; j < words[i].length; j++)
            {
                for (int k = 0; k < words[i][j].length; k++)
                {
                    words[i][j][k] = 0;
                }
            }
        }
        return words;
    }

    /**
     * Prints the array nicely.
     */
    public void print()
    {
        for (int[][] twoDim : a)
        {
            for (int[] oneDim : twoDim)
            {
                for (int elem : oneDim)
                {
                    System.out.print(elem + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    // public static void main(String[] args)
    // {
    //     MultiDimArrays m = new MultiDimArrays();
    //     int[] x = m.getArray(0, 0);
    //     x[x.length - 1] = 9;
    //     m.print();
    // }
}
