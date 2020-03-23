import javafx.scene.layout.GridPane;
import javafx.scene.control.*;
import javafx.geometry.Insets;
import javafx.scene.text.Font;

/**
 * View für das Handgerät des Kellners
 *
 * @author Sven Frimont
 * @version 19.03.2020
 */
public class HandgeraetView extends GridPane
{
    private ComboBox cbTischNr = new ComboBox();
    private Button bAbsenden = new Button("Bestellung absenden");
    private Button bGetraenkOk = new Button("ok");
    private Button bEssenOk = new Button("ok");
    private TextField iGetraenkNr = new TextField();
    private TextField iEssenNr = new TextField();
    
    private TextArea ausgabe = new TextArea();
    
    public HandgeraetView()
    {
        Label title = new Label("Bedienung am Tisch");
        title.setFont(new Font("Arial", 20));
        title.setMinWidth(190);
        this.add(title,0,0,3,1);
        
        cbTischNr.getItems().addAll(
          "1",
          "2",
          "3",
          "4"
        );
        
        cbTischNr.getSelectionModel().selectFirst();
        
        this.add(new Label("Tisch-Nr."),0,1);
        this.add(cbTischNr,1,1);
        this.add(new Label("Getraenk"),0,2);
        this.add(iGetraenkNr,1,2);
        this.add(bGetraenkOk,2,2);
        this.add(new Label("Essen"),0,3);
        this.add(iEssenNr,1,3);
        this.add(bEssenOk,2,3);
        this.add(ausgabe,0,4,3,1);
        this.add(bAbsenden,0,5,3,1);
        
        this.setPadding(new Insets(10,10,10,10));
        this.setVgap(10);
        this.setHgap(10);
        
        ausgabe.setEditable(false);
        ausgabe.setPrefColumnCount(8);
        ausgabe.setPrefRowCount(5);
        
        iGetraenkNr.setPrefColumnCount(5);
        iEssenNr.setPrefColumnCount(5);
    }
}
