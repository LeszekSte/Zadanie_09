package Zadanie_1;

public class Car extends Vehicle {
    private boolean airCondition;

//    public Car(String name, double averageFuelConsumption, int tankCapacity, boolean airCondition) {
//        super(name, averageFuelConsumption, tankCapacity);
//        this.airCondition = airCondition;
//    }

    public Car(String name, double averageFuelConsumption, int tankCapacity) {
        super(name, averageFuelConsumption, tankCapacity);
    }

    public boolean getAirConition() {
        return airCondition;
    }

    public void setAirCondition(boolean airCondition) {

        boolean temp = getAirConition();
        if (airCondition == true && temp==false ) {
            setAverageFuelConsumption(getAverageFuelConsumption() + 0.8);
        } else if (airCondition== false && temp == true) {
            setAverageFuelConsumption(getAverageFuelConsumption() - 0.8);
        }
        this.airCondition = airCondition;
    }

    @Override
    public String toString() {
        return super.toString() + " Klima " + airCondition;
    }


}
