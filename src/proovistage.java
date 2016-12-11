/**
 * Created by Taavi on 20.10.2016.
 */

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;


public class proovistage extends Application {

    boolean turn = true;
    int value1;
    int value2;
    kaart player1kaart;
    kaart player2kaart;
    List<kaart> graveyard1 = new ArrayList<kaart>();
    List<kaart> graveyard2 = new ArrayList<kaart>();
    List<kaart> storage = new ArrayList<kaart>();
    List<kaart> draw = new ArrayList<kaart>();
    int j = 0;


    @Override
    public void start(Stage laud) {

        Group root = new Group();
        Scene stseen = new Scene(root, Color.DARKGREEN);

        List<Image> clubs = new ArrayList<Image>();
        clubs.add(new Image("kaardid/clubs/png/2 clubs.png"));
        clubs.add(new Image("kaardid/clubs/png/3 clubs.png"));
        clubs.add(new Image("kaardid/clubs/png/4 clubs.png"));
        clubs.add(new Image("kaardid/clubs/png/5 clubs.png"));
        clubs.add(new Image("kaardid/clubs/png/6 clubs.png"));
        clubs.add(new Image("kaardid/clubs/png/7 clubs.png"));
        clubs.add(new Image("kaardid/clubs/png/8 clubs.png"));
        clubs.add(new Image("kaardid/clubs/png/9 clubs.png"));
        clubs.add(new Image("kaardid/clubs/png/10 clubs.png"));
        clubs.add(new Image("kaardid/clubs/png/J clubs.png"));
        clubs.add(new Image("kaardid/clubs/png/Q clubs.png"));
        clubs.add(new Image("kaardid/clubs/png/K clubs.png"));
        clubs.add(new Image("kaardid/clubs/png/A clubs.png"));

        List<Image> diamonds = new ArrayList<Image>();
        diamonds.add(new Image("kaardid/diamonds/png/2 diamonds copy.png"));
        diamonds.add(new Image("kaardid/diamonds/png/3 diamonds copy.png"));
        diamonds.add(new Image("kaardid/diamonds/png/4 diamonds copy.png"));
        diamonds.add(new Image("kaardid/diamonds/png/5 diamonds copy.png"));
        diamonds.add(new Image("kaardid/diamonds/png/6 diamonds copy.png"));
        diamonds.add(new Image("kaardid/diamonds/png/7 diamonds copy.png"));
        diamonds.add(new Image("kaardid/diamonds/png/8 diamonds copy.png"));
        diamonds.add(new Image("kaardid/diamonds/png/9 diamonds copy.png"));
        diamonds.add(new Image("kaardid/diamonds/png/10 diamonds copy.png"));
        diamonds.add(new Image("kaardid/diamonds/png/J diamonds copy.png"));
        diamonds.add(new Image("kaardid/diamonds/png/Q diamonds copy.png"));
        diamonds.add(new Image("kaardid/diamonds/png/K diamonds copy.png"));
        diamonds.add(new Image("kaardid/diamonds/png/A diamonds copy.png"));

        List<Image> hearts = new ArrayList<Image>();
        hearts.add(new Image("kaardid/hearts/png/2 hearts copy.png"));
        hearts.add(new Image("kaardid/hearts/png/3 hearts copy.png"));
        hearts.add(new Image("kaardid/hearts/png/4 hearts copy.png"));
        hearts.add(new Image("kaardid/hearts/png/5 hearts copy.png"));
        hearts.add(new Image("kaardid/hearts/png/6 hearts copy.png"));
        hearts.add(new Image("kaardid/hearts/png/7 hearts copy.png"));
        hearts.add(new Image("kaardid/hearts/png/8 hearts copy.png"));
        hearts.add(new Image("kaardid/hearts/png/9 hearts copy.png"));
        hearts.add(new Image("kaardid/hearts/png/10 hearts copy.png"));
        hearts.add(new Image("kaardid/hearts/png/J hearts copy.png"));
        hearts.add(new Image("kaardid/hearts/png/Q hearts copy.png"));
        hearts.add(new Image("kaardid/hearts/png/K hearts copy.png"));
        hearts.add(new Image("kaardid/hearts/png/A hearts copy.png"));

        List<Image> spades = new ArrayList<Image>();
        spades.add(new Image("kaardid/spades/png/2 spades.png"));
        spades.add(new Image("kaardid/spades/png/3 spades copy.png"));
        spades.add(new Image("kaardid/spades/png/4 spades copy.png"));
        spades.add(new Image("kaardid/spades/png/5 spades copy.png"));
        spades.add(new Image("kaardid/spades/png/6 spades copy.png"));
        spades.add(new Image("kaardid/spades/png/7 spades copy.png"));
        spades.add(new Image("kaardid/spades/png/8 spades copy.png"));
        spades.add(new Image("kaardid/spades/png/9 spades copy.png"));
        spades.add(new Image("kaardid/spades/png/10 spades copy.png"));
        spades.add(new Image("kaardid/spades/png/J spades copy.png"));
        spades.add(new Image("kaardid/spades/png/Q spades copy.png"));
        spades.add(new Image("kaardid/spades/png/K spades copy.png"));
        spades.add(new Image("kaardid/spades/png/A spades copy.png"));


        Image kaart = new Image("kaardid/tagus.png");
        Image tuhi = new Image("kaardid/emptyspace.png");


        ImageView iv1 = new ImageView(kaart);
        ImageView iv2 = new ImageView(kaart);

        ImageView iv3 = new ImageView(tuhi);
        ImageView iv4 = new ImageView(tuhi);
        ImageView iv5 = new ImageView(tuhi);
        ImageView iv6 = new ImageView(tuhi);

        ImageView iv8 = new ImageView(tuhi);
        ImageView iv9 = new ImageView(tuhi);
        ImageView iv10 = new ImageView(tuhi);
        ImageView iv11 = new ImageView(tuhi);

        ImageView iv13 = new ImageView(tuhi);
        ImageView iv14 = new ImageView(tuhi);



            /*Kaartide image*/
        iv1.setTranslateX(25);
        iv1.setTranslateY(40);
        iv2.setTranslateX(-80);
        iv2.setTranslateY(450);

            /*Alumised tühjad kohad*/
        iv3.setTranslateX(80);
        iv3.setTranslateY(450);
        iv4.setTranslateX(100);
        iv4.setTranslateY(450);
        iv5.setTranslateX(120);
        iv5.setTranslateY(450);
        iv6.setTranslateX(140);
        iv6.setTranslateY(450);

            /*Ülemised tühjad kohad*/
        iv8.setTranslateX(-540);
        iv8.setTranslateY(40);
        iv9.setTranslateX(-520);
        iv9.setTranslateY(40);
        iv10.setTranslateX(-500);
        iv10.setTranslateY(40);
        iv11.setTranslateX(-480);
        iv11.setTranslateY(40);

            /*Keskmised tühjad kohad*/
        iv13.setTranslateX(-1000);
        iv13.setTranslateY(240);
        iv14.setTranslateX(-900);
        iv14.setTranslateY(240);

        deck uusdeck1 = new deck();
        deck uusdeck2 = new deck();




            /*ülemised tühjad kohad clickides iv.8-12*/

        iv8.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                if (turn == true) {
                    kaart card0 = uusdeck1._kaardid.get(0);

                    if (card0.mastiv() == 1) {
                        iv13.setImage(clubs.get(card0.kaardiv()));
                    }
                    if (card0.mastiv() == 2) {
                        iv13.setImage(diamonds.get(card0.kaardiv()));
                    }
                    if (card0.mastiv() == 3) {
                        iv13.setImage(hearts.get(card0.kaardiv()));
                    }
                    if (card0.mastiv() == 4) {
                        iv13.setImage(spades.get(card0.kaardiv()));
                    }
                    iv8.setImage(tuhi);
                    value1 = card0.kaardiv();
                    storage.add(card0);
                    player1kaart = card0;
                    System.out.println(storage.size());
                    turn = false;
                    iv14.setImage(tuhi);
                }
            }
        });

        iv9.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                if (turn == true) {
                    kaart card1 = uusdeck1._kaardid.get(1);
                    if (card1.mastiv() == 1) {
                        iv13.setImage(clubs.get(card1.kaardiv()));
                    }
                    if (card1.mastiv() == 2) {
                        iv13.setImage(diamonds.get(card1.kaardiv()));
                    }
                    if (card1.mastiv() == 3) {
                        iv13.setImage(hearts.get(card1.kaardiv()));
                    }
                    if (card1.mastiv() == 4) {
                        iv13.setImage(spades.get(card1.kaardiv()));
                    }
                    iv9.setImage(tuhi);
                    value1 = card1.kaardiv();
                    storage.add(card1);
                    player1kaart = card1;
                    turn = false;
                    iv14.setImage(tuhi);
                }
            }
        });

        iv10.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                if (turn == true) {
                    kaart card2 = uusdeck1._kaardid.get(2);

                    if (card2.mastiv() == 1) {
                        iv13.setImage(clubs.get(card2.kaardiv()));
                    }
                    if (card2.mastiv() == 2) {
                        iv13.setImage(diamonds.get(card2.kaardiv()));
                    }
                    if (card2.mastiv() == 3) {
                        iv13.setImage(hearts.get(card2.kaardiv()));
                    }
                    if (card2.mastiv() == 4) {
                        iv13.setImage(spades.get(card2.kaardiv()));
                    }
                    iv10.setImage(tuhi);
                    value1 = card2.kaardiv();
                    storage.add(card2);
                    player1kaart = card2;
                    turn = false;
                    iv14.setImage(tuhi);
                }
            }
        });

        iv11.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                if (turn == true) {
                    kaart card3 = uusdeck1._kaardid.get(3);

                    if (card3.mastiv() == 1) {
                        iv13.setImage(clubs.get(card3.kaardiv()));
                    }
                    if (card3.mastiv() == 2) {
                        iv13.setImage(diamonds.get(card3.kaardiv()));
                    }
                    if (card3.mastiv() == 3) {
                        iv13.setImage(hearts.get(card3.kaardiv()));
                    }
                    if (card3.mastiv() == 4) {
                        iv13.setImage(spades.get(card3.kaardiv()));
                    }
                    iv11.setImage(tuhi);
                    value1 = card3.kaardiv();
                    storage.add(card3);
                    player1kaart = card3;
                    turn = false;
                    iv14.setImage(tuhi);
                }
            }
        });




            /*iv3-7 on alumised tühjad kohad*/
        iv3.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                if (turn == false) {
                    kaart card5 = uusdeck2._kaardid.get(0);
                    if (card5.mastiv() == 1) {
                        iv14.setImage(clubs.get(card5.kaardiv()));
                    }
                    if (card5.mastiv() == 2) {
                        iv14.setImage(diamonds.get(card5.kaardiv()));
                    }
                    if (card5.mastiv() == 3) {
                        iv14.setImage(hearts.get(card5.kaardiv()));
                    }
                    if (card5.mastiv() == 4) {
                        iv14.setImage(spades.get(card5.kaardiv()));
                    }
                    iv3.setImage(tuhi);
                    value2 = card5.kaardiv();
                    storage.add(card5);
                    player2kaart = card5;
                    turn = true;
                }

            }
        });

        iv4.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                if (turn == false) {
                    kaart card6 = uusdeck2._kaardid.get(1);
                    if (card6.mastiv() == 1) {
                        iv14.setImage(clubs.get(card6.kaardiv()));
                    }
                    if (card6.mastiv() == 2) {
                        iv14.setImage(diamonds.get(card6.kaardiv()));
                    }
                    if (card6.mastiv() == 3) {
                        iv14.setImage(hearts.get(card6.kaardiv()));
                    }
                    if (card6.mastiv() == 4) {
                        iv14.setImage(spades.get(card6.kaardiv()));
                    }
                    iv4.setImage(tuhi);
                    value2 = card6.kaardiv();
                    storage.add(card6);
                    player2kaart = card6;
                    turn = true;
                }

            }
        });

        iv5.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                if (turn == false) {
                    kaart card7 = uusdeck2._kaardid.get(2);
                    if (card7.mastiv() == 1) {
                        iv14.setImage(clubs.get(card7.kaardiv()));
                    }
                    if (card7.mastiv() == 2) {
                        iv14.setImage(diamonds.get(card7.kaardiv()));
                    }
                    if (card7.mastiv() == 3) {
                        iv14.setImage(hearts.get(card7.kaardiv()));
                    }
                    if (card7.mastiv() == 4) {
                        iv14.setImage(spades.get(card7.kaardiv()));
                    }
                    iv5.setImage(tuhi);
                    value2 = card7.kaardiv();
                    storage.add(card7);
                    player2kaart = card7;
                    turn = true;
                }

            }
        });

        iv6.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                if (turn == false) {
                    kaart card8 = uusdeck2._kaardid.get(3);
                    if (card8.mastiv() == 1) {
                        iv14.setImage(clubs.get(card8.kaardiv()));
                    }
                    if (card8.mastiv() == 2) {
                        iv14.setImage(diamonds.get(card8.kaardiv()));
                    }
                    if (card8.mastiv() == 3) {
                        iv14.setImage(hearts.get(card8.kaardiv()));
                    }
                    if (card8.mastiv() == 4) {
                        iv14.setImage(spades.get(card8.kaardiv()));
                    }
                    iv6.setImage(tuhi);
                    value2 = card8.kaardiv();
                    storage.add(card8);
                    player2kaart = card8;
                    turn = true;
                }

            }
        });





        stseen.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                if (storage.size()==2){

                    if (storage.get(0).kaardiv() > storage.get(1).kaardiv()) {
                        graveyard1.add(storage.get(0));
                        graveyard1.add(storage.get(1));
                        storage.clear();
                        if(draw.size() > 0) {
                            for (int h = 0; h < draw.size(); h++) {
                                graveyard1.add(draw.get(h));
                            }
                            draw.clear();
                        }
                        j++;
                    } else if (storage.get(0).kaardiv() < storage.get(1).kaardiv()){
                        graveyard2.add(storage.get(0));
                        graveyard2.add(storage.get(1));
                        storage.clear();
                        if(draw.size() > 0) {
                            for (int h = 0; h < draw.size(); h++) {
                                graveyard2.add(draw.get(h));
                            }
                            draw.clear();
                        }

                        j++;
                    } else {
                        draw.add(storage.get(0));
                        draw.add(storage.get(1));
                        storage.clear();
                        j++;
                    }
                    System.out.println(graveyard1.size() +"      "+graveyard2.size()+"       " +draw.size()+"     "+j+"       " +
                            "       "+storage.size());

                }

            }

        });


        iv1.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                if (turn == true && j%4 == 0){

                    if(j%4 == 0 && j!=0){
                        uusdeck1.remove();
                    }

                    if(uusdeck1._kaardid.size() == 4){
                        iv1.setImage(tuhi);
                    }else{
                        iv1.setImage(kaart);
                    }


                    iv8.setImage(kaart);
                    iv9.setImage(kaart);
                    iv10.setImage(kaart);
                    iv11.setImage(kaart);
                    turn = false;
                }

            }
        });


        iv2.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                if (turn == false && j%4 == 0) {

                    if(j%4 == 0 && j!=0){
                        uusdeck2.remove();
                    }

                    if(uusdeck2._kaardid.size() == 4){
                        iv2.setImage(tuhi);
                    }else{
                        iv2.setImage(kaart);
                    }

                    iv3.setImage(kaart);
                    iv4.setImage(kaart);
                    iv5.setImage(kaart);
                    iv6.setImage(kaart);
                    turn = true;
                }

            }
        });



        HBox box = new HBox();

        box.getChildren().add(iv1);
        box.getChildren().add(iv2);
        box.getChildren().add(iv3);
        box.getChildren().add(iv4);
        box.getChildren().add(iv5);
        box.getChildren().add(iv6);
        box.getChildren().add(iv8);
        box.getChildren().add(iv9);
        box.getChildren().add(iv10);
        box.getChildren().add(iv11);
        box.getChildren().add(iv13);
        box.getChildren().add(iv14);
        root.getChildren().add(box);


        laud.setTitle("Burn, baby burn");
        laud.setWidth(1200);
        laud.setHeight(700);
        laud.setScene(stseen);
        laud.show();
    }
}
