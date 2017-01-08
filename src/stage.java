/**
 * Created by Taavi on 20.10.2016.
 */

import javafx.application.Application;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;


public class stage extends Application {

    //Booleanid kontrollimaks millise playeri kord on
    boolean turn = true;

    //Booleanid kontrollimaks kas player 1 kaarte on klikidud
    boolean clickable1;
    boolean clickable2;
    boolean clickable3;
    boolean clickable4;

    //Booleanid kontrollimaks kas player 2 kaarte on klikidud
    boolean clickable11;
    boolean clickable22;
    boolean clickable33;
    boolean clickable44;

    //Graveyardid
    List<kaart> graveyard1 = new ArrayList<kaart>();
    List<kaart> graveyard2 = new ArrayList<kaart>();

    //Viigi puhul list kaartide hoidmiseks
    List<kaart> storage = new ArrayList<kaart>();
    List<kaart> draw = new ArrayList<kaart>();

    //Counter kordade lugemiseks
    int j;

    //Player 1 ja 2 skoorid
    int score1;
    int score2;


    @Override
    public void start(Stage laud) {

        Pane game = new Pane();
        Pane menu = new Pane();
        Pane endgame = new Pane();

        Scene stseen = new Scene(game);
        Scene mainmenu = new Scene(menu);
        Scene endgm = new Scene(endgame);

        //Steseenide background värvi määramine
        game.setStyle("-fx-background-color: darkgreen");
        menu.setStyle("-fx-background-color: darkgreen");
        endgame.setStyle("-fx-background-color: darkgreen");

        //Tekstide loomine ja disain
        Text endgametext = new Text();
        endgametext.setFont(Font.font("Baskerville Old Face", 90));
        endgametext.setFill(Color.YELLOW);
        endgametext.setTranslateY(200);
        endgametext.setTranslateX(45);

        Text heading = new Text();
        heading.setText("Linnade poletamine v2.0 !");
        heading.setFont(Font.font("Baskerville Old Face", 100));
        heading.setFill(Color.YELLOW);
        heading.setTranslateY(200);
        heading.setTranslateX(65);

        Label player1score = new Label();
        player1score.textProperty().bind(new SimpleIntegerProperty(score1).asString());
        player1score.setFont(Font.font("Baskerville Old Face", 80));
        player1score.setTextFill(Color.YELLOW);
        player1score.setTranslateX(1000);

        Label player2score = new Label();
        player2score.textProperty().bind(new SimpleIntegerProperty(score2).asString());
        player2score.setFont(Font.font("Baskerville Old Face", 80));
        player2score.setTextFill(Color.YELLOW);
        player2score.setTranslateX(1000);
        player2score.setTranslateY(400);

        //Nuppude loomine ja disain
        Button start_game = new Button();
        start_game.setText("Start Game!");
        start_game.setMinSize(400, 100);
        start_game.setTranslateX(380);
        start_game.setTranslateY(300);

        Button bck_strt_mnu = new Button();
        bck_strt_mnu.setText("Back to main menu");
        bck_strt_mnu.setMinSize(400, 100);
        bck_strt_mnu.setTranslateX(380);
        bck_strt_mnu.setTranslateY(300);



        //ArrayListid kaartide piltide hoidmiseks

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

        /*top_kaardid(0) - (3) on ülemised mängitavad kaardid (Player 1)*/
        List<ImageView> bot_kaardid = new ArrayList<ImageView>();
        bot_kaardid.add(new ImageView(tuhi));
        bot_kaardid.add(new ImageView(tuhi));
        bot_kaardid.add(new ImageView(tuhi));
        bot_kaardid.add(new ImageView(tuhi));

        /*bot_kaardid(0) - (3) on alumised mängitavad kaardid (Player 2)*/
        List<ImageView> top_kaardid = new ArrayList<ImageView>();
        top_kaardid.add(new ImageView(tuhi));
        top_kaardid.add(new ImageView(tuhi));
        top_kaardid.add(new ImageView(tuhi));
        top_kaardid.add(new ImageView(tuhi));

        /*ImageView-d kaardipakkide jaoks*/
        ImageView deck1_IV = new ImageView(kaart);
        ImageView deck2_IV = new ImageView(kaart);

        //ImageView-d kahe keskmise mängitava kaardi jaoks
        ImageView player1_crd_IV = new ImageView(tuhi);
        ImageView player2_crd_IV = new ImageView(tuhi);

        /*Kaardipakkide loomine ja segamine*/
        deck uusdeck1 = new deck();
        deck uusdeck2 = new deck();
        uusdeck1.shuffle();
        uusdeck2.shuffle();


        HBox box = new HBox(); // HBox kahe keskmise kaardi jaoks
        HBox box1 = new HBox(); // HBox alumiste mängitavate kaartide jaoks
        HBox box2 = new HBox(); // HBox ülemiste mängitavate kaartide jaoks
        VBox decks = new VBox(); // VBox kaardipakkide jaosk

        decks.setSpacing(240);
        decks.setTranslateX(45);
        decks.setTranslateY(45);

        box.setSpacing(40);
        box.setTranslateX(350);
        box.setTranslateY(240);

        box1.setSpacing(10);
        box1.setTranslateX(250);
        box1.setTranslateY(450);

        box2.setSpacing(10);
        box2.setTranslateX(250);
        box2.setTranslateY(45);

        decks.getChildren().addAll(deck1_IV, deck2_IV);
        box1.getChildren().addAll(bot_kaardid.get(0), bot_kaardid.get(1), bot_kaardid.get(2), bot_kaardid.get(3));
        box2.getChildren().addAll(top_kaardid.get(0), top_kaardid.get(1), top_kaardid.get(2), top_kaardid.get(3));
        box.getChildren().addAll(player1_crd_IV, player2_crd_IV);
        game.getChildren().addAll(box, box1, box2, decks, player1score, player2score);
        menu.getChildren().addAll(start_game, heading);
        endgame.getChildren().addAll(endgametext, bck_strt_mnu);


        laud.setTitle("Burn, baby burn");
        laud.setWidth(1200);
        laud.setHeight(700);
        laud.setScene(mainmenu);
        laud.show();

        //Nupp mängu alustamiseks main menüüs
        start_game.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                laud.setScene(stseen);
            }
        });

        //Nupp viib võidu korral tagasi peamenüüsse ja resettib kõik mängu parameetrid uue mängu jaoks
        bck_strt_mnu.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                laud.setScene(mainmenu);

                score1 = 0;
                score2 = 0;

                graveyard1.clear();
                graveyard2.clear();
                storage.clear();
                draw.clear();


                uusdeck1.reset();
                uusdeck2.reset();

                uusdeck1.shuffle();
                uusdeck2.shuffle();

                j = 0;

                turn = true;
                clickable1 = false;
                clickable2 = false;
                clickable3 = false;
                clickable4 = false;

                clickable11 = false;
                clickable22 = false;
                clickable33 = false;
                clickable44 = false;

                top_kaardid.get(0).setImage(tuhi);
                top_kaardid.get(1).setImage(tuhi);
                top_kaardid.get(2).setImage(tuhi);
                top_kaardid.get(3).setImage(tuhi);

                bot_kaardid.get(0).setImage(tuhi);
                bot_kaardid.get(1).setImage(tuhi);
                bot_kaardid.get(2).setImage(tuhi);
                bot_kaardid.get(3).setImage(tuhi);

                deck1_IV.setImage(kaart);
                deck2_IV.setImage(kaart);

                player1_crd_IV.setImage(tuhi);
                player2_crd_IV.setImage(tuhi);

                player1score.textProperty().bind(new SimpleIntegerProperty(0).asString());
                player2score.textProperty().bind(new SimpleIntegerProperty(0).asString());

            }
        });

        //Üldised muutujad, mida kontrollitakse iga klicki ajal
        stseen.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {

                //100 punkti juures mäng võidetakse
                if (score1 >= 100) {
                    laud.setScene(endgm);
                    endgametext.setText("Player 1 won, congratulations!");
                } else if (score2 >= 100) {
                    laud.setScene(endgm);
                    endgametext.setText("Player 2 won, congratulations!");

                } else {


                    if (storage.size() == 2) {

                        //Player 1 ja 2 mängitud kaarte võrreldakse ja lisatakse võitja graveyardi ning skoori hulka
                        if (storage.get(0).kaardiv() > storage.get(1).kaardiv()) {
                            graveyard1.add(storage.get(0));
                            graveyard1.add(storage.get(1));
                            storage.clear();
                            score1 = score1 + 2;
                            player1score.textProperty().bind(new SimpleIntegerProperty(score1).asString());
                            if (draw.size() > 0) {
                                for (int h = 0; h < draw.size(); h++) {
                                    graveyard1.add(draw.get(h));

                                }
                                int n = draw.size();
                                score1 = score1 + n;
                                player1score.textProperty().bind(new SimpleIntegerProperty(score1).asString());
                                draw.clear();
                            }
                            j++;


                        } else if (storage.get(0).kaardiv() < storage.get(1).kaardiv()) {
                            graveyard2.add(storage.get(0));
                            graveyard2.add(storage.get(1));
                            storage.clear();
                            score2 = score2 + 2;
                            player2score.textProperty().bind(new SimpleIntegerProperty(score2).asString());
                            if (draw.size() > 0) {
                                for (int h = 0; h < draw.size(); h++) {
                                    graveyard2.add(draw.get(h));

                                }
                                int m = draw.size();
                                score2 = score2 + m;
                                player2score.textProperty().bind(new SimpleIntegerProperty(score2).asString());
                                draw.clear();
                            }

                            j++;
                        } else {
                            draw.add(storage.get(0));
                            draw.add(storage.get(1));
                            storage.clear();
                            j++;
                        }
                    }

                    /*Kontroll kas palyeri kaartipakk on tühjaks saanud; kui on, siis võetakse playeri graveyard,
                    * lisatakse see playeri uueks kaardipakiks ja tühjendatakse*/
                    if (uusdeck2._kaardid.isEmpty()) {

                        for (int a = 0; graveyard2.size() > 0; a++) {
                            uusdeck2._kaardid.add(graveyard2.get(0));
                            graveyard2.remove(0);

                        }
                    }

                    if (uusdeck1._kaardid.isEmpty()) {
                        for (int a = 0; graveyard1.size() > 0; a++) {
                            uusdeck1._kaardid.add(graveyard1.get(0));
                            graveyard1.remove(0);

                        }
                    }
                }

            }

        });

        //Player 1 kaardipakk
        deck1_IV.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {


                if (turn == true && j % 4 == 0) {

                    top_kaardid.get(0).setImage(kaart);
                    top_kaardid.get(1).setImage(kaart);
                    top_kaardid.get(2).setImage(kaart);
                    top_kaardid.get(3).setImage(kaart);
                    clickable1 = true;
                    clickable2 = true;
                    clickable3 = true;
                    clickable4 = true;

                }
            }
        });

        //Player 2 kaardipakk
        deck2_IV.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                if (turn == false && j % 4 == 0) {

                    bot_kaardid.get(0).setImage(kaart);
                    bot_kaardid.get(1).setImage(kaart);
                    bot_kaardid.get(2).setImage(kaart);
                    bot_kaardid.get(3).setImage(kaart);
                    clickable11 = true;
                    clickable22 = true;
                    clickable33 = true;
                    clickable44 = true;

                }
            }
        });


        /*top_kaardid(0) - (3) on ülemised mängitavad kaardid (Player 1)*/

        top_kaardid.get(0).setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                if (turn == true && clickable1 == true) {
                    kaart card0 = uusdeck1._kaardid.get(0);

                    if (card0.mastiv() == 1) {
                        player1_crd_IV.setImage(clubs.get(card0.kaardiv()));
                    }
                    if (card0.mastiv() == 2) {
                        player1_crd_IV.setImage(diamonds.get(card0.kaardiv()));
                    }
                    if (card0.mastiv() == 3) {
                        player1_crd_IV.setImage(hearts.get(card0.kaardiv()));
                    }
                    if (card0.mastiv() == 4) {
                        player1_crd_IV.setImage(spades.get(card0.kaardiv()));
                    }
                    top_kaardid.get(0).setImage(tuhi);
                    storage.add(card0);
                    turn = false;
                    player2_crd_IV.setImage(tuhi);
                    uusdeck1._kaardid.remove(0);
                    clickable1 = false;
                }
            }
        });

        top_kaardid.get(1).setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                if (turn == true && clickable2 == true) {

                    kaart card1 = uusdeck1._kaardid.get(0);
                    if (card1.mastiv() == 1) {
                        player1_crd_IV.setImage(clubs.get(card1.kaardiv()));
                    }
                    if (card1.mastiv() == 2) {
                        player1_crd_IV.setImage(diamonds.get(card1.kaardiv()));
                    }
                    if (card1.mastiv() == 3) {
                        player1_crd_IV.setImage(hearts.get(card1.kaardiv()));
                    }
                    if (card1.mastiv() == 4) {
                        player1_crd_IV.setImage(spades.get(card1.kaardiv()));
                    }
                    top_kaardid.get(1).setImage(tuhi);
                    storage.add(card1);
                    turn = false;
                    player2_crd_IV.setImage(tuhi);
                    uusdeck1._kaardid.remove(0);
                    clickable2 = false;
                }
            }
        });

        top_kaardid.get(2).setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                if (turn == true && clickable3 == true) {


                    kaart card2 = uusdeck1._kaardid.get(0);

                    if (card2.mastiv() == 1) {
                        player1_crd_IV.setImage(clubs.get(card2.kaardiv()));
                    }
                    if (card2.mastiv() == 2) {
                        player1_crd_IV.setImage(diamonds.get(card2.kaardiv()));
                    }
                    if (card2.mastiv() == 3) {
                        player1_crd_IV.setImage(hearts.get(card2.kaardiv()));
                    }
                    if (card2.mastiv() == 4) {
                        player1_crd_IV.setImage(spades.get(card2.kaardiv()));
                    }
                    top_kaardid.get(2).setImage(tuhi);
                    storage.add(card2);
                    turn = false;
                    player2_crd_IV.setImage(tuhi);
                    uusdeck1._kaardid.remove(0);
                    clickable3 = false;
                }
            }
        });

        top_kaardid.get(3).setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                if (turn == true && clickable4 == true) {

                    kaart card3 = uusdeck1._kaardid.get(0);

                    if (card3.mastiv() == 1) {
                        player1_crd_IV.setImage(clubs.get(card3.kaardiv()));
                    }
                    if (card3.mastiv() == 2) {
                        player1_crd_IV.setImage(diamonds.get(card3.kaardiv()));
                    }
                    if (card3.mastiv() == 3) {
                        player1_crd_IV.setImage(hearts.get(card3.kaardiv()));
                    }
                    if (card3.mastiv() == 4) {
                        player1_crd_IV.setImage(spades.get(card3.kaardiv()));
                    }
                    top_kaardid.get(3).setImage(tuhi);
                    storage.add(card3);
                    turn = false;
                    player2_crd_IV.setImage(tuhi);
                    uusdeck1._kaardid.remove(0);
                    clickable4 = false;
                }
            }
        });



        /*bot_kaardid(0) - (3) on alumised mängitavad kaardid (Player 2)*/

        bot_kaardid.get(0).setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                if (turn == false && clickable11 == true) {
                    kaart card5 = uusdeck2._kaardid.get(0);
                    if (card5.mastiv() == 1) {
                        player2_crd_IV.setImage(clubs.get(card5.kaardiv()));
                    }
                    if (card5.mastiv() == 2) {
                        player2_crd_IV.setImage(diamonds.get(card5.kaardiv()));
                    }
                    if (card5.mastiv() == 3) {
                        player2_crd_IV.setImage(hearts.get(card5.kaardiv()));
                    }
                    if (card5.mastiv() == 4) {
                        player2_crd_IV.setImage(spades.get(card5.kaardiv()));
                    }
                    bot_kaardid.get(0).setImage(tuhi);
                    storage.add(card5);
                    turn = true;
                    uusdeck2._kaardid.remove(0);
                    clickable11 = false;
                }

            }
        });

        bot_kaardid.get(1).setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                if (turn == false && clickable22 == true) {

                    kaart card6 = uusdeck2._kaardid.get(0);
                    if (card6.mastiv() == 1) {
                        player2_crd_IV.setImage(clubs.get(card6.kaardiv()));
                    }
                    if (card6.mastiv() == 2) {
                        player2_crd_IV.setImage(diamonds.get(card6.kaardiv()));
                    }
                    if (card6.mastiv() == 3) {
                        player2_crd_IV.setImage(hearts.get(card6.kaardiv()));
                    }
                    if (card6.mastiv() == 4) {
                        player2_crd_IV.setImage(spades.get(card6.kaardiv()));
                    }
                    bot_kaardid.get(1).setImage(tuhi);
                    storage.add(card6);
                    turn = true;
                    uusdeck2._kaardid.remove(0);
                    clickable22 = false;
                }

            }
        });

        bot_kaardid.get(2).setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                if (turn == false && clickable33 == true) {

                    kaart card7 = uusdeck2._kaardid.get(0);
                    if (card7.mastiv() == 1) {
                        player2_crd_IV.setImage(clubs.get(card7.kaardiv()));
                    }
                    if (card7.mastiv() == 2) {
                        player2_crd_IV.setImage(diamonds.get(card7.kaardiv()));
                    }
                    if (card7.mastiv() == 3) {
                        player2_crd_IV.setImage(hearts.get(card7.kaardiv()));
                    }
                    if (card7.mastiv() == 4) {
                        player2_crd_IV.setImage(spades.get(card7.kaardiv()));
                    }
                    bot_kaardid.get(2).setImage(tuhi);
                    storage.add(card7);
                    turn = true;
                    uusdeck2._kaardid.remove(0);
                    clickable33 = false;
                }

            }
        });

        bot_kaardid.get(3).setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                if (turn == false && clickable44 == true) {

                    kaart card8 = uusdeck2._kaardid.get(0);
                    if (card8.mastiv() == 1) {
                        player2_crd_IV.setImage(clubs.get(card8.kaardiv()));
                    }
                    if (card8.mastiv() == 2) {
                        player2_crd_IV.setImage(diamonds.get(card8.kaardiv()));
                    }
                    if (card8.mastiv() == 3) {
                        player2_crd_IV.setImage(hearts.get(card8.kaardiv()));
                    }
                    if (card8.mastiv() == 4) {
                        player2_crd_IV.setImage(spades.get(card8.kaardiv()));
                    }
                    bot_kaardid.get(3).setImage(tuhi);
                    storage.add(card8);
                    turn = true;
                    uusdeck2._kaardid.remove(0);
                    clickable44 = false;
                }

            }
        });


    }
}
