package Zadanie_1;

public class Truck extends Car {
    private int capacity;

    public Truck(String name, double averageFuelConsumption, int tankCapacity, boolean airCondition, int capacity) {
        super(name, averageFuelConsumption, tankCapacity, airCondition);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "capacity=" + capacity +
                '}';
    }
}

