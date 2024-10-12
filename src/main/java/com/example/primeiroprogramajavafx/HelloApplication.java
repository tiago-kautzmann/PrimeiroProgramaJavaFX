package com.example.primeiroprogramajavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Label lblNome = new Label("Informe seu nome");

        TextField textNome = new TextField();
        textNome.setPrefSize(100, 30);

        Label lblMensagem = new Label();

        Button btnOK = new Button();
        btnOK.setText("OK");

        btnOK.setOnAction(e -> lblMensagem.setText("Olá " + textNome.getText()));
        btnOK.setOnMouseEntered(e -> System.out.println("Entrou com o mouse!"));

        VBox layout = new VBox();
        layout.setSpacing(10);
        layout.getChildren().addAll(lblNome, textNome, btnOK, lblMensagem);

        Scene scene = new Scene(layout, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        scene.setOnMouseEntered(e -> System.out.println("Entrou em cena"));
        scene.setOnMouseExited(e -> System.out.println("Saiu de cena"));
    }

    public static void main(String[] args) {
        launch();
    }
}