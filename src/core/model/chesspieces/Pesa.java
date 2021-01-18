package core.model.chesspieces;

import core.view.CellDrawable;

public abstract class Pesa implements CellDrawable {

    // jugador de la pesa 1 (blanc) o 2 (negre)
    protected int jugador;


    public int getJugador() {
        return jugador;
    }

    public void setJugador(int jugador) {
        this.jugador = jugador;
    }

    ///
    ///Funcions estàtiques de Pesa
    ///

    public static Pesa getPesa(String nomPesa) throws badSelection {
        Pesa pesa;
        switch (nomPesa) {
            case "bishop" :
                pesa = new Alfil();
                break;
            case "kight":
                pesa = new Cavall();
                break;
            case "pawnn" :
                pesa = new Peo();
                break;
            case "king" :
                pesa = new Rei();
                break;
            case "queen" :
                pesa = new Reina();
                break;
            case "rook" :
                pesa = new Torre();
                break;
            default :
                throw new badSelection();
        }

        return pesa;
    }

    public static Pesa getPesa(String nomPesa, int jugador) throws badSelection {
        Pesa pesa = getPesa(nomPesa);

        pesa.setJugador(jugador);
        return pesa;
    }

    public static class badSelection extends Exception {

    }
}
