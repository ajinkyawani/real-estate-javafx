/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.awani1_6617_hw3;

import java.util.ArrayList;

/**
 *
 * @author ajinkyawani
 */
public class PropertyListing {
    
    private static ArrayList<Property> propertyListing = new ArrayList<Property>();
    
    public void addPropertyListing(Property propertyObject) {
        propertyListing.add(propertyObject);
    }
    
     public ArrayList<Property> getPropertyListing() {
        return propertyListing;
    }
    
}
