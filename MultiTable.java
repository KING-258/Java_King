import javafx.scene.control.*;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
public class MultiTable extends Application {
    Stage window;
    FlowPane f1;
    public static void main(String args[]) {
        launch(args);
    }
    public void start(Stage primaryStage) {
        window = primaryStage;
        Label l0 = new Label();
        l0.setAlignment(Pos.CENTER);
        TextField t1 = new TextField();
        Label l1 = new Label("Number : ");
        Button b1 = new Button("Enter");
        b1.setOnAction(e -> {
            int n = Integer.valueOf(t1.getText());
            String s = "Table : ";
            for (int i = 1; i <= 10; i++) {
                s += Integer.toString(n * i) + " ";
            }
            l0.setText(s);
        });
        f1 = new FlowPane(10, 30);
        f1.getChildren().addAll(l1, t1, b1, l0);
        Scene s1 = new Scene(f1, 500, 500);
        window.setScene(s1);
        window.setTitle("Multiplication");
        window.show();
    }
}