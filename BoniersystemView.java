import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;

/**
 * View des gesamten Boniersystems. Dieser View enthaelt die vier anderen Views
 *
 * @author Sven Frimont
 * @version 19.03.2020
 */
public class BoniersystemView
{
    GridPane pane = new GridPane();
    
    public BoniersystemView(HandgeraetView handgeraetView)
    {
        pane.add(handgeraetView,0,0);
        pane.add(new Label("Kasse"),1,0);
        pane.add(new Label("Küche"),0,1);
        pane.add(new Label("Bar"),1,1);
        pane.setGridLinesVisible(true);
    }
    
    public void show(Stage stage)
    {
        Scene scene = new Scene(pane,557,440);
        stage.setScene(scene);
        stage.show();
    }
}
