/**
 * Created by Taavi on 4.10.2016.
 */
import javafx.scene.image.Image;

public class kaart {

    private int _kaardivaartus;
    private int _mast;
    private Image image;

    public kaart (int kaardivaartus, int mast){

        _kaardivaartus = kaardivaartus;
        _mast = mast;

    }

    public int kaardiv() {

        return _kaardivaartus;
    }

    public int mastiv(){

        return _mast;
    }
    Image getImage() {
        return image;
    }



}
