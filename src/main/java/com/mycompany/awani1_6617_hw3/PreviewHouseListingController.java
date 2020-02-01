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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author ajinkyawani
 */
public class PreviewHouseListingController implements Initializable {

    @FXML
    private TableView<House> houseTableView;
    @FXML
    private TableColumn<House, Double> purchasePriceColumn;
    @FXML
    private Button backButton;
    @FXML
    private Button returnMainMenuButton;
    @FXML
    private Button viewButton;
    @FXML
    private Button editButton;
    @FXML
    private Button deleteButton;
    
    private static House viewHouse = new House();
    private CreateHouseListingController houseController = new CreateHouseListingController();
    private ArrayList<House> houseList = new ArrayList<House>();
    private PropertyListing propertyController = new PropertyListing();
    @FXML
    private TableColumn<House, String> listingTypeColumn;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        listingTypeColumn.setCellValueFactory(new PropertyValueFactory<House, String>("propertyType"));
        purchasePriceColumn.setCellValueFactory(new PropertyValueFactory<House, Double>("purchasePrize"));
        this.houseList = this.houseController.getHouseListing();
        this.loadOrRefreshHouseTableView(houseList);
    }    
    
    private void loadOrRefreshHouseTableView(ArrayList<House> houseList) {
        ObservableList<House> OhouseList = FXCollections.observableArrayList(houseList);
        houseTableView.setItems(OhouseList);
    }
    
    @FXML
    private void edit() throws IOException {
      viewHouse = houseTableView.getSelectionModel().getSelectedItem();
      this.switchToEditSelectedHouseWindow();
    }
    
    @FXML
    private void view() throws IOException {
      viewHouse = houseTableView.getSelectionModel().getSelectedItem();
      this.switchToViewSelectedHouseWindow();
    }
    
    @FXML
    private void delete() throws IOException{
        House house = new House();
        house = houseTableView.getSelectionModel().getSelectedItem();
        this.houseList = this.houseController.getHouseListing();
        this.houseList.remove(house);
        this.propertyController.getPropertyListing().remove(house);
        this.loadOrRefreshHouseTableView(houseList);
    }
    
    
    public House getViewHouse() {
        return viewHouse;
    }
    
    private void switchToEditSelectedHouseWindow() throws IOException {
        App.setRoot("editSelectedHouse");
    }
    
    private void switchToViewSelectedHouseWindow() throws IOException {
        App.setRoot("viewSelectedHouse");
    }
    
    @FXML
    private void returnToBackWindow() throws IOException {
        App.setRoot("viewEditListing");
    }
    
    @FXML
    private void returnToMainMenuWindow() throws IOException {
        App.setRoot("mainMenu");
    }
    
}
