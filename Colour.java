import javafx.scene.control.*;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
public class Colour extends Application {
    Stage window;
    FlowPane f1;
    public static void main(String args[]) {
        launch(args);
    }
    public void start(Stage primaryStage) {
        window = primaryStage;
        Label l1 = new Label("Welcome to JavaFX programming");
        Button b1 = new Button();
        b1.setText("Change Colour");
        b1.setOnAction(e -> {
            l1.setTextFill(Color.MAGENTA);
        });
        f1 = new FlowPane(10, 10);
        f1.getChildren().addAll(l1, b1);
        f1.setAlignment(Pos.CENTER);
        Scene s1 = new Scene(f1, 500, 200);
        window.setScene(s1);
        window.setTitle("JavaFX App");
        window.show();
    }
}