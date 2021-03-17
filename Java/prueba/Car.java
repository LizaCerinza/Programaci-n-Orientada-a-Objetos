package Java.prueba;

public class Car {
    Integer id;
    String  license;
    Account  driver;
    Integer passengers;  

    public Car(String license, Account driver ){
        this.license = license;
        this.driver  = driver;
    }

    void printDataCar(){
        System.out.println("Car data");
        System.out.println("id: " + this.id);
        System.out.println("License: " + this.license);
        System.out.println("Driver: " + this.driver.name);
        System.out.println("Passangers: " + this.passengers);
    }
}
