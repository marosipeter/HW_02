package HW_04.Second;

public class SalesRepresentative {

    private final int id, sales, quota;

    public SalesRepresentative(int id, int sales, int quota) {
        this.id = id;
        this.sales = sales;
        this.quota = quota;
    }

    @Override
    public String toString(){
       return "The Sales Representative " + this.id + " had " + this.sales + " sales, with a quota of " + this.quota +"$. He has achieved " + this.sales*this.quota+ "$ worth of sales.";
    }

    public int getSales() {
        return sales;
    }

    public int getQuota() {
        return quota;
    }
}
