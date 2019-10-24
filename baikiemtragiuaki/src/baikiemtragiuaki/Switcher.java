package baikiemtragiuaki;

 class Switcher implements Swithchable{
    
    protected ElectricalDevice devices[];
    
    protected String Status;
    
    public Switcher(){}

    @Override
    public void turnOn() {
        System.out.println("bat cong tac.");
    }

    @Override
    public void turnOff() {
        System.out.println("tat cong tat.");
    }
    
    public ElectricalDevice[] getDevices() {
        return devices;
    }

    public void setDevices(ElectricalDevice[] devices) {
        this.devices = devices;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public void addDev(ElectricalDevice dv){
      dv = new ElectricalDevice();
      
    }

    public void removeDev(ElectricalDevice dv){
        
    }
    
    
    
}

