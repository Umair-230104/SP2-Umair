public class DieselCar extends AFuelCar {
    private Boolean particlefilter;

    public DieselCar(String registraionNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particlefilter) {
        super(registraionNumber, make, model, numberOfDoors, kmPrLitre);
        this.particlefilter = particlefilter;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    @Override
    public int getRegistrationFee() {
        if (kmPrLitre() > 20 && kmPrLitre() < 50) {
            if (hasParticleFilter()) {
                return 330 + 130;
            }
            return 330 + 130 + 1000;
        } else if (kmPrLitre() > 15 && kmPrLitre() < 20) {
            if (hasParticleFilter()) {
                return 1050 + 1390;
            }
            return 1050 + 1390 + 1000;
        } else if (kmPrLitre() > 10 && kmPrLitre() < 15) {
            if (hasParticleFilter()) {
                return 2340 + 1850;
            }
            return 2340 + 1850 + 1000;
        } else if (kmPrLitre() > 5 && kmPrLitre() < 10) {
            if (hasParticleFilter()) {
                return 550 + 2770;
            }
            return 550 + 2770 + 1000;
        } else if (hasParticleFilter()) {
            return 5500 + 15260;
        }
        return 5500 + 15260 + 1000;
    }

    public Boolean hasParticleFilter() {
        return particlefilter;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() +
                "\n Fuel Type: " + getFuelType() +
                "\n Registration Fee: " + getRegistrationFee() +
                "\n Has Particle Filter " + hasParticleFilter();

    }
}