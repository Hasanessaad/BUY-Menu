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

    public String getNameprod() {
        return nameprod;
    }

    public void setNameprod(String nameprod) {
        this.nameprod = nameprod;
    }

    private String nameprod;

    public int getQuant1() {
        return quant1;
    }

    public void setQuant1(int quant1) {
        this.quant1 = quant1;
    }

    public int getTotalpriceofhead() {
        return totalpriceofhead;
    }

    public void setTotalpriceofhead(int totalpriceofhead) {
        this.totalpriceofhead = totalpriceofhead;
    }

    public String getNameprod2() {
        return nameprod2;
    }

    public void setNameprod2(String nameprod2) {
        this.nameprod2 = nameprod2;
    }

    private int quant1;
    private int totalpriceofhead;

    private String nameprod2;


    Order(int quant , int totalpriceofcell ,String nameprod ){

        this.quant = quant;
        this.totalpriceofcell = totalpriceofcell;
        this.nameprod = nameprod;

    }


}
