/*

CSCI 6617 S2 Fall 2019
Java Programming
Ajinkya Wani
awani1@unh.newhaven.edu
Instructor: Sheehan

NAME OF INTERFACE: IRental_Property
DESCRIPTION: Contract for rental property class.

 */

package Interfaces;

/**
 *
 * @author ajinkyawani
 */
public interface IRental_Property {
    void setMonthlyRent(double monthlyRent);
    void setLeasePeriod(double leasePeriod);
    double getMonthlyRent();
    double getLeasePeriod();
}
