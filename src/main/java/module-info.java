module di.mastermind {
    requires javafx.controls;
    requires javafx.fxml;


    opens di.mastermind to javafx.fxml;
    exports di.mastermind;
}