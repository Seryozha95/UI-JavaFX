/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uijavafx;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import uijavafx.interfaces.AddressBook;
import uijavafx.interfaces.impl.CollectionAddressBook;
import uijavafx.objects.Person;

/**
 *
 * @author seryozha
 */
public class homeController implements Initializable {
    
    @FXML
    private Label labelCount;
    
    @FXML
    private Button btnAdd;
    
    @FXML
    private Button btnUpdate;
     
    @FXML
    private Button btnDelete;
    
    @FXML
    private Button btnSearch;
    
    @FXML
    private TextField searchText;
    
    @FXML
    private TableView tableAddressBook;
    
    @FXML
    private TableColumn<Person, String> columnSurname;
    
    @FXML
    private TableColumn<Person, String> columnPhoneNumber;
    
    private CollectionAddressBook addressBook = new CollectionAddressBook();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.columnSurname.setCellValueFactory(new PropertyValueFactory<Person, String>("surName"));
        this.columnPhoneNumber.setCellValueFactory(new PropertyValueFactory<Person, String>("phoneNumber"));
        this.addressBook.fillData();
        this.tableAddressBook.setItems(this.addressBook.getPersonList());
        this.updateCount();
    }    
    
    public void showDialog(ActionEvent actionEvent){
        System.out.println("You clicked me!");
        try{
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("fxml/edit.fxml"));
            stage.setTitle("Udpate records");
            stage.setMinHeight(150);
            stage.setMaxWidth(500);
            stage.setResizable(false);
            stage.setScene(new Scene(root));
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node)actionEvent.getSource()).getScene().getWindow());
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private void updateCount(){
        this.labelCount.setText(this.labelCount.getText() + " " +this.addressBook.getPersonList().size());
    }
}
