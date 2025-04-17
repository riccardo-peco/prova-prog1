public class electricity extends service{
    public double mCable;
    public double mCabelDiameter;
    public double CabelCost;

    public electricity(String user, int priority, int duration, double mCable, double mCabelDiameter, double CabelCost){
        super(user,priority,duration);
        this.mCable = mCable;
        this.mCabelDiameter = mCabelDiameter;
        this.CabelCost = CabelCost;

    }

    //Getter
    public double getMCable() {return mCable; }
    public double getMCabelDiameter() {return mCabelDiameter; }
    public double getCabelCost() {return CabelCost; }
    
    public double getCost() {
        double totCost = mCable * CabelCost + super.workCost * super.duration;
        return totCost; 
    }
    

    //Setter
    public void setMCable(double mCable){this.mCable = mCable;}
    public void setMCabelDiameter(double mCabelDiameter){this.mCabelDiameter = mCabelDiameter;}
    public void setCabelCost(double CabelCost){this.CabelCost = CabelCost;}

}
