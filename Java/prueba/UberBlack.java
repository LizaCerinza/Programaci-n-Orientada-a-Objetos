package Java.prueba;
import java.util.ArrayList;
import java.util.Map;



public class UberBlack extends Car{
    Map<String, Map<String,Integer>> typecarAccepted;
    ArrayList<String> seatsMaterial;

    public UberBlack(String license, Account driver,ArrayList<String> seatsMaterial, Map<String, Map<String,Integer>> typecarAccepted){
        super(license, driver);
        this.typecarAccepted = typecarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
    
}