/*

CSCI 6617 S2 Fall 2019
Java Programming
Ajinkya Wani
awani1@unh.newhaven.edu
Instructor: Sheehan

NAME OF CLASS: Apartment
DESCRIPTION: Apartment property class.

 */

package com.mycompany.awani1_6617_hw3;

/**
 *
 * @author ajinkyawani
 */
public class Apartment extends Rental_Property {
    public Apartment() {
        this.setPropertyType("Apartment");
    }
    
    public Apartment(String address, String city, String state, int postalCode,
            int numberOfBedrooms, int numberOfBathrooms, double monthlyRent,
            double leasePeriod, String description) {
        super(address, city, state, postalCode, numberOfBedrooms, numberOfBathrooms, monthlyRent, leasePeriod, description);
        this.setPropertyType("Apartment");
    
    }
    
    public String toString() {
        return "\nApartment Property\n" + super.toString();
    }
}
