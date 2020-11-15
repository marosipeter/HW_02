package HW_02.Models;

import java.util.ArrayList;

public class Contact {

    private int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    //full constructor
    public Contact(int id, String firstName, String lastName, String phoneNumber) {
        this.id=id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public int getId(){
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}
