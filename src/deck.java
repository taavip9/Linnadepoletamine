import java.util.*;

/**
 * Created by Taavi on 4.10.2016.
 */
public class deck {

        List<kaart> _kaardid;

    public deck(){
        int jarjekorranr;
        List<kaart> kaardid = new ArrayList<kaart>();

        for (jarjekorranr = 1; jarjekorranr != 53; jarjekorranr++){
            for ( int rmast = 1; rmast <= 4; rmast++ ) {
                for ( int rmvaart = 1; rmvaart <= 13; rmvaart++ ) {
                    kaardid.add(new kaart(rmast, rmvaart));

                }
            }
        }

            _kaardid = kaardid;
        }

    public void shuffle ()
    {
        Collections.shuffle(_kaardid);

        int i;
        for (i=1;i!=52; i++ ){
            kaart esimene = _kaardid.get(i);
            int kl = esimene.kaardiv();
            int fl = esimene.mastiv();
            System.out.println(kl+" ja "+ fl);}
    }
    public void deal(){
        int a;
        for (a=1;a<6;a++){
            kaart hand = _kaardid.get(a);
        }
    }
}


