package dad.holafx.enhanced;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class HolaFXApp extends Application {

    private TextField nombreText;

    private Button saludarButton;
    private Label saludoLabel;

    @Override
    public void  start(Stage stage) throws  Exception {

        //Componentes de la ventana
        nombreText = new TextField(); //Nombre del Texto
        nombreText.setPromptText("Nombre de la persona a saludar");

        saludarButton = new Button();
        saludarButton.setText("Saludar");
        saludarButton.setDefaultButton(true);
        saludarButton.setOnAction(this::onSaludarAction);

        saludoLabel = new Label();

        VBox root = new VBox();
        root.setPadding(new Insets(5));
        root.setSpacing(5);
        root.setFillWidth(false);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(nombreText, saludarButton, saludoLabel);

        Scene scene = new Scene(root, 640, 480);

        stage.setTitle("HolaFX Mejorado");
        stage.setScene(scene);
        stage.show();



    }

    private void onSaludarAction(ActionEvent e) {
        String nombre = nombreText.getText();
        String saludo = "¡Hola " + nombre + " !";
        saludoLabel.setText(saludo);
    }
}
