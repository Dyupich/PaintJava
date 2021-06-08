package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;

public class Controller
{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ColorPicker colorPicker;

    @FXML
    private TextField brushSize;

    @FXML
    private Button clearButton;

    @FXML
    private Button triangleButton;

    @FXML
    private Button rectangleButton;

    @FXML
    private Button circleButton;

    @FXML
    private Canvas canvas;

    @FXML
    void isClearButtonTyped(ActionEvent event)
    {
        brushTool.clearRect(0,0,canvas.getWidth(),canvas.getHeight());
    }

    @FXML
    void makeCircle(ActionEvent event)
    {
        brushTool.clearRect(0,0,canvas.getWidth(),canvas.getHeight());
        double size = Double.parseDouble(brushSize.getText());
        brushTool.setFill(colorPicker.getValue());
        brushTool.fillRoundRect(canvas.getWidth()/2, canvas.getHeight()/2, size, size, size, size);
    }

    @FXML
    void makeRectangle(ActionEvent event)
    {
        brushTool.clearRect(0,0,canvas.getWidth(),canvas.getHeight());

        brushTool.setFill(colorPicker.getValue());
        brushTool.fillRect(canvas.getWidth()/2 - 200, canvas.getHeight()/2 - 200, 200,200);
    }

    @FXML
    void nakeTriangle(ActionEvent event) {


        brushTool.clearRect(0,0,canvas.getWidth(),canvas.getHeight());
        brushTool.strokeLine(200,400,600,400);
        brushTool.strokeLine(200,400,400,200);
        brushTool.strokeLine(400,200,600,400);

    }


        GraphicsContext brushTool;


        @FXML
        void initialize()
        {
            brushTool = canvas.getGraphicsContext2D();
            canvas.setOnMouseDragged(mouseEvent ->
            {
                double size = Double.parseDouble(brushSize.getText());
                double x = mouseEvent.getX() - size / 2;
                double y = mouseEvent.getY() - size / 2;


                if (!brushSize.getText().isEmpty()) {
                    brushTool.setFill(colorPicker.getValue());
                    brushTool.fillRoundRect(x, y, size, size, size, size);
                }
            });

        }

}
