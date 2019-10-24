package baikiemtragiuaki;



public class Cooker extends ElectricalDevice {

    protected boolean cooKing;
    
    public boolean isCooKing() {
        return cooKing;
    }

    public void setCooKing(boolean cooKing) {
        this.cooKing = cooKing;
    }
    
    public void cook(){
        System.out.println("nau.");
    }
    
    public void warm(){
        System.out.println("bam nut de tien hanh nau chin thuc an."); //~
    }
    
    @Override
    public void upDate(){
        Switcher dv = new Switcher();
        dv.turnOn();
        System.out.println("da bat noi com dien!");
        dv.turnOff();
        System.out.println("\nnoi com dien da tat!");
        
    
    }

}

