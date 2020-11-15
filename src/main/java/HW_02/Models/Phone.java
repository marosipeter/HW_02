package HW_02.Models;

public abstract class Phone {

    private PhoneService phoneService = new PhoneServiceImpl();
    private String color;
    private String material;
    private String operatingSystem;
    private int batteryLife;
    private boolean touchScreen;
    private String manufacturer;
    private String model;
    private String name;


    public Phone() {
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

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addContact(int id, String firstName, String lastName, String phoneNumber){
        phoneService.addContact(id, firstName, lastName, phoneNumber);
    }

    public void listContact(){
        phoneService.listContact();
    }

    public void sendTextMessage(String phoneNumber, String smsText) {
        phoneService.sendTextMessage(phoneNumber, smsText);
        this.batteryLife = batteryLife-1;
    }

    public void seeAllMessages(String phoneNumber){
        phoneService.seeAllMessages(phoneNumber);
    }

    public void call(String phoneNumber){
        phoneService.call(phoneNumber);
        this.batteryLife = batteryLife -2;
    }

    public void callHistory(){
        phoneService.callHistory();
    }

}
