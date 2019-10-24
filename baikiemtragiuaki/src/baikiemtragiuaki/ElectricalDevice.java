package baikiemtragiuaki;



public class ElectricalDevice implements Swithchable{
    
    protected String manuFacture; 
    
    protected int price; 
    
    protected String nameDevice;
    
    protected String id;
    //
    protected String switcher; 

    public String getNameDevice() {
        return nameDevice;
    }

    public void setNameDevice(String nameDevice) {
        this.nameDevice = nameDevice;
    }
    
    

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
    
    
    
    @Override
    public void turnOn() {
        System.out.println("bat cong tac.");
    }

    @Override
    public void turnOff() {
        System.out.println("tat cong tat.");
    }
    
    public void upDate(){
        //
    }
    
    @Override
    public String toString(){
        return  "ten thiet bi: " + this.nameDevice
                +"\n" + "nha san xuat: " + this.manuFacture
                + "\n" + "gia ban: " + this.price
                + "\n" + "ma id: " + this.id
                +"\n" + "cong tac: " + this.switcher;
    
    }

    
    
}

