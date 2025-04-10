import java.security.Provider.Service;
import java.util.ArrayList;
public class tuttofare {

    ArrayList<Service> erogati = new ArrayList<>();
    ArrayList<Service> nonAssegnati = new ArrayList<>();

    //Getter
    public ArrayList<Service> erogati() {return erogati; }
    public ArrayList<Service> nonAssegnati() {return nonAssegnati; }

    public void erogati(Service servizio) {erogati.add(servizio); }
    public void nonAssegnati(Service servizio) {nonAssegnati.add(servizio); }
        
    public void addConstructionService(){

    }

    public void addElectricityService(){

    }

    public void findNewService(){

    }

    public void findFinishedService(){

    }

    public void getAllWithin(){

    }

    public void serveService(){

    }

    public void getCost(){

    }

    public void printAvailable(){

    }

    public void printServed(){

    }
    

}
