import java.util.ArrayList;
/**
 * The Car class represents a car that can carry passengers. It has a capacity and it can print passenger information.
 */
public class Car implements CarRequirements{
    private ArrayList<Passenger> passengers;
    private int capacity;

    /**
     * It constructs a car with capacity.
     * @param capacity the maximum passengers this car can carry.
     */
    public Car(int capacity){
        this.capacity=capacity;
        this.passengers=new ArrayList<Passenger>();
    }

    /**
     * Returns the capacity of this car.
     * @return the maximum passengers this car can carry.
     */
    public int getCapacity(){
        return capacity;
    }

    /**
     * Returns the seats remain in this car.
     * @return the seats remain in this car.
     */
    public int seatsRemaining(){
        return capacity-passengers.size();
    }

    /**
     * Add a passenger to the car.
     * @param p the passenger to add.
     * @return true if the passenger was added successfully, false if the car is full or the passenger is already on the car.
     */
    public Boolean addPassenger(Passenger p){
        if (this.passengers.size()>=capacity||passengers.contains(p)){
            return false;
        }else{
            passengers.add(p);
            return true;
        }
    }

    /**
     * Remove a passenger to the car.
     * @param p the passenger to remove.
     * @return true if the passenger was removed successfully, false if p is not on the car.
     */
    public Boolean removePassenger(Passenger p){
        if (passengers.contains(p)){
            passengers.remove(p);
            return true;
        }else{
            return false;
        }
    }

    /**
     * Prints the name of the passengers on this car; If the car is empty, prints "This car is EMPTY."
     */
    public void printManifest(){
        if(passengers.isEmpty()){
            System.out.println("This car is EMPTY.");
        }else{
            for(int i = 0; i < passengers.size(); i++){
                System.out.println(passengers.get(i).Name());
            }
        }
    }
}