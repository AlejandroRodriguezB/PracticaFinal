package core.model.chesspieces;

import java.awt.Image;
import java.awt.Toolkit;


/**
 *
 * @author bernat
 */
public class Cavall extends Pesa{
    
    public Cavall() {
    }
    private int[][] movimiento = {{2, 1}, {1, 2}, {-1, 2}, {-2, 1},
    {-2, -1}, {-1, -2}, {1, -2}, {2, -1}};

    public int[][] getMovimiento() {
        return movimiento;
    }
    
    @Override
    public Image FiguraFBlanc() {
         Toolkit t = Toolkit.getDefaultToolkit ();
        return t.getImage("resources/imatges/Fons_Blanc/Cavall.jpg");
    }

    @Override
    public Image FiguraFNegre() {
         Toolkit t = Toolkit.getDefaultToolkit ();
        return t.getImage("resources/imatges/Fons_Negre/Cavall.jpg");
    }

    @Override
    public String toString() {
        return "Cavall";
    }
}
