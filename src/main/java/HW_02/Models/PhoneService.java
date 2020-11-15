package HW_02.Models;

import HW_02.Models.Contact;

public interface PhoneService {
    void addContact(int id, String firstName, String lastName, String phoneNumber);
    void listContact();
    void sendTextMessage(String phoneNumber, String smsText);
    void seeAllMessages(String phoneNumber);
    void call(String phoneNumber);
    void callHistory();

}
