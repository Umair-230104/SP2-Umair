public abstract class ACar implements Car {
    final private String registrationNumber;
    final private String make;
    final private String model;
    final private int numberOfDoors;

    public ACar(String registrationNumber, String make, String model, int numberOfDoors) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }


    // Vær sikker på at det er dette man skal gøre
    @Override
    public String toString() {
        return  "\nRegistration Number: " + registrationNumber +
                "\n Make: " + make +
                "\n Model: " + model +
                "\n Number of Doors: " + numberOfDoors;
    }
}
