package HW_02.Models;

import java.util.ArrayList;

public class PhoneServiceImpl implements PhoneService {

    private final ArrayList<Contact> contacts = new ArrayList<>();
    private final ArrayList<TextMessage> textMessages = new ArrayList<>();
    private final ArrayList<Call> calls = new ArrayList<>();

    @Override
    public void addContact(int id, String firstName, String lastName, String phoneNumber) {
        this.contacts.add(new Contact(id, firstName, lastName, phoneNumber));
    }

    @Override
    public void listContact() {
        System.out.println("Contact List:");
        for (Contact contact : this.contacts) {
            System.out.println("Phone Number with id " + contact.getId() + " has the number " + contact.getPhoneNumber() + ", and belongs to "  + contact.getFirstName() + " " + contact.getLastName()+ " .");
        }
    }

    @Override
    public void sendTextMessage(String phoneNumber, String smsText) {
        this.textMessages.add(new TextMessage(phoneNumber, smsText));
    }

    @Override
    public void seeAllMessages(String phoneNumber) {
        System.out.println("Message List for Phone Number: " + phoneNumber);
        for (TextMessage message : this.textMessages) {
            if (message.getPhoneNumber() == phoneNumber) {
                System.out.println(message.getSmsText());
            }
        }
    }

    @Override
    public void call(String phoneNumber) {
        this.calls.add(new Call(phoneNumber));
    }

    @Override
    public void callHistory() {
        System.out.println("Call History:");
        for (Call call : this.calls) {
            System.out.println(call.getPhoneNumber());
        }
    }
}

