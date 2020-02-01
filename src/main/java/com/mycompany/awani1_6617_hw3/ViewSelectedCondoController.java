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
public class ViewSelectedCondoController implements Initializable {

    @FXML
    private Label descriptionLabel;
    @FXML
    private Label addressLabel;
    @FXML
    private Label annualTaxesLabel;
    @FXML
    private Label purchasePrizeLabel;
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
    private Label monthlyMaintenanceLabel;
    @FXML
    private Button backButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       PreviewCondoListingController controller = new PreviewCondoListingController();
        setAllLabels(controller.getViewCondo());
    }    
    
    private void setAllLabels(Condominium condo) {
        this.addressLabel.setText(condo.getAddress());
        this.cityLabel.setText(condo.getCity());
        this.stateLabel.setText(condo.getState());
        this.postalCodeLabel.setText(Integer.toString(condo.getPostalCode()));
        this.bedroomNumLabel.setText(Integer.toString(condo.getNumberOfBedrooms()));
        this.bathroomNumLabel.setText(Integer.toString(condo.getNumberOfBathrooms()));
        this.purchasePrizeLabel.setText(Double.toString(condo.getPurchasePrize()));
        this.annualTaxesLabel.setText(Double.toString(condo.getAnnualTaxes()));
        this.descriptionLabel.setText(condo.getDescription());
        this.monthlyMaintenanceLabel.setText(Double.toString(condo.getMonthlyMaintenance()));
    }
    
    @FXML
    private void returnToBackWindow() throws IOException {
        App.setRoot("previewCondoListing");
    }
}
