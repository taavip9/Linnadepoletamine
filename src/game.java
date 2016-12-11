import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Taavi on 4.10.2016.
 */
public class game {

    public static void main(String[] args) {


        deck proovitest = new deck();



        int length = proovitest._kaardid.size();

        System.out.println(length);

        for (int i=0;i!=52; i++ ){
            kaart esimene = proovitest._kaardid.get(i);
            int kl = esimene.kaardiv();
            int fl = esimene.mastiv();
            System.out.println(kl+" ja "+ fl);}

        List<kaart> graveyard = new ArrayList<kaart>();

        /*for(int u = 0; u!=5; u++) {
            kaart a = proovitest._kaardid.get(u);
            graveyard.add(a);
            int sl = a.kaardiv();
            int ul = a.mastiv();
            System.out.println(graveyard.size()+" "+sl+" "+ul);

        }*/

    }


}
