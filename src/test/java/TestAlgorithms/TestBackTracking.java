package TestAlgorithms;

import org.gowtham.Algorithms.BackTracking.NQueenProblem;
import org.testng.annotations.Test;


public class TestBackTracking {

    @Test
    public void testNQueen(){
        int size = 8;
        NQueenProblem nQueenProblem = new NQueenProblem(size);
        nQueenProblem.fillChessBoard();
        nQueenProblem.solveProblem(0);
    }

    @Test
    public void testSudokuSolver(){
       /* int[][] unsolvedSudoku = new int[][]{
                { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 }};
        int n = unsolvedSudoku.length;
        if (solveSudoku(unsolvedSudoku, n))
        {
            // print solution
            print(unsolvedSudoku, n);
        }
        else {
            System.out.println("No solution");
        }*/
    }
}
