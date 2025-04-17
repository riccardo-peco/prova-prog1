
import java.util.ArrayList;
public class tuttofare {

    ArrayList<service> erogati = new ArrayList<>();
    ArrayList<service> nonAssegnati = new ArrayList<>();

    //Getter
    public ArrayList<service> erogati() {return erogati; }
    public ArrayList<service> nonAssegnati() {return nonAssegnati; }

    public void erogati(service servizio) {erogati.add(servizio); }
    public void nonAssegnati(service servizio) {nonAssegnati.add(servizio); }
        


    public void addConstructionService(String user, int priority, int duration){
        service Servizio = new service(user, priority, duration);
        Servizio.setWorkCost(0.0);
        nonAssegnati.add(Servizio);
    }

    public void addElectricityService(String user, int priority, int duration,  double mCable, double mCabelDiameter, double CabelCost){
        electricity ServizioElec = new electricity(user, priority, duration, mCable, mCabelDiameter, CabelCost);
        ServizioElec.setWorkCost(0.0);
        nonAssegnati.add(ServizioElec);
    }

    public service findNewService(int id){
        for(service s : nonAssegnati){
            if (s.getId() == id) {

                return s;
            }
        }
        return null;

    }

    public service findFinishedService(int id){
        for(service s : erogati){
            if (s.getId() == id) {

                return s;
            }
        }
        return null;

    }

    public ArrayList<service> getAllWithin(int priority1, int priority2){
        ArrayList<service> unione = new ArrayList<>();
        unione.addAll(erogati);
        unione.addAll(nonAssegnati);

        for (service s : unione) {
            if(s.getPriority() > priority1 && s.getPriority() < priority2){
                unione.add(s);
            }
        }

        return unione;
    }

    public boolean serveService(int id, String worker, float workCost){
        for (service s : nonAssegnati) {
            if (s.getId() == id) {
                
                s.worker = worker;
                s.workCost = workCost;
                

                boolean sucRem = nonAssegnati.remove(s);
                boolean sucAdd = erogati.add(s);
                if(sucAdd && sucRem){
                    return true;
                }
            }
        }
        return false;
    }

    public int  getCost(int id){
         

        return -1;
    }

    public void printAvailable(){

    }

    public void printServed(){

    }
    

}
