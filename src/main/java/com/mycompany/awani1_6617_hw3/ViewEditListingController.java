/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.awani1_6617_hw3;

import Interfaces.IProperty;
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
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author ajinkyawani
 */
public class ViewEditListingController implements Initializable {

    @FXML
    private Button backButton;
    @FXML
    private Button previewAptListingButton;
    @FXML
    private Button previewCondoListingButton;
    @FXML
    private Button previewHouseListingButton;
    @FXML
    private Button previewAllPropertyButton;
  
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    
    @FXML
    private void returnToBackWindow() throws IOException {
        App.setRoot("mainMenu");
    }
    
    @FXML
    private void switchToPreviewHouseListingWindow() throws IOException {
        App.setRoot("previewHouseListing");
    }
    
    @FXML
    private void switchToPreviewCondoListingWindow() throws IOException {
        App.setRoot("previewCondoListing");
    }
    
    @FXML
    private void switchToPreviewAptListingWindow() throws IOException {
        App.setRoot("previewAptListing");
    }
    
    @FXML
    private void switchToPreviewAllPropertyListingWindow() throws IOException {
        App.setRoot("previewAllPropertyListing");
    }
}
