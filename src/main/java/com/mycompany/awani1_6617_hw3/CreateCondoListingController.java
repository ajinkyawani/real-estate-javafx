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
public class CreateCondoListingController implements Initializable {

    @FXML
    private Button backButton;
    @FXML
    private Button saveButton;
    @FXML
    private TextField bedroomNumField;
    @FXML
    private TextField addressField;
    @FXML
    private TextField cityField;
    @FXML
    private TextField stateField;
    @FXML
    private TextField postalCodeField;
    @FXML
    private TextField bathroomNumField;
    @FXML
    private TextField purchasePrizeField;
    @FXML
    private TextField annualTaxesField;
    @FXML
    private TextField monthlyMaintenanceField;

    private static ArrayList<Condominium> condoList = new ArrayList<Condominium>();
    
    @FXML
    private TextField descriptionField;
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
    private void createListing() {
        Condominium condo = new Condominium(this.addressField.getText(), this.cityField.getText(), this.stateField.getText(), 
                Integer.parseInt(this.postalCodeField.getText()), Integer.parseInt(this.bedroomNumField.getText()), Integer.parseInt(this.bathroomNumField.getText()),
        Double.parseDouble(this.purchasePrizeField.getText()), Double.parseDouble(this.annualTaxesField.getText()), Double.parseDouble(this.monthlyMaintenanceField.getText()),
        this.descriptionField.getText());
        
        condoList.add(condo);
        
        PropertyListing propertyListing = new PropertyListing();
        propertyListing.addPropertyListing(condo);
        
        this.setAllFieldsBlank();
        
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
        this.monthlyMaintenanceField.setText("");
        this.descriptionField.setText("");
    }
    
    public ArrayList<Condominium> getCondoListing() {
        return condoList;
    }
    
}
