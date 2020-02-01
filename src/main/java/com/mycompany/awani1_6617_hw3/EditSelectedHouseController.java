/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.awani1_6617_hw3;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ajinkyawani
 */
public class EditSelectedHouseController implements Initializable {

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
    private TextField descriptionField;
    @FXML
    private Button backButton;    
    @FXML
    private Button updateButton;
    
    private PreviewHouseListingController previewHouseController = new PreviewHouseListingController();
    private House selectedHouse = new House();

    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        this.selectedHouse = previewHouseController.getViewHouse();
        initializeAllFields(selectedHouse);
    }    
    
    private void initializeAllFields(House house){
        this.addressField.setText(house.getAddress());
        this.cityField.setText(house.getCity());
        this.stateField.setText(house.getState());
        this.postalCodeField.setText(Integer.toString(house.getPostalCode()));
        this.bedroomNumField.setText(Integer.toString(house.getNumberOfBedrooms()));
        this.bathroomNumField.setText(Integer.toString(house.getNumberOfBathrooms()));
        this.purchasePrizeField.setText(Double.toString(house.getPurchasePrize()));
        this.annualTaxesField.setText(Double.toString(house.getAnnualTaxes()));
        this.descriptionField.setText(house.getDescription());
    }
    

    @FXML
    private void returnToBackWindow(ActionEvent event) throws IOException {
        App.setRoot("previewHouseListing");
    }

    @FXML
    private void update(ActionEvent event) {
        this.selectedHouse.setAddress(this.addressField.getText());
        this.selectedHouse.setCity(this.cityField.getText());
        this.selectedHouse.setState(this.stateField.getText());
        this.selectedHouse.setPostalCode(Integer.parseInt(this.postalCodeField.getText()));
        this.selectedHouse.setNumberOfBedrooms(Integer.parseInt(this.bedroomNumField.getText()));
        this.selectedHouse.setNumberOfBathrooms(Integer.parseInt(this.bathroomNumField.getText()));
        this.selectedHouse.setPurchasePrize(Double.parseDouble(this.purchasePrizeField.getText()));
        this.selectedHouse.setAnnualTaxes(Double.parseDouble(this.annualTaxesField.getText()));
        this.selectedHouse.setDescription(this.descriptionField.getText());
        
        this.initializeAllFields(selectedHouse);
    }
    
}
