module com.elltechs.fxanimationstudio {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.elltechs.fxanimationstudio to javafx.fxml;
    exports com.elltechs.fxanimationstudio;
}
