import java.util.ArrayList;
/**
 * The Train class has an engine and some cars to carry passengers.
 */
public class Train implements TrainRequirements{
    private Engine engine;
    private ArrayList<Car> cars;

    /**
     * It constructs a train.
     * @param fuelType the type of fuel used by the engine.
     * @param currentFuelLevel the current amount of fuel in the engine.
     * @param fuelCapacity the maximum fuel capacity of the engine.
     * @param nCars the number of cars in this train.
     * @param passengerCapacity the capacity of each car.
     */
    public Train(FuelType fuelType, double currentFuelLevel, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine= new Engine(fuelType,currentFuelLevel,fuelCapacity);
        this.cars= new ArrayList<Car>();
    }

    /**
     * Returns the engine of this train.
     * @return the engine.
     */
    public Engine getEngine(){
        return engine;
    }

    /**
     * Returns the ith car.
     * @param i the index of the car.
     * @return the ith car.
     */
    public  Car getCar(int i){
        return cars.get(i);
    }

    /**
     * Returns the total capacity in this train.
     * @return the capacity of this train.
     */
    public int getMaxCapacity(){
        int MaxCapacity=0;
        for (int i = 0; i < cars.size(); i++){
            MaxCapacity=MaxCapacity+cars.get(i).getCapacity();
        }
        return MaxCapacity;
    }

    /**
     * Returns the total remaining seats in this train.
     * @return the remaining seats in this train.
     */
    public int seatsRemaining(){
        int MaxRemaining=0;
        for (int i = 0; i < cars.size(); i++){
             MaxRemaining= MaxRemaining+cars.get(i).seatsRemaining();
        }
        return  MaxRemaining;
    }

    /**
     * Prints all the passengers' names onboard.
     */
    public void printManifest(){
        for (int i = 0; i < cars.size(); i++) {
            cars.get(i).printManifest();
        }
    }
}
