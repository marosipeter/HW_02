package HW_03;

import java.util.Objects;

public class Person{

    private String firstName;
    private String lastName;
    private int age; //the comparator needed the wrapper to be able to use the compareTo

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return (this.firstName + " " + this.lastName + " is " + this.age + " years old."); }

        //automatic equals and hashCode override
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }

    // Compare inside the Person
//public class Person implements Comparable{
//    @Override
//    public int compareTo(Object o) {
//        Person secondPerson = ((Person)o);
//        return this.getAge()-secondPerson.getAge();
//    }
}
