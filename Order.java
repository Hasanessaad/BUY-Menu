public class Order {
    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }


    private int quant;

    public int getTotalpriceofcell() {
        return totalpriceofcell;
    }

    public void setTotalpriceofcell(int totalpriceofcell) {
        this.totalpriceofcell = totalpriceofcell;
    }

    private int totalpriceofcell;


    Order(int quant , int totalpriceofcell){

        this.quant = quant;
        this.totalpriceofcell = totalpriceofcell;

    }


}
