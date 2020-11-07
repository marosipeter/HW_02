package HW_02.Interfaces_and_Constants;

import HW_02.Models.Contact;

public interface IPhone {
    Contact addContact(int id, String firstName, String lastName, String phoneNumber);
    void listContact();
    void sendTextMessage();
    void seeAllMessages();
    void call();
    void callHistory();
    void turnOff();
    void turnOn();

}
