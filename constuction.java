public class constuction {
    public double cmSand;
    public double cmCement;
    public double cmCost;

    public constuction(double cmSand, double cmCement, double cmCost){
        this.cmSand = cmSand;
        this.cmCement = cmCement;
        this.cmCost = cmCost;
    }


    //getter
    public double getCmSand() {return cmSand; }
    public double getCmCement() {return cmCement; }
    public double getCmCost() {return cmCost; }

    //Setter
    public void setCmSand(double cmSand) {this.cmSand = cmSand; }
    public void setCmCement(double cmCement) {this.cmCement = cmCement; }
    public void setCmCost(double cmCost) {this.cmCost = cmCost; }
}