module com.centennial.comp228.lab4 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;


    exports com.centennial.comp228.lab4;
    opens com.centennial.comp228.lab4 to javafx.fxml;
}