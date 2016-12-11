/**
 * Created by Taavi on 10.10.2016.
 */
public class board {

    public board(){
        deck uusdeck1 = new deck();
        uusdeck1.shuffle();
        uusdeck1.deal();
        deck uusdeck2 = new deck();
        uusdeck2.shuffle();
        uusdeck2.deal();
        player esimene = new player();
        player teine = new player();

        uusdeck1.deal();
        uusdeck2.deal();



        int kaartone  = uusdeck1._kaardid.get(1).kaardiv();
        int kaarttwo  = uusdeck2._kaardid.get(1).kaardiv();

        if(kaartone>kaarttwo){
            System.out.println("esimene kaart on suurem ja võidab");
        }
        else{
            System.out.println("teine kaart on suurem ja võidab");
        }


    }

}
