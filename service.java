

public class service implements Comparable<service>{
    public int id;
    public String user;
    public String worker = "";
    public int priority;
    public int duration;
    public double workCost = -1;

    public service (String user, int priority, int duration) {
        
        this.user = user;
        
        this.priority = priority;
        this.duration = duration;
        
    }

    @Override
    public int compareTo(service comp){

        int cmp = Integer.compare(this.priority, comp.priority);
        return cmp;
    }

    //Getter (ritorna i valori)
   public String getUser() {return user; }
   public String getWorker() {return worker; }
   public int getPriority() {return priority; }
   public int getDuration() {return duration; }
   public double getWorkCost() {return workCost; }

   //Setter (modifica i valori)
   public void setUser(String user) {this.user = user; }
   public void setWorker(String worker) {this.worker = worker; }
   public void setPriority(int priority) {this.priority = priority; }
   public void setDuration(int duration) {this.duration = duration; }
   public void setWorkCost(double workCost) {this.workCost = workCost; }


   public String toString() {
    return id + priority + user + worker + duration + workCost;
}

}
