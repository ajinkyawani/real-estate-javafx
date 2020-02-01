/*

CSCI 6617 S2 Fall 2019
Java Programming
Ajinkya Wani
awani1@unh.newhaven.edu
Instructor: Sheehan

NAME OF CLASS: House
DESCRIPTION: House property class.

 */

package com.mycompany.awani1_6617_hw3;

/**
 *
 * @author ajinkyawani
 */
public class House extends Purchase_Property {
    
    public House() {
        this.setPropertyType("House");
    }
    
    public House(String address, String city, String state, int postalCode,
                int numberOfBedrooms, int numberOfBathrooms, double purchasePrize, 
                double annualTaxes, String description){
        super(purchasePrize, annualTaxes, address, city, state, postalCode, 
                numberOfBedrooms, numberOfBathrooms, description);
        this.setPropertyType("House");
    }
    
    public String toString(){
        return "\nHouse Property\n"  + super.toString();
    }
}
