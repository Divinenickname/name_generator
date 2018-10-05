/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package name_generator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author Alexander
 */
public class Name_generator extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        
        //добавляем иконку
         //Image icon = new Image("D:\\Users\\Alexander\\Documents\\NetBeansProjects\\JavaFXApplication3\\resources\\images\\icon.png");
         

         primaryStage.setTitle("Name generator");
                
        primaryStage.getIcons().add(new Image("file:./resources/images/icon.png"));
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
