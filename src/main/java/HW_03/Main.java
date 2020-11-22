package HW_03;


import java.util.*;

public class Main {

    public static void main(String... args) {

        System.out.println("*** First Exercise ***");
        List<Person> peopleArray = new ArrayList<>();

        Collections.addAll(peopleArray,
                new Person("Andriy", "Shevchenko", 44),
                new Person("Lionel", "Messi", 33),
                new Person("Gheorghe", "Hagi", 55),
                new Person("Invented_for_testing_purpose", "Ronaldo", 33),//set age to 33 to match with Messi's; has the same last name as CR7
                new Person("Christiano", "Ronaldo", 35)
        );

        System.out.println("* The original list of footballers with ArrayList *");
        for (Person person : peopleArray){
            System.out.println(person);
        }

        List<Person> peopleLinked = new LinkedList<>();
        peopleLinked.addAll(peopleArray);

        System.out.println("\n* The original list of footballers with LinkedList *");
        for (Person person : peopleLinked){
            System.out.println(person);
        } //well? what is the deal? it looks the same as with ArrayList

        TreeSet<Person> peopleAge = new TreeSet<>(new AgeComparator());
        peopleAge.addAll(peopleArray);

        System.out.println("\n* The list of footballers ordered by Age *");
        for (Person person : peopleAge){
            System.out.println(person);
        }


        TreeSet<Person> peopleName = new TreeSet<>(new NameComparator());
        peopleName.addAll(peopleArray);

        System.out.println("\n* The list of footballers ordered by FirstName *");
        for (Person person : peopleName){
            System.out.println(person);
        }

        System.out.println("\n\n\n*** Second Exercise for HashMap ***");

        //first created a lot of Person, in a lot of combination
        final Person firstPerson = new Person("Thomas", "Wayne", 36); //this guy is both a Student and an Employee
        Employee firstEmployee = new Employee(firstPerson, "surgeon", Level.FIRST);
        Student firstStudent = new Student(firstPerson, "medicine", Level.FORTH);
        //the same person can be a Student and an Employee at the same time
//        System.out.println(firstPerson);
//        System.out.println(firstEmployee);
//        System.out.println(firstStudent);
        //the same as the above lines, just with a for
//        List<Person> peopleList = Arrays.asList(firstPerson,firstEmployee,firstStudent);
//        for (Person person : peopleList){
//            System.out.println(person);
//        }

        Person secondPerson = new Person("Martha", "Wayne", 34);
        Employee secondEmployee = new Employee(secondPerson, "cook", Level.SECOND);

        Person thirdPerson = new Person("Bruce", "Wayne", 17);
        Student thirdStudent = new Student(thirdPerson, "vigilante", Level.THIRD);

        Person forthPerson = new Person("Clark", "Kent", 21);

        Employee fifthEmployee = new Employee(new Person("Lex", "Luthor", 33), "CEO", Level.FORTH);

        Map<Person, List<Hobby>> hobbies = new HashMap<>();

        List<Address> addressList = new ArrayList<>();
        List<Hobby> hobbyList = new ArrayList<>();

        //first Person
        addressList.add(new Address(12, "Downtown", "Gotham", new Country("USA")));
        hobbyList.add(new Hobby("gardening", 3, addressList));
        hobbies.put(firstPerson, hobbyList); //how to make that a Person who is also an Employee and a Student to be recognized as the same Person; not to overwrite, but rather merge them..

        //secondEmployee
        addressList = new ArrayList<>();
        addressList.add(new Address(14, "CityCenter", "Gotham", new Country("USA")));
        addressList.add(new Address(16, "Main", "Gotham", new Country("USA")));
        List<Hobby> hobbyList2 = new ArrayList<>();
        hobbyList2.add(new Hobby("dancing", 2, addressList));
        List<Address> addressList2 = new ArrayList<>();
        addressList2 = new ArrayList<>();
        addressList2.add(new Address(21, "Central park", "New York", new Country("USA")));
        hobbyList2.add(new Hobby("singing", 1, addressList2));
        hobbies.put(secondEmployee, hobbyList2);

        //thirdStudent : Bruce likes everything what his parents do
        List<Hobby> hobbyList3 = new ArrayList<>();
        hobbyList3.addAll(hobbyList);
        hobbyList3.addAll(hobbyList2);
        hobbies.put(thirdStudent, hobbyList3);

        //forthPerson
        addressList = new ArrayList<>();
        addressList.add(new Address(122, "Downtown", "Metroplois", new Country("USA")));
        hobbyList = new ArrayList<>();
        hobbyList.add(new Hobby("flying", 7, addressList));
        hobbies.put(forthPerson, hobbyList);

        //fifthEmployee
        addressList = new ArrayList<>();
        addressList.add(new Address(666, "Central", "Metroplois", new Country("USA")));
        hobbyList = new ArrayList<>();
        hobbyList.add(new Hobby("golfing", 7, addressList));
        hobbies.put(fifthEmployee, hobbyList);


        for (Map.Entry<Person, List<Hobby>> entry : hobbies.entrySet()) {
            System.out.println("The person " + entry.getKey() + " He/she has this many hobbies:  " + entry.getValue().size());
            List<Hobby> entryHobbyList = entry.getValue();
            if (entryHobbyList.size() == 1) {
                System.out.println("His/her hobby is :");
            } else {
                System.out.println("His/her hobbies are :");
            }
            for (Hobby hobby : entryHobbyList) {
                System.out.println(hobby);
            }
            System.out.println();
        }

    }
}
