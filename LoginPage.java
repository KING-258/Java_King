import javafx.scene.control.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
public class LoginPage extends Application {
    Stage window;
    GridPane g1;
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Login");
        Label l0 = new Label("Welcome");
        Label l1 = new Label("User : ");
        Label l2 = new Label("Password : ");
        Label l3 = new Label();
        TextField t1 = new TextField();
        PasswordField p1 = new PasswordField();
        Button b1 = new Button("Sign-In");
        b1.setOnAction(e -> {
            l3.setText(l0.getText() + " " + t1.getText());
        });
        g1 = new GridPane();
        g1.setPadding(new Insets(10, 10, 10, 10));
        g1.setHgap(10);
        g1.setVgap(10);
        GridPane.setConstraints(l0, 0, 0);
        GridPane.setConstraints(l1, 0, 1);
        GridPane.setConstraints(t1, 1, 1);
        GridPane.setConstraints(l2, 0, 2);
        GridPane.setConstraints(p1, 1, 2);
        GridPane.setConstraints(l3, 1, 3);
        GridPane.setConstraints(b1, 2, 3);
        g1.getChildren().addAll(l0, l1, t1, l2, p1, l3, b1);
        g1.setAlignment(Pos.CENTER);
        Scene s1 = new Scene(g1, 500, 500);
        window.setScene(s1);
        window.show();
    }
}