
package electricaldevice;

public class Kiemtragk {

    
    public static void main(String[] args) {
    Switcher cauDao=new Switcher();
    Cooker noiCom=new Cooker("sonny",140,"122",true,false);
    Fan mayQuat=new Fan("lg",60,"436",true,2,true);
    cauDao.addDevice(noiCom);
    cauDao.addDevice(mayQuat);
    cauDao.showDevice();
    cauDao.turnOff();
    }
     
    
    
}
