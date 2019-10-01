import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FxPractice2 extends Application {
    public void start(Stage stage){
      Text greeting = new Text(75.0, 750.0, "Howdy gamers! How's the gaming going today?");
      Ellipse shape = new Ellipse(120.0, 200.0, 50.0, 70.0);
      Ellipse shapes = new Ellipse(680.0, 200.0, 50.0, 70.0);
      Rectangle box = new Rectangle(300.0, 300.0, 200.0, 400.0);
      Line line = new Line(10.0, 600.0, 990.0, 0.0);

      box.setStroke(Color.BLUE);
      box.setFill(Color.YELLOW);

      line.setStroke(Color.PURPLE);
      line.setFill(Color.PURPLE);

      Group root = new Group(greeting, shape, shapes, box, line);
      Scene scene = new Scene(root, 1000, 1000, Color.LIGHTPINK);

      stage.setTitle("FxPractice2");
      stage.setScene(scene);
      stage.show();
    }

    public static void main(String[] args){
      launch(args);
    }

}
