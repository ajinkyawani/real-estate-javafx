/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.awani1_6617_hw3;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author ajinkyawani
 */
public class PreviewAllPropertyListingController implements Initializable {

    @FXML
    private TableView<Property> allPropertyTableView;
    @FXML
    private TableColumn<Property, String> addressColumn;
    @FXML
    private Button mainMenuButton;
    @FXML
    private Button backButton;
    @FXML
    private TableColumn<Property, String> listingTypeColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        addressColumn.setCellValueFactory(new PropertyValueFactory<Property, String>("address"));
        listingTypeColumn.setCellValueFactory(new PropertyValueFactory<Property, String>("propertyType"));
        
        PropertyListing propertyListing = new PropertyListing(); 
        
        ArrayList<Property> propertyList = new ArrayList<Property>();
        propertyList = propertyListing.getPropertyListing();
        
        ObservableList<Property> OpropertyList = FXCollections.observableArrayList(propertyList);
        
        allPropertyTableView.setItems(OpropertyList);
    }    
    
    @FXML
    private void returnToBackWindow() throws IOException {
        App.setRoot("viewEditListing");
    }
    
    @FXML
    private void returnToMainMenuWindow() throws IOException {
        App.setRoot("mainMenu");
    }
}
