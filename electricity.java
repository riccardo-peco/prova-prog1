public class electricity {
    public double mCable;
    public double mCabelDiameter;
    public double CabelCost;

    public electricity(double mCable, double mCabelDiameter, double CabelCost){
        this.mCable = mCable;
        this.mCabelDiameter = mCabelDiameter;
        this.CabelCost = CabelCost;

    }

    //Getter
    public double getMCable() {return mCable; }
    public double getMCabelDiameter() {return mCabelDiameter; }
    public double getCabelCost() {return CabelCost; }

    //Setter
    public void setMCable(double mCable){this.mCable = mCable;}
    public void setMCabelDiameter(double mCabelDiameter){this.mCabelDiameter = mCabelDiameter;}
    public void setCabelCost(double CabelCost){this.CabelCost = CabelCost;}

}
