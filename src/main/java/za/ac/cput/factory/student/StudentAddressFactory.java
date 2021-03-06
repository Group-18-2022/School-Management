package za.ac.cput.factory.student;
/*
 This is the student address factory class
 Mponeng Ratego
 216178991
*/

import za.ac.cput.domain.student.StudentAddress;
import za.ac.cput.domain.lookup.Address;
import za.ac.cput.helper.Validator;


public class StudentAddressFactory {

    public static StudentAddress build(String studentId, Address address)
    {

        Validator.checkStringParam("Student ID", studentId);
        Validator.isNull("Student Address", address);

        return new StudentAddress.Builder().setStudentId(studentId).setAddress(address).build();
    }


}
