package core.model.chesspieces;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author bernat
 */
public class Torre extends Pesa{

    public Torre() {
    }
    
    @Override
    public Image FiguraFBlanc() {
         Toolkit t = Toolkit.getDefaultToolkit ();
        return t.getImage("resources/imatges/Fons_Blanc/Torre.jpg");
    }

    @Override
    public Image FiguraFNegre() {
        Toolkit t = Toolkit.getDefaultToolkit ();
        return t.getImage("resources/imatges/Fons_Negre/Torre.jpg");
    }
    @Override
    public String toString() {
        return "Torre";
    }
}
