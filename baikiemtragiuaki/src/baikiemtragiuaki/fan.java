package baikiemtragiuaki;



public class fan extends ElectricalDevice {
    

    protected String speed;

    protected boolean swing;


    public String getSpeed() {
        return speed;
    }

    public boolean isSwing() {
        return swing;
    }

    public void setSwing(boolean swing) {
        this.swing = swing;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void incSpeed() {
        System.out.println("toc do quay so 1 cuaq quat: 1000 vong/phut"); 
        System.out.println("toc do quay so 2 cuaq quat: 2000 vong/phut");
        System.out.println("toc do quay so 3 cuaq quat: 3000 vong/phut");

    }

    @Override
    public void upDate() {
        
        Switcher dv = new Switcher();
        dv.turnOn();
        System.out.println("quat da bat!");
        dv.turnOff();
        System.out.println("\nquat da tat!");
        
        
    }
}

