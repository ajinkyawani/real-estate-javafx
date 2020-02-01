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
public class EditSelectedAptController implements Initializable {

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
    private TextField monthlyRentField;
    @FXML
    private TextField leasePeriodField;
    @FXML
    private TextField descriptionField;
    @FXML
    private Button backButton;
    @FXML
    private Button updateButton;

    private PreviewAptListingController previewAptController = new PreviewAptListingController();
    private Apartment selectedApt = new Apartment();
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    this.selectedApt = previewAptController.getViewApt();
     initializeAllFields(selectedApt);
    }    
    
    private void initializeAllFields(Apartment apt){
        this.addressField.setText(apt.getAddress());
        this.cityField.setText(apt.getCity());
        this.stateField.setText(apt.getState());
        this.postalCodeField.setText(Integer.toString(apt.getPostalCode()));
        this.bedroomNumField.setText(Integer.toString(apt.getNumberOfBedrooms()));
        this.bathroomNumField.setText(Integer.toString(apt.getNumberOfBathrooms()));
        this.monthlyRentField.setText(Double.toString(apt.getMonthlyRent()));
        this.leasePeriodField.setText(Double.toString(apt.getLeasePeriod()));
        this.descriptionField.setText(apt.getDescription());
    }
    

    @FXML
    private void returnToBackWindow(ActionEvent event) throws IOException {
        App.setRoot("previewAptListing");
    }

    @FXML
    private void update(ActionEvent event) {
        this.selectedApt.setAddress(this.addressField.getText());
        this.selectedApt.setCity(this.cityField.getText());
        this.selectedApt.setState(this.stateField.getText());
        this.selectedApt.setPostalCode(Integer.parseInt(this.postalCodeField.getText()));
        this.selectedApt.setNumberOfBedrooms(Integer.parseInt(this.bedroomNumField.getText()));
        this.selectedApt.setNumberOfBathrooms(Integer.parseInt(this.bathroomNumField.getText()));
        this.selectedApt.setMonthlyRent(Double.parseDouble(this.monthlyRentField.getText()));
        this.selectedApt.setLeasePeriod(Double.parseDouble(this.leasePeriodField.getText()));
        this.selectedApt.setDescription(this.descriptionField.getText());
        
        this.initializeAllFields(selectedApt);
    }
}
