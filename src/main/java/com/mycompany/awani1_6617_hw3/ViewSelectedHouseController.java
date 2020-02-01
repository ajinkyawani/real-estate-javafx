/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.awani1_6617_hw3;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author ajinkyawani
 */
public class ViewSelectedHouseController implements Initializable {

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
    private Button backButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        PreviewHouseListingController controller = new PreviewHouseListingController();
        House house = new House();
        house = controller.getViewHouse();
        setAllLabels(house);
    }    
    
    private void setAllLabels(House house) {
        this.addressLabel.setText(house.getAddress());
        this.cityLabel.setText(house.getCity());
        this.stateLabel.setText(house.getState());
        this.postalCodeLabel.setText(Integer.toString(house.getPostalCode()));
        this.bedroomNumLabel.setText(Integer.toString(house.getNumberOfBedrooms()));
        this.bathroomNumLabel.setText(Integer.toString(house.getNumberOfBathrooms()));
        this.purchasePrizeLabel.setText(Double.toString(house.getPurchasePrize()));
        this.annualTaxesLabel.setText(Double.toString(house.getAnnualTaxes()));
        this.descriptionLabel.setText(house.getDescription());
    }
    
    @FXML
    private void returnToBackWindow() throws IOException {
        App.setRoot("previewHouseListing");
    }
    
}
