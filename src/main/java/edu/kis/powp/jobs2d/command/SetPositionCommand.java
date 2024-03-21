package edu.kis.powp.jobs2d.command;

//todo: stworzyc kilka obietkow setpostion itd i przetestowac je

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.adapter.DrawerAdapter;

public class SetPositionCommand implements DriverCommand{
    private final int x, y;
    private final Job2dDriver driver;

    public SetPositionCommand(int x, int y, Job2dDriver driver){
        this.x = x;
        this.y = y;
        this.driver = driver;
    }

    @Override
    public void execute() {
        driver.setPosition(x, y);
    }
}
