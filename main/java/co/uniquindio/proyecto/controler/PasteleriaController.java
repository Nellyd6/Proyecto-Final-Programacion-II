package co.uniquindio.proyecto.controler;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class PasteleriaController {

    private Stage stage;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bntClientesPasteleria;

    @FXML
    private Button bntEmpleadosPasteleria;

    @FXML
    private Button bntPedidosPasteleria;

    @FXML
    private Button bntTransaccionesPasteleria;

    @FXML
    private ImageView imageview;

    @FXML
    void showviewCliente(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/viewCliente.fxml"));
        Parent root = loader.load();
        ClienteController controller = loader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        controller.init(stage, this);
        stage.show();
        this.stage.close();
    }

    @FXML
    void showviewEmpleado(ActionEvent event) throws IOException {

    }

    @FXML
    void showviewPedido(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/viewPedido.fxml"));
        Parent root = loader.load();
        PedidoController controller = loader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        controller.init(stage, this);
        stage.show();
        this.stage.close();
    }

    @FXML
    void showviewTransaccion(ActionEvent event) throws IOException {

    }

    @FXML
    void initialize() {
        assert bntClientesPasteleria != null
                : "fx:id=\"bntClientesPasteleria\" was not injected: check your FXML file 'viewPasteleria.fxml'.";
        assert bntEmpleadosPasteleria != null
                : "fx:id=\"bntEmpleadosPasteleria\" was not injected: check your FXML file 'viewPasteleria.fxml'.";
        assert bntPedidosPasteleria != null
                : "fx:id=\"bntPedidosPasteleria\" was not injected: check your FXML file 'viewPasteleria.fxml'.";
        assert bntTransaccionesPasteleria != null
                : "fx:id=\"bntTransaccionesPasteleria\" was not injected: check your FXML file 'viewPasteleria.fxml'.";
        assert imageview != null : "fx:id=\"imageview\" was not injected: check your FXML file 'viewPasteleria.fxml'.";

    }

    @FXML
    private void redirigir() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/uniquindio/proyecto/Cliente.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            ClienteController clienteController = loader.getController();
            clienteController.setStage(stage);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            System.out.println("hubo un error :D");
        }
    }

    @FXML
    private void redirigirPedido() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/uniquindio/proyecto/Pedido.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            PedidoController pedidoController = loader.getController();
            pedidoController.setStage(stage);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            System.out.println("hubo un error :D");
        }
    }

    // metodos para mostrar la ventana inicial

    public void setStage(Stage primaryStage) {
        this.stage = primaryStage;
    }

    public void show() {
        stage.show();
    }

}
