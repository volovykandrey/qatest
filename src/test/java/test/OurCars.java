package test;

public class OurCars {
    public static void main(String[] args) {
        Car vasilyCar = new Car(160, 4, "silver");
        System.out.println(vasilyCar.carMaxSpeed + " " + vasilyCar.carColor + " " + vasilyCar.carSeatsNumber);

        Car olyaCar = new Car(60, 4, "blue");
        System.out.println(olyaCar.carMaxSpeed + " " + olyaCar.carColor + " " + olyaCar.carSeatsNumber);

    }
}
