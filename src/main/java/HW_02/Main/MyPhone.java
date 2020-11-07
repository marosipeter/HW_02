package HW_02.Main;

import HW_02.Models.*;


public class MyPhone {

    public static void main(String... args)  {

//    Phone phone = new Samsung(); //does not compile, as the Samsung class has a private constructor
    Phone phone = new GalaxyS6();

    Contact firstContact = new Contact(1, "Britney", "Spears", "0266 378 264"); //in my case the Contact is an Object; no clue how to create a method in the Phone class, as addContact so that it creates a Contact object..


    }
}
