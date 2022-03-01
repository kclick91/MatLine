public class Matrix {

    private int rows;
    private int columns;
    private int[][] values;

    public Matrix()
    {

    }

    public Matrix(int[][] vals)
    {
        values = vals;
        rows = vals.length;
        columns = vals[0].length;
    }

    public int[][] GetValues()
    {
        return values;
    }
    public void SetMatrixValues(int[][] vals)
    {
        values = vals;
        rows = vals.length;
        columns = vals[0].length;
    }
    public int GetRows()
    {
        return rows;

    }

    public int GetColumns()
    {
        return columns;
    }
    public void PrintValues()
    {
        StringBuffer sb = new StringBuffer();
        for (int i = 0 ; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                sb.append(values[i][j] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    public boolean IsSquare()
    {
        boolean isSquare = false;
        if(rows == columns)
        {
            isSquare = true;
        }
        return isSquare;
    }

    public boolean IsDiagonal()
    {
        boolean iD = true;
        if (!IsSquare())
        {
            iD = false;
        }
        for (int i = 0 ; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                if (i != j && values[i][j] != 0)
                {
                    iD = false;
                }
                if (i == j && values[i][j] == 0)
                {
                    iD = false;
                }
            }
        }
        return iD;
    }
    public boolean IsIdentity()
    {
        boolean iD = true;
        if (!IsSquare())
        {
            iD = false;
        }
        for (int i = 0 ; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                if (i != j && values[i][j] != 0)
                {
                    iD = false;
                }
                if (i == j && values[i][j] != 1)
                {
                    iD = false;
                }
            }
        }
        return iD;
    }
    public boolean IsTriangular()
    {
        boolean iD = true;
        if (!IsSquare())
        {
            iD = false;
        }
        for (int i = 0 ; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {

            }
        }
        return iD;
    }

    public int[][] Add(Matrix m)
    {
        int[][] newMatrix = new int[rows][columns];
        if (rows == m.GetRows() && columns == m.GetColumns())
        {
            for (int i = 0; i < rows; i++)
            {
                for (int j = 0; j < columns; j++)
                {
                    newMatrix[i][j] = values[i][j] + m.GetValues()[i][j];
                }
            }
        }
        else
        {
            System.out.println("Wrong dimensions.");
        }
        return newMatrix;
    }
    public int[][] Subtract(Matrix m)
    {
        int[][] newMatrix = new int[rows][columns];
        if (rows == m.GetRows() && columns == m.GetColumns())
        {
            for (int i = 0; i < rows; i++)
            {
                for (int j = 0; j < columns; j++)
                {
                    newMatrix[i][j] = values[i][j] - m.GetValues()[i][j];
                }
            }
        }
        else
        {
            System.out.println("Wrong dimensions.");
        }
        return newMatrix;
    }
    /*
    public int[][] Multiply(Matrix m)
    {

        if (columns == m.GetRows())
        {
            for (int i = 0; i < columns; i++)
            {
                for (int j = 0; j < m.GetRows(); j++)
                {

                }
            }
        }
        else
        {
            System.out.println("Wrong Dimensions");
        }
    }
     */
}
