package com.tw.parkinglot;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by lavanya on 6/2/17.
 */
public class ParkingLotTest {
    @Test
    public void shouldReturnAMessageWhenCarIsParked() {
        TestAttendant attendant = new TestAttendant();
        ParkingLot parkingLot = new ParkingLot(attendant);
        Car car = new Car();
        parkingLot.parkACar(car);
        assertTrue(attendant.isNotified());
    }

    @Test
    public void shouldReturnCountOneWhenOneCarIsParked(){
        TestAttendant attendant = new TestAttendant();
        ParkingLot parkingLot = new ParkingLot(attendant);
        Car car = new Car();
        parkingLot.parkACar(car);
        assertEquals(1,parkingLot.getNumberOfCarsParked());
    }

    @Test
    public void shouldReturnCountTwoWhenTwoCarsAreParked(){
        TestAttendant attendant = new TestAttendant();
        ParkingLot parkingLot = new ParkingLot(attendant);
        Car carOne = new Car();
        Car carTwo = new Car();
        parkingLot.parkACar(carOne);
        parkingLot.parkACar(carTwo);
        assertEquals(2,parkingLot.getNumberOfCarsParked());
    }

    @Test
    public void shouldNotifiyAttendantWhenEightPercentSlotsAreOccupied() {
        TestAttendant attendant = new TestAttendant();
        ParkingLot parkingLot = new ParkingLot(attendant);
        Car[] car = new Car[20];
        for (int index = 0; index < 16; index++) {
            car[index] = new Car();
            parkingLot.parkACar(car[index]);
        }
        assertEquals(16,parkingLot.getNumberOfCarsParked());
        assertTrue(attendant.isNotifiedWhenMoreThanEightPercentSlotsAreFilled());
    }

}


