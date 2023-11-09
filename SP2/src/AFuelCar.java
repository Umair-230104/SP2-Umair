public abstract class AFuelCar extends ACar {
    private int kmPrLitre;

    // Under her lavede programmet det selv
    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    public abstract String getFuelType();

    public int kmPrLitre() {
        return kmPrLitre;
    }

    @Override
    public String toString(){
        return super.toString() + "Kilometer Per Liter: " + kmPrLitre;
    }
}
