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
public class PreviewCondoListingController implements Initializable {

    @FXML
    private TableView<Condominium> condoTableView;
    @FXML
    private TableColumn<Condominium, Double> purchasePrizeColumn;
    @FXML
    private Button mainMenuButton;
    @FXML
    private Button backButton;

    private static Condominium viewCondo = new Condominium();
    @FXML
    private Button viewButton;
    @FXML
    private Button editButton;
    @FXML
    private Button deleteButton;
    
    
    private CreateCondoListingController condoController = new CreateCondoListingController();
    private PropertyListing propertyController = new PropertyListing();
    private ArrayList<Condominium> condoList = new ArrayList<Condominium>();
    @FXML
    private TableColumn<Condominium, String> lisstingTypeColumn;
        
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        lisstingTypeColumn.setCellValueFactory(new PropertyValueFactory<Condominium, String>("propertyType"));
        purchasePrizeColumn.setCellValueFactory(new PropertyValueFactory<Condominium, Double>("purchasePrize"));
        this.condoList = condoController.getCondoListing();
        this.loadOrRefreshCondoTableView(condoList);
    }    
    
    @FXML
    private void view() throws IOException {
        viewCondo = condoTableView.getSelectionModel().getSelectedItem();
        this.switchToViewSelectedCondoWindow();
    }
    
    public Condominium getViewCondo() {
        return viewCondo;
    }
    
    @FXML
    private void delete() throws IOException{
        Condominium condo = new Condominium();
        condo = this.condoTableView.getSelectionModel().getSelectedItem();
        this.condoList = this.condoController.getCondoListing();
        this.condoList.remove(condo);
        this.propertyController.getPropertyListing().remove(condo);
        this.loadOrRefreshCondoTableView(this.condoList);
    }
    
    @FXML
    private void edit() throws IOException {
      viewCondo = condoTableView.getSelectionModel().getSelectedItem();
      this.switchToEditSelectedCondoWindow();
    }
    
    private void switchToEditSelectedCondoWindow() throws IOException {
        App.setRoot("editSelectedCondo");
    }
    
    private void loadOrRefreshCondoTableView(ArrayList<Condominium> condoList) {
        ObservableList<Condominium> OcondoList = FXCollections.observableArrayList(condoList);
        this.condoTableView.setItems(OcondoList);
    }
    
    private void switchToViewSelectedCondoWindow() throws IOException {
        App.setRoot("viewSelectedCondo");
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
