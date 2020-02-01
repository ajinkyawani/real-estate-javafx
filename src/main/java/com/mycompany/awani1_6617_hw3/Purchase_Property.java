/*

CSCI 6617 S2 Fall 2019
Java Programming
Ajinkya Wani
awani1@unh.newhaven.edu
Instructor: Sheehan

NAME OF CLASS: Purchase_Property
DESCRIPTION: Purchase property class.

 */

package com.mycompany.awani1_6617_hw3;

import Interfaces.IPurchase_Property;

/**
 *
 * @author ajinkyawani
 */
public class Purchase_Property extends Property implements IPurchase_Property {

    private double purchasePrize;
    private double annualTaxes;

    public Purchase_Property() {
    }

    public Purchase_Property(double purchasePrize, double annualTaxes, 
            String address, String city, String state, int postalCode, 
            int numberOfBedrooms, int numberOfBathrooms, String description) {
        super(address, city, state, postalCode, numberOfBedrooms, numberOfBathrooms, description);
        this.purchasePrize = purchasePrize;
        this.annualTaxes = annualTaxes;
    }

    public double getPurchasePrize() {
        return purchasePrize;
    }

    public double getAnnualTaxes() {
        return annualTaxes;
    }

    public void setPurchasePrize(double purchasePrize) {
        this.purchasePrize = purchasePrize;
    }

    public void setAnnualTaxes(double annualTaxes) {
        this.annualTaxes = annualTaxes;
    }
    
    public String toString(){
        return super.toString() + "\n" +
               "Annual Taxes:\t" + this.getAnnualTaxes() + "\n" +
                "Purchase Prize:\t" + this.getPurchasePrize();
    }
}
