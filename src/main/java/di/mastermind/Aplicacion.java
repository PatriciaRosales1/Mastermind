package di.mastermind;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Aplicacion extends Application {
    private ControladorMastermind controlador = new ControladorMastermind();
    private Juego juego;

    @Override
    public void start(Stage stage) throws IOException {
        //Crea una variable llamada vista que lee el fichero fxml
        FXMLLoader vista = new FXMLLoader(Juego.class.getResource("mastermind.fxml"));
        //Carga la anterior vista
        Scene scene = new Scene(vista.load(), 500, 500);
        //
        stage.setTitle("Mastermind");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }


}
