package fr.sd.imc;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label poids;

    @FXML
    protected void onHelloButtonClick() {

        poids.setText("Votre IMC est de : ");
    }
}