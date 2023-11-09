public class ElectricCar extends ACar {
    int batteryCapacity;
    int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    public int getBatteryCapacityKWh() {
        return batteryCapacity;
    }

    public int getMaxRangeKm() {
        return maxRange;
    }

    public int getWhPrKm() {
        return batteryCapacity / maxRange;
    }

    @Override
    public int getRegistrationFee() {
        int kmPrLitr = (int) (100 / (getWhPrKm() / 91.25));

        //System.out.println(getWhPrKm());
        //int conversion = (int) (100/(getWhPrKm()/91.25));
        if (kmPrLitr > 20 && kmPrLitr < 50) {
            return 330;
        } else if (kmPrLitr >= 15 && kmPrLitr <= 20) {
            return 1050;
        } else if (kmPrLitr >= 10 && kmPrLitr <= 15) {
            return 2340;
        } else if (kmPrLitr >= 5 && kmPrLitr <= 10) {
            return 5500;
        } else
            return 10470;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() +
                "\n Wh/Kml: " + getWhPrKm() +
                "\n Registration Fee: " + getRegistrationFee() +
                "\n Battery Capacity: " + getBatteryCapacityKWh() +
                "\n Max Range: " + getMaxRangeKm();
    }
}
