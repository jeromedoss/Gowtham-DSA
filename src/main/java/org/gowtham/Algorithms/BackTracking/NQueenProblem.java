package org.gowtham.Algorithms.BackTracking;

import java.util.Arrays;

public class NQueenProblem {

    private final int size;
    private int solutionCounts;
    private final char[][] chessBoard;
    public NQueenProblem(int size){
        this.size = size;
        this.chessBoard = new char[size][size];
        this.solutionCounts = 0;
    }

    public void solveProblem(int row) {
        if (row == size) {
            System.out.println("Solution Count: " + ++solutionCounts);
            printChessBoard();
            System.out.println();
        } else {
            for (int i = 0; i < size; i++) {
                if (isSafe(chessBoard, row, i)) {
                    chessBoard[row][i] = 'Q';
                    solveProblem(row + 1);
                    chessBoard[row][i] = '#';
                }
            }
        }
    }
    private boolean isSafe(char[][] chessBoard, int row, int col){
        //checks row
        for(int i = 0; i < size; i++){
            if(chessBoard[row][i] == 'Q'){
                return false;
            }
        }
        //checks column
        for(int i = 0; i < size; i++){
            if(chessBoard[i][col] == 'Q'){
                return false;
            }
        }
        //checks left diagonal
        for(int i = row, j = col; i>=0 && j>=0; i--,j--){
            if(chessBoard[i][j] == 'Q'){
                return false;
            }
        }
        //checks right diagonal
        for(int i = row, j = col; i>=0 && j<size; i--,j++){
            if(chessBoard[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    private void printChessBoard(){
        for(int i = 0; i < size; i++){
            for(int j = 0; j< size; j++){
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void fillChessBoard(){
        for(int i = 0; i < size; i++) {
            Arrays.fill(chessBoard[i], '#');
        }
    }
}