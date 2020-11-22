package HW_03;

import java.util.Comparator;

//from https://www.geeksforgeeks.org/comparator-interface-java/

public class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if ( o1.getLastName().compareTo(o2.getLastName())==0)
        {
            return o1.getFirstName().compareTo(o2.getFirstName());
        } else return o1.getLastName().compareTo(o2.getLastName());

    }
}
