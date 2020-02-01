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
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author ajinkyawani
 */
public class ViewSelectedAptController implements Initializable {

    @FXML
    private Label descriptionLabel;
    @FXML
    private Label addressLabel;
    @FXML
    private Label leasePeriodLabel;
    @FXML
    private Label monthlyRentLabel;
    @FXML
    private Label bathroomNumLabel;
    @FXML
    private Label bedroomNumLabel;
    @FXML
    private Label postalCodeLabel;
    @FXML
    private Label stateLabel;
    @FXML
    private Label cityLabel;
    @FXML
    private Button backButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        PreviewAptListingController controller = new PreviewAptListingController();
        setAllLabels(controller.getViewApt());
    }    
    
    private void setAllLabels(Apartment apt) {
        this.addressLabel.setText(apt.getAddress());
        this.cityLabel.setText(apt.getCity());
        this.stateLabel.setText(apt.getState());
        this.postalCodeLabel.setText(Integer.toString(apt.getPostalCode()));
        this.bedroomNumLabel.setText(Integer.toString(apt.getNumberOfBedrooms()));
        this.bathroomNumLabel.setText(Integer.toString(apt.getNumberOfBathrooms()));
        this.leasePeriodLabel.setText(Double.toString(apt.getLeasePeriod()));
        this.monthlyRentLabel.setText(Double.toString(apt.getMonthlyRent()));
        this.descriptionLabel.setText(apt.getDescription());
    }
    
    @FXML
    private void returnToBackWindow() throws IOException {
        App.setRoot("previewAptListing");
    }
    
}
