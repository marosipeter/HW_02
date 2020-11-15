package HW_02.Main;

import HW_02.Models.*;


public class MyPhone {

    public static void main(String... args) {


        //Phone myPhone = new Phone(); //does not work because Phone is abstract
        //Phone myPhone = new Samsung; //does not work because Samsung is abstract

        System.out.println("*** Creating the Phone itself ***");
        Phone myPhone = new GalaxyS6();

        //updating the color
        myPhone.setColor("white");

        //updating the name with something random to comply with the requirement "properties that are instance specific: name"
        myPhone.setName(myPhone.getName()+ "_" +Math.random() );

        System.out.println("My phone is called: " + myPhone.getName()); //cannot set the name properly, in the constructor..
        System.out.println("It is a " + myPhone.getModel() + " model made by " + myPhone.getManufacturer() + ".");
        System.out.println("It is run on " + myPhone.getOperatingSystem() + " made of " + myPhone.getColor() + " " + myPhone.getMaterial() + ".");
        if (myPhone.isTouchScreen()) {
            System.out.println("My phone has touchscreen.");
        } else {
            System.out.println("My phone does not have touchscreen.");
        }
        System.out.println("It has a battery capacity of " + myPhone.getBatteryLife() + ".");

        System.out.println("\n*** Adding contacts ***");
        myPhone.addContact(1, "Britney", "Spears", "0266 123 456");
        myPhone.addContact(2, "Thomas", "Mann", "0266 456 789");
        myPhone.listContact();

        System.out.println("\n*** Sending a text message ***");
        myPhone.sendTextMessage("0266 123 456", "This is a shorter message, below 100 characters, and it can be visualized."); //74 char with spaces, visible
//        System.out.println("\n*** Sending a second text message ***");
//        myPhone.sendTextMessage("0266 123 456", "This is a longer message than 100 characters, so that it can not be visualized, and we receive the output from the ‘else’ statement."); //132 char
        myPhone.seeAllMessages("0266 123 456");
        System.out.println("Remaining battery life is: " + myPhone.getBatteryLife());

        System.out.println("\n*** Calling a friend ***");
        myPhone.call("0266 456 789");
//        System.out.println("\n*** Emergency call ***");
//        myPhone.call("911");
        myPhone.callHistory();
        System.out.println("Remaining battery life is: " + myPhone.getBatteryLife());

    }
}
