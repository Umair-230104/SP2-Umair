import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<Car> fleet = new ArrayList();


    public void addCar(Car car) {
        fleet.add(car);
    }

    public int getTotalRegistrationFeeForFleet() {
        int result = 0;
        for (int i = 0; i<fleet.size(); i++){
            result += fleet.get(i).getRegistrationFee();
        }
        return result;
    }

    @Override
    public String toString(){
        return "Fleet Of Cars:" + fleet;
    }
}
