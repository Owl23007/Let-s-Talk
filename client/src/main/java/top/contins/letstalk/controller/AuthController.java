package top.contins.letstalk.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class AuthController {
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    private double xOffset = 0;
    private double yOffset = 0;

    @FXML
    private void loginAction() {
        System.out.println("登录按钮点击，用户名：" + usernameField.getText());
    }

    @FXML
    private void registerAction() {
        System.out.println("注册按钮点击，用户名：" + usernameField.getText());
    }

    public void closeAction(ActionEvent event) {
        // 获取当前窗口并关闭
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    private void onMousePressed(MouseEvent event) {
        // 记录鼠标按下时的初始位置
        xOffset = event.getSceneX();
        yOffset = event.getSceneY();
    }

    @FXML
    private void onMouseDragged(MouseEvent event) {
        // 计算并设置窗口新位置
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setX(event.getScreenX() - xOffset);
        stage.setY(event.getScreenY() - yOffset);
    }
}