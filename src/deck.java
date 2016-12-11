import java.util.*;

/**
 * Created by Taavi on 4.10.2016.
 */
public class deck {

        List<kaart> _kaardid;

    public deck(){
        List<kaart> kaardid = new ArrayList<kaart>();

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
    public void deal(){
        for(int i = 0; i!=4; i++)
        _kaardid.get(0);

    }

    public void remove(){
        for(int i = 0; i!=4; i++) {
            _kaardid.remove(0);
        }
    }

}


