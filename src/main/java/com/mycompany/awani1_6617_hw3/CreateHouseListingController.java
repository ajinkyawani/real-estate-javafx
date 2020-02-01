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
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ajinkyawani
 */
public class CreateHouseListingController implements Initializable {

    @FXML
    private TextField addressField;
    @FXML
    private TextField cityField;
    @FXML
    private TextField stateField;
    @FXML
    private TextField postalCodeField;
    @FXML
    private TextField bedroomNumField;
    @FXML
    private TextField bathroomNumField;
    @FXML
    private TextField purchasePrizeField;
    @FXML
    private TextField annualTaxesField;
    @FXML
    private Button createButton;
    @FXML
    private Button backButton;
    
   // private String test;
    
    private static ArrayList<House> houseList = new ArrayList<House>();
    
    @FXML
    private TextField descriptionField;

   // private House house;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void createListing() {
        House house = new House(this.addressField.getText(), this.cityField.getText(), this.stateField.getText(), 
                Integer.parseInt(this.postalCodeField.getText()), Integer.parseInt(this.bedroomNumField.getText()), Integer.parseInt(this.bathroomNumField.getText()),
        Double.parseDouble(this.purchasePrizeField.getText()), Double.parseDouble(this.annualTaxesField.getText()), this.descriptionField.getText() );
        
        houseList.add(house);
        
        PropertyListing propListing = new PropertyListing();
        propListing.addPropertyListing(house);
        
        this.setAllFieldsBlank();
        
    }
    
    public ArrayList<House> getHouseListing() {
        return houseList;
    }
         
    
    
    private void setAllFieldsBlank() {
        this.addressField.setText("");
        this.cityField.setText("");
        this.stateField.setText("");
        this.postalCodeField.setText("");
        this.bedroomNumField.setText("");
        this.bathroomNumField.setText("");
        this.purchasePrizeField.setText("");
        this.annualTaxesField.setText("");
        this.descriptionField.setText("");
    }
    
    @FXML
    private void switchToMainMenu() throws IOException {
        App.setRoot("mainMenu");
    }
}
