package core.model.chesspieces;

import java.awt.Image;
import java.awt.Toolkit;


/**
 *
 * @author bernat
 */
public class Alfil extends Pesa {

    public Alfil() {
    }
        
    @Override
    public Image FiguraFBlanc() {
         Toolkit t = Toolkit.getDefaultToolkit ();
        return t.getImage("resources/imatges/Fons_Blanc/Alfil.jpg");
    }

    @Override
    public Image FiguraFNegre() {
         Toolkit t = Toolkit.getDefaultToolkit ();
        return t.getImage("resources/imatges/Fons_Negre/Alfil.jpg");
    }
    
    @Override
    public String toString() {
        return "Alfil";
    }
}
