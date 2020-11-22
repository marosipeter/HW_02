package HW_03;

public class Address {

    private int number;
    private String street;
    private String city;
    private Country country;

    public Address(int number, String street, String city, Country country) {
        this.number = number;
        this.street = street;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return ("\n\tin " + this.country.toString() + ", " + this.city + ", at " + this.street + " street, number " + this.number +".");
    }

    public int getNumber() {
        return number;
    }

    public String getStreet() {
        return street;
    }

    public Country getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }


}
