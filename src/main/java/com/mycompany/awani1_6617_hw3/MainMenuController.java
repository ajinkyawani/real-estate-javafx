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
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author ajinkyawani
 */
public class MainMenuController implements Initializable {

    @FXML
    private Button createHouseButton;
    @FXML
    private Button createCondoButton;
    @FXML
    private Button createApartmentButton;

    private CreateHouseListingController createHouseListing = new CreateHouseListingController();
    private ViewEditListingController viewEditListing = new ViewEditListingController();
    @FXML
    private Button viewEditListingsButton;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void switchToCreateHouseListing() throws IOException {
        App.setRoot("createHouseListing");
    }
    
    @FXML
    private void switchToCreateCondoListing() throws IOException {
        App.setRoot("createCondoListing");
    }
    
    @FXML
    private void switchToCreateAptListing() throws IOException {
        App.setRoot("createAptListing");
    }
    
    @FXML
    private void switchToViewEditListing() throws IOException {
        App.setRoot("viewEditListing");
        
    }
    
}
