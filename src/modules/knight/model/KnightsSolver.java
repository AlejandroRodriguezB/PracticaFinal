/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules.knight.model;

import core.model.chesspieces.Cavall;
import core.view.CellDrawable;
import modules.knight.view.IntegerCellDrawable;

/**
 *
 * @author Pau
 */
public class KnightsSolver {

    private int[][] tablero;
    private int boardSize;
    private int boardSizeNoZero;
    private int initalColumn;
    private int initialRow;
    CellDrawable[][] drawnBoard;

    public KnightsSolver(int boardSize, int initalColumn, int initialRow) {
        this.boardSize=boardSize;
        this.initalColumn=initalColumn-1;
        this.initialRow=initialRow-1;
        boardSizeNoZero=boardSize;
        tablero = new int[boardSizeNoZero][boardSizeNoZero];
        drawnBoard= new IntegerCellDrawable[boardSizeNoZero][boardSizeNoZero];
        initTablero();
        intToCellDrawable();
    }
    public CellDrawable[][] getDrawnBoard() {
        return drawnBoard;
    }
    
    private void initTablero(){
        for (int i = 1; i < boardSizeNoZero; i++) {
            for (int j = 0; j < boardSizeNoZero; j++) {
                tablero[i][j] = j;
            }
        }
        tablero[initalColumn][initialRow]=99;
    }
    private void intToCellDrawable(){   
        for (int i = 0; i < boardSizeNoZero; i++) {
            for (int j = 0; j < boardSizeNoZero; j++) {
                IntegerCellDrawable dibujoNumero = new IntegerCellDrawable(tablero[i][j]);
                drawnBoard[i][j]=dibujoNumero;
            }
        }
        
    }

    @Override
    public String toString() {
        for (int i = 0; i < boardSizeNoZero; i++) 
             {
                for (int j = 0; j < boardSizeNoZero; j++) 
                {
                    System.out.print(tablero[i][j]+ " ");
                }
                 System.out.println(" ");
             }
        return null;
    }
}
