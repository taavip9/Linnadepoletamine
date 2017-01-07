/**
 * Created by Taavi on 4.10.2016.
 */

public class kaart {

    private int _kaardivaartus;
    private int _mast;

    public kaart (int mast, int kaardivaartus){

        _kaardivaartus = kaardivaartus;
        _mast = mast;

    }

    public int kaardiv() {

        return _kaardivaartus;
    }

    public int mastiv(){

        return _mast;
    }

}
