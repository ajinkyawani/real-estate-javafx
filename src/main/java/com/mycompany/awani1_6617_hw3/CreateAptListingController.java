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
public class CreateAptListingController implements Initializable {

    @FXML
    private TextField addressField;
    @FXML
    private TextField bathroomNumField;
    @FXML
    private TextField bedroomNumField;
    @FXML
    private TextField postalCodeField;
    @FXML
    private TextField stateField;
    @FXML
    private TextField cityField;
    @FXML
    private TextField leasePeriodField;
    @FXML
    private TextField monthlyRentField;
    @FXML
    private Button saveBurtton;
    @FXML
    private Button backButton;

    private static ArrayList<Apartment> aptList = new ArrayList<Apartment>();
    
    @FXML
    private TextField descriotionField;
    
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
        Apartment apt = new Apartment(this.addressField.getText(), this.cityField.getText(), this.stateField.getText(), 
                Integer.parseInt(this.postalCodeField.getText()), Integer.parseInt(this.bedroomNumField.getText()), Integer.parseInt(this.bathroomNumField.getText()),
        Double.parseDouble(this.monthlyRentField.getText()), Double.parseDouble(this.leasePeriodField.getText()),
        this.descriotionField.getText());
        
        aptList.add(apt);
        
        PropertyListing propertyListing = new PropertyListing();
        propertyListing.addPropertyListing(apt);
        
        this.setAllFieldsBlank();
        
    }
    
    private void setAllFieldsBlank() {
        this.addressField.setText("");
        this.cityField.setText("");
        this.stateField.setText("");
        this.postalCodeField.setText("");
        this.bedroomNumField.setText("");
        this.bathroomNumField.setText("");
        this.monthlyRentField.setText("");
        this.leasePeriodField.setText("");
        this.descriotionField.setText("");
    }
    
    public ArrayList<Apartment> getAptListing() {
        return aptList;
    }
}
