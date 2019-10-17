
package bài.số.pkg5;

public class HpThucHanh extends DiemHP{
    private double db1,db2,db3;
    
    public HpThucHanh(double db1,double db2,double db3,String x, int soTc ){
        super(x,soTc);
        this.db1 = db1;
        this.db2 = db2;
        this.db3 = db3;
    }

   
    public double tinhDiem(){
    
        return (db1+db2+db3)/3;
    }
    
    public void getInfo(){
        
        System.out.println("db1= "+db1 + "db2" + db2 + "db3"+ db3);
    }
    
}
