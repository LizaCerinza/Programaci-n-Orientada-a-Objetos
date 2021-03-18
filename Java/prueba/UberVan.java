package Java.prueba;

import java.util.ArrayList;
import java.util.Map;



public class UberVan extends Car{
    Map<String, Map<String,Integer>> typecarAccepted;
    ArrayList<String> seatsMaterial;
    private Integer passanger;

    public UberVan(String license, Account driver,ArrayList<String> seatsMaterial, Map<String, Map<String,Integer>> typecarAccepted){
        super(license, driver);
        this.typecarAccepted = typecarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    @Override
    public void setPassengers(Integer passangers) {
        if(passangers == 6){
        this.passanger =passangers;}
        else{
            System.out.println("Dato no valido");
        }
    }
    
}