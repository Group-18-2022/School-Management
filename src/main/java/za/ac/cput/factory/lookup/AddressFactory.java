package za.ac.cput.factory.lookup;

/*AddressFactory.java
 Student Name: Mike Somelezo Tyolani
 Student Number: 220187568
*/

import za.ac.cput.domain.location.City;
import za.ac.cput.domain.lookup.Address;
import za.ac.cput.helper.Validator;

public class AddressFactory {
    public static Address build(String unitNUmber, String complexName, String streetNUmber, String streetName, int postalCode, City city) {
        Validator.isNull("unitNUmber", unitNUmber);
        Validator.isNull("complexName", complexName);
        Validator.checkStringParam("streetNUmber", streetNUmber);
        Validator.checkStringParam("streetName", streetName);
        Validator.isValidPostalCode("postalCode", postalCode);
        Validator.isNull("city", city);

        return new Address.Builder()
                .unitNUmber(unitNUmber)
                .complexName(complexName)
                .streetNUmber(streetNUmber)
                .streetName(streetName)
                .postalCode(postalCode)
                .City(city)
                .build();
    }
}
