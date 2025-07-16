module top.contins.letstalk {
    requires javafx.controls;
    requires javafx.fxml;

    opens top.contins.letstalk to javafx.fxml;

    exports top.contins.letstalk;
}