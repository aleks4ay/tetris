package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private static final int START_X = 50;
    private static final int START_Y = 50;
    private static final int H_CELL = 25;


    @FXML
    private Pane p1;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        int x = 8;
        int y = 0;
        Paint paint_rect = Color.color(0.156,0.43,0.23);
        Rectangle r_001 = new Rectangle(23, 23, paint_rect);
        Rectangle r_002 = new Rectangle(23, 23, paint_rect);
        Rectangle r_003 = new Rectangle(23, 23, paint_rect);
        Rectangle r_004 = new Rectangle(23, 23, paint_rect);
        r_001.setX(START_X + 1 + H_CELL * x);
        r_001.setY(START_Y + 1 + H_CELL * y);
        r_002.setX(START_X + 1 + H_CELL * (x + 1));
        r_002.setY(START_Y + 1 + H_CELL * y);
        r_003.setX(START_X + 1 + H_CELL * (x + 2));
        r_003.setY(START_Y + 1 + H_CELL * y);
        r_004.setX(START_X + 1 + H_CELL * (x + 2));
        r_004.setY(START_Y + 1 + H_CELL * (y + 1));

//        Rectangle rectangle = new Rectangle(START_X + 1 + H_CELL * x, START_Y + 1 + H_CELL * y, 23, 23);
//        rectangle.setFill(Color.color(0.156,0.43,0.23));
        p1.getChildren().addAll(r_001, r_002, r_003, r_004);
    }

}
