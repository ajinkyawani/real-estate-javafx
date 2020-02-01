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
public class EditSelectedCondoController implements Initializable {

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
    private TextField monthlyMaintenanceField;
    @FXML
    private Button backButton;
    @FXML
    private Button updateButton;

    private PreviewCondoListingController previewCondoController = new PreviewCondoListingController();
    private Condominium selectedCondo = new Condominium();
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
     this.selectedCondo = previewCondoController.getViewCondo();
     initializeAllFields(selectedCondo);
    }    
    
    private void initializeAllFields(Condominium condo){
        this.addressField.setText(condo.getAddress());
        this.cityField.setText(condo.getCity());
        this.stateField.setText(condo.getState());
        this.postalCodeField.setText(Integer.toString(condo.getPostalCode()));
        this.bedroomNumField.setText(Integer.toString(condo.getNumberOfBedrooms()));
        this.bathroomNumField.setText(Integer.toString(condo.getNumberOfBathrooms()));
        this.purchasePrizeField.setText(Double.toString(condo.getPurchasePrize()));
        this.annualTaxesField.setText(Double.toString(condo.getAnnualTaxes()));
        this.monthlyMaintenanceField.setText(Double.toString(condo.getMonthlyMaintenance()));
        this.descriptionField.setText(condo.getDescription());
    }
    

    @FXML
    private void returnToBackWindow(ActionEvent event) throws IOException {
        App.setRoot("previewCondoListing");
    }

    @FXML
    private void update(ActionEvent event) {
        this.selectedCondo.setAddress(this.addressField.getText());
        this.selectedCondo.setCity(this.cityField.getText());
        this.selectedCondo.setState(this.stateField.getText());
        this.selectedCondo.setPostalCode(Integer.parseInt(this.postalCodeField.getText()));
        this.selectedCondo.setNumberOfBedrooms(Integer.parseInt(this.bedroomNumField.getText()));
        this.selectedCondo.setNumberOfBathrooms(Integer.parseInt(this.bathroomNumField.getText()));
        this.selectedCondo.setPurchasePrize(Double.parseDouble(this.purchasePrizeField.getText()));
        this.selectedCondo.setAnnualTaxes(Double.parseDouble(this.annualTaxesField.getText()));
        this.selectedCondo.setMonthlyMaintenance(Double.parseDouble(this.monthlyMaintenanceField.getText()));
        this.selectedCondo.setDescription(this.descriptionField.getText());
        
        this.initializeAllFields(selectedCondo);
    }
}
