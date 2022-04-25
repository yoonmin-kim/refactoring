package me.whiteship.refactoring._06_mutable_data._22_combine_functions_into_transform;

import java.time.Month;
import java.time.Year;

public class Client3 extends ReadingClient{

    private double basicChargeAmount;

    public Client3(Reading reading) {
        this.basicChargeAmount = enrichReading(reading).baseCharge();
    }

    protected double baseRate(Month month, Year year) {
        return 10;
    }

    public double getBasicChargeAmount() {
        return basicChargeAmount;
    }
}
