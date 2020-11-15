package HW_02.Models;

public class GalaxyS10 extends Samsung{

    private final int BATTERY_LIFE=200;
    private final boolean IS_TOUCH_SCREEN=true;

    public GalaxyS10 () {
        super();
        this.setBatteryLife(BATTERY_LIFE);
        this.setColor("green");
        this.setMaterial("metalic");
        this.setModel("Galaxy S10");
        this.setName("Second Galacy Phooney");
        this.setTouchScreen(IS_TOUCH_SCREEN);

    }
}
