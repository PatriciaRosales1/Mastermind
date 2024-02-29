package di.mastermind;

import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class ControladorMastermind {

    @FXML
    private Circle circulo1;

    @FXML
    private Circle circulo2;

    @FXML
    private Circle circulo3;

    @FXML
    private Circle circulo4;

    @FXML
    private ColorPicker colores;

    @FXML
    private HBox fila1;

    @FXML
    private HBox fila2;

    @FXML
    private HBox fila3;

    @FXML
    private HBox fila4;

    @FXML
    void opciones() {
        colores = new ColorPicker();
    }

    @FXML
    void pintar() {
        Color color = colores.getValue();
        circulo1.setFill(color);
    }

    @FXML
    void pintar2() {
        Color color = colores.getValue();
        circulo2.setFill(color);
    }

    @FXML
    void pintar3() {
        Color color = colores.getValue();
        circulo3.setFill(color);
    }

    @FXML
    void pintar4() {
        Color color = colores.getValue();
        circulo4.setFill(color);
    }

}
