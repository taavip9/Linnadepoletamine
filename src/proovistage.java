/**
 * Created by Taavi on 20.10.2016.
 */
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


import java.awt.*;

public class proovistage extends Application {

        @Override
        public void start(Stage laud){

            board proov = new board();

            Image kaart = new Image("kaardid/tagus.png");
            Image tuhi = new Image("kaardid/emptyspace.png");


            ImageView iv1 = new ImageView();
            ImageView iv2 = new ImageView();

            ImageView iv3 = new ImageView(tuhi);
            ImageView iv4 = new ImageView(tuhi);
            ImageView iv5 = new ImageView(tuhi);
            ImageView iv6 = new ImageView(tuhi);
            ImageView iv7 = new ImageView(tuhi);

            ImageView iv8 = new ImageView(tuhi);
            ImageView iv9 = new ImageView(tuhi);
            ImageView iv10 = new ImageView(tuhi);
            ImageView iv11 = new ImageView(tuhi);
            ImageView iv12 = new ImageView(tuhi);


            iv1.setImage(kaart);
            iv2.setImage(kaart);



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
            iv7.setTranslateX(160);
            iv7.setTranslateY(450);

            /*Ülemised tühjad kohad*/
            iv8.setTranslateX(0);
            iv8.setTranslateY(40);
            iv9.setTranslateX(0);
            iv9.setTranslateY(40);
            iv10.setTranslateX(0);
            iv10.setTranslateY(40);
            iv11.setTranslateX(0);
            iv11.setTranslateY(40);
            iv12.setTranslateX(0);
            iv12.setTranslateY(40);


            Group root = new Group();
            HBox box = new HBox();

            box.getChildren().add(iv1);
            box.getChildren().add(iv2);
            box.getChildren().add(iv3);
            box.getChildren().add(iv4);
            box.getChildren().add(iv5);
            box.getChildren().add(iv6);
            box.getChildren().add(iv7);
            box.getChildren().add(iv8);
            box.getChildren().add(iv9);
            box.getChildren().add(iv10);
            box.getChildren().add(iv11);
            box.getChildren().add(iv12);
            root.getChildren().add(box);

            Scene stseen = new Scene(root, Color.DARKGREEN);
            laud.setTitle("Burn, baby burn");
            laud.setWidth(1200);
            laud.setHeight(700);
            laud.setScene(stseen);
            laud.show();
        }
}
