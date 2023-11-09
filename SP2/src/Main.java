public class Main {
    public static void main(String[] args) {
        FleetOfCars foc = new FleetOfCars();

        GasolineCar gCar1 = new GasolineCar("AD12843 ", " BMW 1999 ", " 530 ", 5, 25);
        GasolineCar gCar2 = new GasolineCar("AD12843 ", " BMW 1999 ", " 530 ", 3, 17);
        GasolineCar gCar3 = new GasolineCar("AD12843 ", " BMW 1999 ", " 530 ", 5, 13);
        GasolineCar gCar4 = new GasolineCar("AD12843 ", " BMW 1999 ", " 530 ", 3, 7);
        GasolineCar gCar5 = new GasolineCar("AD12843 ", " BMW 1999 ", " 530 ", 5, 3);

        DieselCar dCar1 = new DieselCar("WF23542 ", " Peugout 1998 ", " 203 ", 5, 25, true);
        DieselCar dCar2 = new DieselCar("WF23542 ", " Peugout 1998 ", " 203 ", 3, 17, false);
        DieselCar dCar3 = new DieselCar("WF23542 ", " Peugout 1998 ", " 203 ", 5, 13, true);
        DieselCar dCar4 = new DieselCar("WF23542 ", " Peugout 1998 ", " 203 ", 3, 7, false);
        DieselCar dCar5 = new DieselCar("WF23542 ", " Peugout 1998 ", " 203 ", 5, 3, true);

        ElectricCar eCar1 = new ElectricCar("KM89239 ", " Porsche 2023 ", " Taycan ", 5, 79000, 500);
        ElectricCar eCar2 = new ElectricCar("KM89239 ", " Porsche 2023 ", " Taycan ", 3, 55000, 300);
        ElectricCar eCar3 = new ElectricCar("KM89239 ", " Porsche 2023 ", " Taycan ", 5, 67000, 600);
        ElectricCar eCar4 = new ElectricCar("KM89239 ", " Porsche 2023 ", " Taycan ", 3, 73000, 200);
        ElectricCar eCar5 = new ElectricCar("KM89239 ", " Porsche 2023 ", " Taycan ", 5, 80000, 400);

        foc.addCar(gCar1);
        foc.addCar(gCar2);
        foc.addCar(gCar3);
        foc.addCar(gCar4);
        foc.addCar(gCar5);

        foc.addCar(dCar1);
        foc.addCar(dCar2);
        foc.addCar(dCar3);
        foc.addCar(dCar4);
        foc.addCar(dCar5);

        foc.addCar(eCar1);
        foc.addCar(eCar2);
        foc.addCar(eCar3);
        foc.addCar(eCar4);
        foc.addCar(eCar5);

        foc.getTotalRegistrationFeeForFleet();
        System.out.println(foc);
        System.out.println("\nTotal Registration Fee: " + foc.getTotalRegistrationFeeForFleet() + " Kr.");
    }
}
