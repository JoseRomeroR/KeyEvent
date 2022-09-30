package keyevent;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class KeyEvent extends Application {
    Scene scene;
    Pane pane = new Pane();
    Text text;
    
    @Override
    public void start(Stage stage) {
        //Text settings
        text= new Text(20,20,"A");
        text.setFocusTraversable(true);
        //Pane settings
        pane.getChildren().add(text);

        //Text keyEvent
       text.setOnKeyPressed((e) -> {    
            switch (e.getCode()) {
                case UP:
                   text.setY(text.getY() - 10);
                   break;
                   
                case DOWN:
                text.setY(text.getY() + 10);
                break;
                
                 case LEFT:
                text.setX(text.getX() - 10);
                break;
                
                 case RIGHT:
                text.setX(text.getX() + 10);
                break;
                
                default:
                    if (Character.isLetterOrDigit(e.getText().charAt(0))) {
                         text.setText(e.getText());              
                    }  
                break;
           }
           
        });
        
        scene = new Scene(pane, 300, 250);
        
        stage.setTitle("KeyEvent");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
