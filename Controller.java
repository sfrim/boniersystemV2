import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Der Controller für das Boniersystem
 *
 * @author Sven Frimont
 * @version 20.03.2020
 */
public class Controller extends Application
{   
    HandgeraetView handgeraetView = new HandgeraetView();
    BoniersystemView boniersystemView = new BoniersystemView(handgeraetView);
    
    public void start(Stage stage)
    {
        stage.setTitle("Kassensystem");
        boniersystemView.show(stage);
    }
    
    
}
