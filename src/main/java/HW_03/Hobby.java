package HW_03;

import java.util.List;

public class Hobby {
    private final String name;
    private final int occasionsPerWeek;
    private final List<Address> addresses;

    public Hobby(String name, int occasionsPerWeek, List<Address> addresses) {
        this.name = name;
        this.occasionsPerWeek = occasionsPerWeek;
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        String firstPart = " " + this.name + " which he/she performs " + this.occasionsPerWeek + " times a week.";
        String secondPart = " This hobby can be practiced: ";
        if (addresses.isEmpty()) {
            secondPart = secondPart + " Nowhere.";
        } else {

            for (Address adress : addresses) {
                secondPart = secondPart + adress.toString();
            }
        }
        return firstPart + secondPart;
    }

}
