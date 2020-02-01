/*

CSCI 6617 S2 Fall 2019
Java Programming
Ajinkya Wani
awani1@unh.newhaven.edu
Instructor: Sheehan

NAME OF CLASS: App
DESCRIPTION: Rental Estate Application Using JavaFX.

 */


package com.mycompany.awani1_6617_hw3;

import Interfaces.IProperty;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    //private static ArrayList<IProperty> testList;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("mainMenu"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        PropertyListing propController = new PropertyListing();
        CreateHouseListingController houseController = new CreateHouseListingController();
        ArrayList<House> houseList = new ArrayList<House>();
        House defaultHouse = new House("default","default","default",0,0,0,0,0,"default");
        houseList = houseController.getHouseListing();
        houseList.add(defaultHouse);
        propController.getPropertyListing().add(defaultHouse);
        
        CreateCondoListingController condoController = new CreateCondoListingController();
        ArrayList<Condominium> condoList = new ArrayList<Condominium>();
        condoList = condoController.getCondoListing();
        Condominium defaultCondo = new Condominium("default","default","default",0,0,0,0,0,0,"default");
        condoList.add(defaultCondo);
        propController.getPropertyListing().add(defaultCondo);
        
        CreateAptListingController aptController = new CreateAptListingController();
        ArrayList<Apartment> aptList = new ArrayList<Apartment>();
        aptList = aptController.getAptListing();
        Apartment defaultApt = new Apartment("default","default","default",0,0,0,0,0,"default");
        aptList.add(defaultApt);
        propController.getPropertyListing().add(defaultApt);
        
        launch();
    }

}