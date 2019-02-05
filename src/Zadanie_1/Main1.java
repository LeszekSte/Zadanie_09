package Zadanie_1;

public class Main1 {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car("Ford",10,50);

        System.out.println(vehicles[0].toString());
        ((Car)vehicles[0]).setAirCondition(true);
        System.out.println(vehicles[0].toString());
        ((Car)vehicles[0]).setAirCondition(false);
        System.out.println(vehicles[0].toString());


    }


}
