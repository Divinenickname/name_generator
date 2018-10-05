/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package name_generator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.MouseEvent;
import name_generator.interfaces.impl.NameGen;

/**
 *
 * @author Alexander
 */
public class FXMLDocumentController implements Initializable {
    
    NameGen ng = new NameGen();
    
    @FXML
    private TextField tb_name;
    
    @FXML
    private TextField tb_lastName;
    
    @FXML
    private Button b_button;
    
    @FXML
    private Button b_connectdb;
    
    @FXML
    private Label l_nameCount;
    
    @FXML
    private Label l_lastNameCount;
    
    @FXML
    private void b_generate(ActionEvent event2) {
        tb_name.setText(ng.genName());
        tb_lastName.setText(ng.genLastName());
        
    }
    
    @FXML
    private void b_connect(ActionEvent event){
        //db.Connection();
    }
    
    @FXML
    private void buffer(MouseEvent event){
        TextField tf = (TextField) event.getSource();
        String str = tf.getText();
        ClipboardContent content = new ClipboardContent();
        Clipboard clipboard = Clipboard.getSystemClipboard();
        content.putString(str);
        clipboard.setContent(content);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ng.setNames();
        ng.setLastNames();
        l_nameCount.setText(Integer.toString(ng.getNameCount()));
        l_lastNameCount.setText(Integer.toString(ng.getLastNameCount()));
    }      
    
}
