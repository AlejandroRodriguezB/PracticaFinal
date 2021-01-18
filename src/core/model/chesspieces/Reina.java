package core.model.chesspieces;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author bernat
 */
public class Reina extends Pesa{
    
    public Reina() {
    }
    
   @Override
    public Image FiguraFBlanc() {
        Toolkit t = Toolkit.getDefaultToolkit ();
        return t.getImage("resources/imatges/Fons_Blanc/Reina.jpg");
    }

    @Override
    public Image FiguraFNegre() {
         Toolkit t = Toolkit.getDefaultToolkit ();
        return t.getImage("resources/imatges/Fons_Negre/Reina.jpg");
    }

    @Override
    public String toString() {
        return "Reina";
    }
}
