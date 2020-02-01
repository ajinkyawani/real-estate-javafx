/*

CSCI 6617 S2 Fall 2019
Java Programming
Ajinkya Wani
awani1@unh.newhaven.edu
Instructor: Sheehan

NAME OF INTERFACE: IPurchase_Property
DESCRIPTION: Contract for purchase property class.

 */

package Interfaces;

/**
 *
 * @author ajinkyawani
 */
public interface IPurchase_Property {
    void setPurchasePrize(double purchasePrize);
    void setAnnualTaxes(double annualTaxes);
    double getPurchasePrize();
    double getAnnualTaxes();
    
}
