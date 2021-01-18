/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules.knight.model;

import core.model.chesspieces.Cavall;

/**
 *
 * @author Pau
 */
public class KnightsSolver {

//    private int[][] tablero;
//
//    public KnightsSolver(BoardDefinition model) {
//        tablero = new int[model.getBoardSize()][model.getBoardSize()];
//        for (int i = 1; i <= model.getBoardSize() + 1; i++) {
//            for (int j = 1; j <= model.getBoardSize() + 1; j++) {
//                tablero[i][j] = 0;
//            }
//        }
//    }
//
//    private void saltoCaballo(int x, int y, int i) {
//        int nx, ny;
//        int k;
//        k = 0; // inicializa el conjunto de posibles movimientos
//        do {
//            k++;
//            nx = x + Cavall[k - 1][0];
//            ny = y + SALTO[k - 1][1];
//// determina si nuevas coordenadas son aceptables
//            if ((nx >= 1) && (nx <= N) && (ny >= 1) && (ny <= N)
//                    && (tablero[nx][ny] == 0)) {
//                tablero[nx][ny] = i; // anota movimiento
//                if (i < N * N) {
//                    saltoCaballo(nx, ny, i + 1);
//// se analiza si se ha completado la solución
//                    if (!exito) { // no se alcanzó la solución
//                        tablero[nx][ny] = 0; // se borra anotación
//                    }
//                } else {
//                    exito = true; // tablero cubierto
//                }
//            }
//        } while ((k < 8) && !exito);
//    }
////muestra por pantalla los pasos del caballo
//
//    void escribirTablero() {
//        for (int i = 1; i <= N; i++) {
//            for (int j = 1; j <= N; j++) {
//                System.out.print(tablero[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
}
