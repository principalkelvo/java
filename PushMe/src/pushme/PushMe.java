/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pushme;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
/**
 *
 * @author KELVO FRAYAY
 */
public class PushMe extends Application {
    @Override
    public void start(Stage stage){
        //create and configure a text field for user entry
        TextField pushMeTextField = new TextField();
        pushMeTextField.setMaxWidth(250);
        
        //create and configure a label to display the output
        Label pushMeLabel = new Label();
        pushMeLabel.setTextFill(Color.RED);
        pushMeLabel.setFont(Font.font("Arial",20));
        
        //create and configure a label which will cause text to be display
        Button pushMeButton= new Button();
        pushMeButton.setText("Type in the Box then push me");
        pushMeButton.setOnAction(e->pushMeLabel.setText("You entered: "+pushMeTextField.getText()));
        //create and configure a VBox to hold our components
        VBox root= new VBox();
        root.setSpacing(10);
        root.setAlignment(Pos.CENTER);
        
        //add the components to the VBox
        root.getChildren().addAll(pushMeTextField,pushMeButton,pushMeLabel);
        
        //create a new Scene
        Scene scene=new Scene(root,350,150);
        //add the scene to the stage,their configure the stage and make it visible
        stage.setScene(scene);
        stage.setTitle("Push Me");
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
