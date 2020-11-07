package HW_02.Models;

import HW_02.Interfaces_and_Constants.IPhone;

public class Phone implements IPhone {

    private Contact contact;
    private String textMessage;
    private String color;
    private String material;
    private String operatingSystem;
    private double batteryLife;
    private boolean touchScreen;


    @Override
    public Contact addContact(int id, String firstName, String lastName, String phoneNumber) {
        Contact newContact = new Contact(id, firstName, lastName, phoneNumber);
        return newContact;
    }

    public void listContact() {
        System.out.println("Your contact is: " + contact.getFirstName() +" .");
    }

    public void sendTextMessage() {
        System.out.println("The " +textMessage + " message has been sent!");
        batteryLife = batteryLife-0.1;

    }

    public void seeAllMessages() {
        System.out.println("Below are all the messages sent to " + contact.getFirstName() + " .");
    }

    public void call() {
        System.out.println("Calling " + contact.getFirstName() + " !");
        batteryLife = batteryLife-0.2;
    }

    public void callHistory() {
        System.out.println("These are the contacts you have called");
    }

    public void turnOff() {
        System.out.println("General Turn Off message");
    }

    public void turnOn() {
        System.out.println("General Turn On message");
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getTextMessage() {
        return textMessage;
    }

    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }


}
