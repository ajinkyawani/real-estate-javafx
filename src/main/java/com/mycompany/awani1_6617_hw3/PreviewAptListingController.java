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
import javafx.event.ActionEvent;
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
public class PreviewAptListingController implements Initializable {

    @FXML
    private TableView<Apartment> aptTableView;
    @FXML
    private TableColumn<Apartment, Double> monthlyRentColumn;
    @FXML
    private Button returnToMainMenuButton;
    @FXML
    private Button backButton;
    @FXML
    private Button viewButton;
    @FXML
    private Button editButton;
    @FXML
    private Button deleteButton;

    private static Apartment viewApt = new Apartment();
    private ArrayList<Apartment> aptList = new ArrayList<Apartment>();
    private CreateAptListingController aptController = new CreateAptListingController();
    private PropertyListing propertyController = new PropertyListing();
    @FXML
    private TableColumn<Apartment, String> listingTypeColumn;
    
    /** 
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        listingTypeColumn.setCellValueFactory(new PropertyValueFactory<Apartment, String>("propertyType"));
        monthlyRentColumn.setCellValueFactory(new PropertyValueFactory<Apartment, Double>("monthlyRent"));
        this.aptList = aptController.getAptListing();
        this.loadOrRefreshAptTableView(aptList);
    }    
    
    private void loadOrRefreshAptTableView(ArrayList<Apartment> condoList) {
        ObservableList<Apartment> OaptList = FXCollections.observableArrayList(this.aptList);
        aptTableView.setItems(OaptList);
    }
    
    @FXML
    private void delete() throws IOException{
        Apartment apt = new Apartment();
        apt = this.aptTableView.getSelectionModel().getSelectedItem();
        this.aptList = this.aptController.getAptListing();
        this.aptList.remove(apt);
        this.propertyController.getPropertyListing().remove(apt);
        this.loadOrRefreshAptTableView(this.aptList);
    }
    
    @FXML
    private void edit() throws IOException {
      viewApt = aptTableView.getSelectionModel().getSelectedItem();
      this.switchToEditSelectedAptWindow();
    }
    
    private void switchToEditSelectedAptWindow() throws IOException {
        App.setRoot("editSelectedApt");
    }
    
    
     @FXML
    private void returnToBackWindow() throws IOException {
        App.setRoot("viewEditListing");
    }
    
    @FXML
    private void returnToMainMenuWindow() throws IOException {
        App.setRoot("mainMenu");
    }

    @FXML
    private void view(ActionEvent event) throws IOException {
        viewApt = this.aptTableView.getSelectionModel().getSelectedItem();
        this.switchToviewSelectedAptWindow();
    }
    
    private void switchToviewSelectedAptWindow() throws IOException {
        App.setRoot("viewSelectedApt");
    }
    
    public Apartment getViewApt() {
        return viewApt;
    }
    
}
