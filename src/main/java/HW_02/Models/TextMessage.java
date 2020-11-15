package HW_02.Models;


public class TextMessage {

    final int MAX_TEXT_MESSAGE_LENGTH=100; //set only to 100 to check the else statement easier
    private String phoneNumber;
    private String smsText;

    //constructor with an else, to catch if it is too long
    public TextMessage (String phoneNumber, String smsText){
        this.phoneNumber=phoneNumber;
        if (smsText.length()<=this.MAX_TEXT_MESSAGE_LENGTH){
            this.smsText=smsText;
        }
            else {
                this.smsText="Text too long, cannot be sent!";
            }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSmsText() {
        return smsText;
    }
}
