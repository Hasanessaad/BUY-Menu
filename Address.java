public class Address {

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumb() {
        return numb;
    }

    public void setNumb(int numb) {
        this.numb = numb;
    }
    Address(String street, int numb){
        this.numb = numb;
        this.street = street;
    }
    private String street;
    private int numb;
}
