package di.mastermind;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Aplicación extends Application {
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


    /*public static void main(String[] args) {
        Juego juego=new Juego(4,6,6);  //creamos el juego con sus parámetros nivel, colore, limite intentos
        System.out.println(juego);
        Scanner sc=new Scanner(System.in);
        //mientras el juego no termina hacemos intentos
        while(juego.isIniciado()){
            System.out.println("Intento " + juego.intentoActual());
            String linea=sc.nextLine(); //Pedimos la secuencia a probar (n,n,n,n,...)
            juego.hacerIntento(linea);
        }
    }*/
}
