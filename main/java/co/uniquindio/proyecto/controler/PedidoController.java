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

public class PedidoController {

    public PasteleriaController controllerPasteleria;
    public Stage stage;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bntActualizarPedido;

    @FXML
    private Button bntAgragarPastel;

    @FXML
    private Button bntAgregarGalleta;

    @FXML
    private Button bntAgregarPanDulce;

    @FXML
    private Button bntAgregarPedido;

    @FXML
    private Button bntAgregarPostre;

    @FXML
    private Button bntEliminarPedido;

    @FXML
    private Button bntFinalizar;

    @FXML
    private TextField txId;

    @FXML
    private TextField txIdCliente;

    @FXML
    private TextField txIdTransaccion;

    @FXML
    private TextField txNombreCliente;

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
    public void regresarALaPasteleria() {
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
        assert bntFinalizar != null : "fx:id=\"bntRegresar\" was not injected: check your FXML file 'viewPedido.fxml'.";
    }

    public void show() {
        stage.show();
    }

}
