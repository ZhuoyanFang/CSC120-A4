/**
 * The Passenger class represents a passenger in this train, and each passenger has a name.
 */
public class Passenger implements PassengerRequirements{
    
    private String name;

    /**
     * It constructs a passenger with their name.
     * @param name the name of this passenger.
     */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * Returns the name of this passenger.
     * @return the name of this passenger.
     */
    public String Name() {
        return name;
    }

    /**
     * A pessanger want to board the car, and if the car is full, the passenger cannot board.
     * @param c the car to board.
     */
    public void boardCar(Car c) {
        if (c.addPassenger(this)){
            System.out.println(name+"borard the car.");
        }else{
            System.out.println(name+"cannot board the car since the car is full.");
        }
    }
    /**
     * A pessanger want to get off the car, and if the car does not contain this passenger, the passenger cannot get off the car.
     * @param c the car to get off.
     */
    public void getOffCar(Car c) {
       if (c.removePassenger(this)){
            System.out.println(name+"get off the car.");
        }else{
            System.out.println(name+"cannot get off the car since they did not borad the car.");
        }
    }
}
