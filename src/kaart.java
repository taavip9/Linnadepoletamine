//Class Kaart
public class kaart {

    private int _kaardivaartus;
    private int _mast;

    //Loodavalt kaardile antakse mast ja suurus
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
