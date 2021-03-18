package Java.prueba;

public class Car {
    private Integer id;
    private String  license;
    private Account  driver;
    private Integer passengers;  

    public Car(String license, Account driver ){
        this.license = license;
        this.driver  = driver;
    }

    public Integer getPassengers(){
        return this.passengers;
    }

    public void setPassengers( Integer passangers){
        this.passengers = passangers;   
    }

    public Integer getid(){
        return this.id;
    }

    public void setid( Integer id){
        this.id = id;   
    }

    public String getLicense(){
        return this.license;
    }

    public void setLicense( String license){
        this.license = license;   
    }

    public Account  getDriver(){
        return this.driver;
    }

    public void setDriver( Account driver){
        this.driver = driver;   
    }

    void printDataCar(){
        System.out.println("Car data");
        System.out.println("id: " + this.id);
        System.out.println("License: " + this.license);
        System.out.println("Driver: " + this.driver.name);
        System.out.println("Passangers: " + this.passengers);
    }
}
