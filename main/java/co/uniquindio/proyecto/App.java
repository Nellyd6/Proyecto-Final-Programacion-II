package co.uniquindio.proyecto;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import co.uniquindio.proyecto.controler.PasteleriaController;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/uniquindio/proyecto/viewPasteleria.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            PasteleriaController controller = loader.getController();
            controller.setStage(primaryStage);
            primaryStage.show();
        } catch (Exception e) {

            System.out.println("error: " + e);
        }

    }

    public static void main(String[] args) {
        launch(args);
    }

}