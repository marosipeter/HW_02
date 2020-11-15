package HW_02.Models;

public class GalaxyS6 extends Samsung{

    private final int BATTERY_LIFE=100;
    private final boolean IS_TOUCH_SCREEN=true;
    private double diagonal;

    public GalaxyS6 () {
        super();
        this.setBatteryLife(BATTERY_LIFE);
        this.setColor("blue");
        this.setMaterial("glass");
        this.setModel("Galaxy S6");
        this.setName("Phooney");
        this.setTouchScreen(IS_TOUCH_SCREEN);
        this.diagonal=3.14;

    }

}
