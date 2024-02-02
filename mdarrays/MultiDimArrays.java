package mdarrays;

public class MultiDimArrays
{
    private int[][][] a;

    public MultiDimArrays()
    {
        this.a = build3dArray(3, 3, 3);
    }

    public void increment(int i, int j, int k)
    {
        this.a[i][j][k]++;
    }

    public int[] getArray(int i, int j)
    {
        return this.a[i][j];
    }

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

    public static void main(String[] args)
    {
        MultiDimArrays m = new MultiDimArrays();
        int[] x = m.getArray(0, 0);
        x[x.length - 1] = 9;
        m.print();
    }
}
