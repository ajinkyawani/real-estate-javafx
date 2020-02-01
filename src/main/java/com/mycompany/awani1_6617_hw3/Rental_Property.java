/*

CSCI 6617 S2 Fall 2019
Java Programming
Ajinkya Wani
awani1@unh.newhaven.edu
Instructor: Sheehan

NAME OF CLASS: Rental_Property
DESCRIPTION: Rental property class.

 */

package com.mycompany.awani1_6617_hw3;

import Interfaces.IRental_Property;

/**
 *
 * @author ajinkyawani
 */
public class Rental_Property extends Property implements IRental_Property{
    
    private double monthlyRent;
    private double leasePeriod;
    
    public Rental_Property(){}
    
    public Rental_Property(String address, String city, String State, int postalCode,
                           int numberOfBedrooms, int numberOfBathrooms,
                           double monthlyRent, double leasePeriod, String description){
        super(address, city, State, postalCode, numberOfBedrooms, numberOfBathrooms, description);
        this.monthlyRent = monthlyRent;
        this.leasePeriod = leasePeriod;
    }

    public double getMonthlyRent() {
        return monthlyRent;
    }

    public double getLeasePeriod() {
        return leasePeriod;
    }

    public void setMonthlyRent(double monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public void setLeasePeriod(double leasePeriod) {
        this.leasePeriod = leasePeriod;
    }

    public String toString(){
        return super.toString() + "\n" +
                "Monthly Rent:\t" + this.getMonthlyRent()+ "\n" +
                "Lease Period:\t" + this.getLeasePeriod();
    }
    
    
}
