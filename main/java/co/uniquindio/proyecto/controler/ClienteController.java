package co.uniquindio.proyecto.controler;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ClienteController {

    public PasteleriaController controllerPasteleria;
    public Stage stage;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bntActualizar;

    @FXML
    private Button bntEliminar;

    @FXML
    private Button bntGuardar;

    @FXML
    private Button bntRegresar;

    @FXML
    private TextField txtCorreo;

    @FXML
    private TextField txtDireccion;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtTelefono;

    @FXML
    void showviewPasteleria(ActionEvent event) {
        controllerPasteleria.show();
        stage.close();
    }

    public void setStage(Stage primaryStage) {
        this.stage = primaryStage;
    }

    public void init(Stage stage, PasteleriaController pasteleriaController) {

        this.controllerPasteleria = pasteleriaController;
        this.stage = stage;
    }

    @FXML
    public void volverMenuPasteleria() {
        try {
            try {
                FXMLLoader loader = new FXMLLoader(
                        getClass().getResource("/co/uniquindio/proyecto/viewPasteleria.fxml"));
                Parent root = loader.load();
                Scene scene = new Scene(root);
                PasteleriaController pasteleriaController = loader.getController();
                pasteleriaController.setStage(stage);
                stage.setScene(scene);
                stage.show();
            } catch (Exception e) {
                System.out.println("hubo un error :D");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @FXML
    void initialize() {
        assert bntRegresar != null : "fx:id=\"bntRegresar\" was not injected: check your FXML file 'viewCliente.fxml'.";
    }

    public void show() {
        stage.show();
    }
}