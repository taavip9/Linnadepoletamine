import java.util.*;

//Deck class
public class deck {

        List<kaart> _kaardid;

    public deck(){
        List<kaart> kaardid = new ArrayList<kaart>();

            /*Deck-i loomine 2 "for" tsükli abil, esimne loob neli erinevat masti ning teine erinevad kaardid, kokku
            52 erinevat kaarti*/
            for ( int rmast = 1; rmast <= 4; rmast++ ) {
                for ( int rmvaart = 0; rmvaart <= 12; rmvaart++ ) {
                    kaardid.add(new kaart(rmast, rmvaart));

                }
            }

            _kaardid = kaardid;
        }

    public void shuffle ()
    {
        Collections.shuffle(_kaardid);

    }

    public void reset(){

        _kaardid.clear();

        List<kaart> kaardid = new ArrayList<kaart>();

        for ( int rmast = 1; rmast <= 4; rmast++ ) {
            for ( int rmvaart = 0; rmvaart <= 12; rmvaart++ ) {
                kaardid.add(new kaart(rmast, rmvaart));

            }
        }

        _kaardid = kaardid;
    }


}


