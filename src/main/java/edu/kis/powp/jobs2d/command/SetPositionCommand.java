package edu.kis.powp.jobs2d.command;

//todo: stworzyc kilka obietkow setpostion itd i przetestowac je

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand{
    private final int x, y;

    public SetPositionCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public void execute(Job2dDriver driver) {
        driver.setPosition(x, y);
    }
}
