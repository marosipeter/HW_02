package HW_03;

import java.util.Comparator;

//from https://www.geeksforgeeks.org/comparator-interface-java/

public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
    //    return o1.getAge().compareTo(o2.getAge()); //needs the age to be Integer
        if ( o1.getAge()-o2.getAge()==0){
            return o1.getLastName().compareTo(o2.getLastName()); //had to implement this "if", so that if we have the same Age, the second person won't get IGNORED
        } else return o1.getAge()-o2.getAge();

    }
}
