package com.tw.parkinglot;

/**
 * Created by lavanya on 6/2/17.
 */
public class TestAttendant implements Attendant {
    private boolean notified;
    private boolean notifiedThatEightPercentSlotsAreFilled;


    @Override
    public void notifyAttendant() {
        notified = true;
    }

    @Override
    public void notifyEightyPercentOfSlotsAreFilled() {
        notifiedThatEightPercentSlotsAreFilled = true;
    }

    public boolean isNotified() {
        return notified;
    }

    public boolean isNotifiedWhenMoreThanEightPercentSlotsAreFilled() {
        return notifiedThatEightPercentSlotsAreFilled;
    }
}
