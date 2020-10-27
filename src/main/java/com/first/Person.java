package com.first;

/*
class created to satisfy the (weak) COMPOSITION requirement, by being referenced
*at the Book object as the author,
*and also at Novel object as the protagonist
*/

public class Person {


    private String firstName;
    private String middleName;
    private String lastName;
    private int birthYear;
    private boolean hasPHD;

    //default constructor
    public Person() {

    }

    //full constructor
    public Person (String firstName, String middleName, String lastName, int birthYear, boolean hasPHD){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.hasPHD = hasPHD;

    }

    //constructor for the case wen the Person has no middleName, and the birthYear and hasPHD are not important
    public Person (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //getters for the name components
    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

}
