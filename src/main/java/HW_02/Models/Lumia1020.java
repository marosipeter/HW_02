package HW_02.Models;

public class Lumia1020 extends Nokia{

    private final int BATTERY_LIFE=300;
    private final boolean IS_TOUCH_SCREEN=true;

    public Lumia1020 () {
        super();
        this.setBatteryLife(BATTERY_LIFE);
        this.setColor("yellow");
        this.setMaterial("plastic");
        this.setModel("Lumia 1020");
        this.setName("Lemon Eye Candy");
        this.setTouchScreen(IS_TOUCH_SCREEN);
    }
}
