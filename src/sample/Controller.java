package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField loginField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private Label authorisation;

    @FXML
    private Button signUpButton;

    @FXML
    private Label corpName;

    @FXML
    void initialize()
    {
        signUpButton.setOnAction(actionEvent ->
        {
            System.out.println("Нажатие на клавишу регистрации!!!");
        });

        loginButton.setOnAction(actionEvent ->
        {
            System.out.println("Нажатие на клавишу входа!!!");
        });
    }
}





