module fr.sd.imc {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.sd.imc to javafx.fxml;
    exports fr.sd.imc;
}