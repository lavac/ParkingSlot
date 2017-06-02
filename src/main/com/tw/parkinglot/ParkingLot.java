package com.tw.parkinglot;

import java.util.ArrayList;

/**
 * Created by lavanya on 6/2/17.
 */
public class ParkingLot {

    private final int MAXIMUM_PARKINGLOT_CAPACITY = 20;
    private final int EIGHTY_PERCENT_OF_PARKINGSLOT= 16;
    private Attendant attendant;
    private ArrayList<Car> parkingSlot =  new ArrayList<>(MAXIMUM_PARKINGLOT_CAPACITY);

    public ParkingLot(Attendant attendant) {
        this.attendant = attendant;
    }

    public void parkACar(Car car) {
//        parkingSlot.add(car);
        attendant.notifyAttendant();
        if (getNumberOfCarsParked() >= EIGHTY_PERCENT_OF_PARKINGSLOT ) {
            attendant.notifyEightyPercentOfSlotsAreFilled();
        }
    }

    public int getNumberOfCarsParked() {
        return parkingSlot.size();
    }
}
