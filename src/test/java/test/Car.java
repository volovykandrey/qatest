package test;

public class Car {
    int carMaxSpeed;
    int carSeatsNumber;
    String carColor;

    public Car(int carMaxSpeed, int carSeatsNumber, String carColor){
        this.carMaxSpeed = carMaxSpeed;
        this.carSeatsNumber = carSeatsNumber;
        this.carColor = carColor;
    }

    public void cleanCar(){
        System.out.println("Clean my car");
    }


}