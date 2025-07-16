module cn.contins.letstalk {
    requires javafx.controls;
    requires javafx.fxml;

    opens cn.contins.letstalk to javafx.fxml;

    exports cn.contins.letstalk;
}