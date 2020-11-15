package HW_02.Models;

public class N3310 extends Nokia{

    private final int BATTERY_LIFE=1000;
    private final boolean IS_TOUCH_SCREEN=false;
    private final String OPERATING_SYSTEM = "Symbian";

    public N3310 () {
        super();
        this.setBatteryLife(BATTERY_LIFE);
        this.setColor("white-blue");
        this.setMaterial("concrete");
        this.setModel("3320");
        this.setName("The Unbreakable");
        this.setTouchScreen(IS_TOUCH_SCREEN);
        this.setOperatingSystem(OPERATING_SYSTEM); //this should overwrite the operatingSystem set at Nokia
    }
}
