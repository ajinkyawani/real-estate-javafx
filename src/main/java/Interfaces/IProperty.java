/*

CSCI 6617 S2 Fall 2019
Java Programming
Ajinkya Wani
awani1@unh.newhaven.edu
Instructor: Sheehan

NAME OF INTERFACE: IProperty
DESCRIPTION: Contract for property class.

 */

package Interfaces;

/**
 *
 * @author ajinkyawani
 */
public interface IProperty {
    void setPropertyType(String propertyType);
    void setAddress(String address);
    void setCity(String city);
    void setState(String state);
    void setPostalCode(int postalCode);
    void setNumberOfBedrooms(int numberOfBedrooms);
    void setNumberOfBathrooms(int numberOfBathrooms);
    void setDescription(String description);
    String getAddress();
    String getCity();
    String getState();
    String getDescription();
    int getPostalCode();
    int getNumberOfBedrooms();
    int getNumberOfBathrooms();
    int getPropID();
    String getPropertyType();
}
