public class main {

    public static void main(String[] args)
    {
        int[][] firstOne = {{2,4},{5,3},{2,4}};
        int[][] secondOne = {{4,6,5}, {3,4,9}, {4,2,4},{2,1,2}};
        int[][] thirdOne = {{4,6,5}, {3,4,9}, {4,2,4}};
        int[][] fourthOne = {{1, 0}, {0,2}};
        int[][] fifthOne = {{2, 0, 0}, {0, 6, 0}, {0, 0, 1}};
        int[][] sixthOne = {{1,0}, {0, 1}};
        Matrix mat = new Matrix(firstOne);
        Matrix matTwo = new Matrix(secondOne);
        Matrix matThree = new Matrix(thirdOne);
        Matrix matFour = new Matrix(fourthOne);
        Matrix matFive = new Matrix(fifthOne);
        Matrix matSix = new Matrix(sixthOne);

        System.out.println("Rows: " + mat.GetRows());
        System.out.println("Columns: " + mat.GetColumns());
        mat.PrintValues();
        System.out.println("Rows: " + matTwo.GetRows());
        System.out.println("Columns: " + matTwo.GetColumns());
        matTwo.PrintValues();
        System.out.println("Rows: " + matThree.GetRows());
        System.out.println("Columns: " + matThree.GetColumns());
        matThree.PrintValues();
        System.out.println("Rows: " + matFour.GetRows());
        System.out.println("Columns: " + matFour.GetColumns());
        matFour.PrintValues();
        System.out.println("Rows: " + matFive.GetRows());
        System.out.println("Columns: " + matFive.GetColumns());
        matFive.PrintValues();
        System.out.println("Rows: " + matSix.GetRows());
        System.out.println("Columns: " + matSix.GetColumns());
        matSix.PrintValues();
        System.out.println("Square: " + mat.IsSquare());
        System.out.println("Diagonal: " + mat.IsDiagonal());
        System.out.println("Identity: " + mat.IsIdentity());
        System.out.println("Square: " + matTwo.IsSquare());
        System.out.println("Diagonal: " + matTwo.IsDiagonal());
        System.out.println("Identity: " + matTwo.IsIdentity());
        System.out.println("Square: " + matThree.IsSquare());
        System.out.println("Diagonal: " + matThree.IsDiagonal());
        System.out.println("Identity: " + matThree.IsIdentity());
        System.out.println("Square: " + matFour.IsSquare());
        System.out.println("Diagonal: " + matFour.IsDiagonal());
        System.out.println("Identity: " + matFour.IsIdentity());
        System.out.println("Square: " + matFive.IsSquare());
        System.out.println("Diagonal: " + matFive.IsDiagonal());
        System.out.println("Identity: " + matFive.IsIdentity());
        System.out.println("Square: " + matSix.IsSquare());
        System.out.println("Diagonal: " + matSix.IsDiagonal());
        System.out.println("Identity: " + matSix.IsIdentity());

        int[][] nM = matSix.Add(new Matrix(fourthOne));
        Matrix mAdded = new Matrix(nM);
        mAdded.PrintValues();
        int[][] nMTwo = matSix.Subtract(new Matrix(fourthOne));
        Matrix mSubtracted = new Matrix(nMTwo);
        mSubtracted.PrintValues();



    }
}
