
package electricaldevice;

class ElectricalDecive {
    protected String manuFacture; 
    protected int price;
    protected String id;
    protected String switcher;

    public String getManuFacture() {
        return manuFacture;
    }

    public void setManuFacture(String manuFacture) {
        this.manuFacture = manuFacture;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSwitcher() {
        return switcher;
    }

    public void setSwitcher(String switcher) {
        this.switcher = switcher;
    }
    public void upDate(){
        
    }
    
    public String toString(){
        return "nha san xuat: " + manuFacture
                + "\n" + "gia ban: " + price
                + "\n" + "ma id: " + id
                +"\n" + "cong tac: " + switcher;
    
    }
}
