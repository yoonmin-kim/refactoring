package me.whiteship.refactoring._09_feature_envy;

public class Bill {

    private ElectricityUsage electricityUsage;

    private GasUsage gasUsage;

    public Bill(ElectricityUsage electricityUsage, GasUsage gasUsage) {
        this.electricityUsage = electricityUsage;
        this.gasUsage = gasUsage;
    }

    public double calculateBill() {
        return electricityUsage.getElectricityBill() + gasUsage.getGasBill();
    }





}
