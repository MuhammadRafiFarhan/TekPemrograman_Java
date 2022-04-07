public class Commission extends Hourly{
    private double totalSales;
    private double commissionRate;
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate){
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }
    public void addSales(double totalSales){
        this.totalSales = totalSales;
    }
    public double pay(){
        return super.pay() + commissionRate;
    }
    public String toString(){
        return super.toString() + " , commission rate is " + commissionRate;
    }
}
  
   
