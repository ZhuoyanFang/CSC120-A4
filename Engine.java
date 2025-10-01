/**
 * The Engine class represents a train engine that stores information about the type of fuel, the current fuel level, and the maximum fuel capacity. The engine can be refueled and go.
 */
public class Engine implements EngineRequirements{
    private FuelType fuelType;
    private double currentFuelLevel;
    private double maxFuelLevel;

    /**
     * It constructs an engine.
     * @param fuelType the type of fuel this engine uses.
     * @param currentFuelLevel the initial amount of fuel in this engine.
     * @param maxFuelLevel the maximum fuel capacity of this engine.
     */
    public Engine(FuelType fuelType,double currentFuelLevel,double maxFuelLevel){
        this.fuelType=fuelType;
        this.currentFuelLevel=currentFuelLevel;
        this.maxFuelLevel=maxFuelLevel;
    }

    /**
     * Returns the type of fuel used by this engine.
     * @return the fuel type.
     */
    public FuelType getFuelType(){
        return fuelType;
    }

    /**
     * Returns the maximum fuel capacity of this engine.
     * @return the maximum fuel capacity of this engine.
     */
    public double getMaxFuel(){
        return maxFuelLevel;
    }

    /**
     * Returns the current fuel level of this engine.
     * @return the maximum fuel level of this engine.
     */
    public double getCurrentFuel(){
        return currentFuelLevel;
    }

    /**
     * Refuel this engine to the maximun capacity.
     */
    public void refuel(){
        this.currentFuelLevel=this.maxFuelLevel;
    }

    /**
     * Run the engine. 
     * @return true if the engine has fuel; false if the engine runs out of fuel.
     */
    public Boolean go(){
        if(currentFuelLevel>0){
            currentFuelLevel = currentFuelLevel - 1;
            System.out.println("The reamining feul is "+this.currentFuelLevel);
            return true;
        }else{
            return false;
        }
    }

    // public static void main(String[] args) {
    //     Engine myEngine = new Engine(FuelType.ELECTRIC, 10.0, 100.0);
    //     while (myEngine.go()) {
    //         System.out.println("Choo choo!");
    //     }
    //     System.out.println("Out of fuel.");
    // }
}