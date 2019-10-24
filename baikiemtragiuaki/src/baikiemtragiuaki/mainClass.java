package baikiemtragiuaki;


public class mainClass {

    public static void main(String[] args) {
        ElectricalDevice dv1 = new fan();
        dv1.setNameDevice("quat may.");
        dv1.setId("123abc");
        dv1.setManuFacture("ngo quang tho");
        dv1.setPrice(100);
        dv1.setSwitcher("cong tac bat");
        System.out.println(dv1);
        //
        ElectricalDevice dv2 = new Cooker();
        dv1.setNameDevice("noi com diem.");
        dv1.setId("123defd");
        dv1.setManuFacture("nguyen van A");
        dv1.setPrice(100);
        dv1.setSwitcher("cong tac off.");
        System.out.println(dv2);
        
    }
    
}

