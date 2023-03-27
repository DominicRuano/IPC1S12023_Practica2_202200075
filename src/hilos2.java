
import java.util.logging.Level;
import java.util.logging.Logger;




public class hilos2 extends Thread{
    private static int val = 3;
    public static int val1 = Integer.parseInt(MenuInicial.jLabel6.getText());
    private static int val2;
    private static int val3;
    private static int val4;
    private static int val5;
    public static int cosa;
    
    @Override
    public void run(){
        val1 -= 1;
        MenuInicial.jLabel6.setText(String.valueOf(val1));
        val2 += 1;
        MenuInicial.jLabel5.setText(String.valueOf(val2));
        
        try {
            Thread.sleep(objeto.misobjetos.get(0).gettInv()*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(hilos2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (val1 > 0) {
                    
        hilos2 hilo3 = new hilos2();
        hilo3.start();
        
        }
                
        
        
        val2 -= 1;
        MenuInicial.jLabel5.setText(String.valueOf(val2));
        val3 += 1;
        MenuInicial.jLabel4.setText(String.valueOf(val3));
        
        try {
            Thread.sleep(objeto.misobjetos.get(0).gettProd()*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(hilos2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        val3 -= 1;
        MenuInicial.jLabel4.setText(String.valueOf(val3));
        val4 += 1;
        MenuInicial.jLabel2.setText(String.valueOf(val4));
        
        try {
            Thread.sleep(objeto.misobjetos.get(0).gettEmpa()*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(hilos2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        val4 -= 1;
        MenuInicial.jLabel2.setText(String.valueOf(val4));
        val5 += 1;
        MenuInicial.jLabel3.setText(String.valueOf(val5));
        
        try {
            Thread.sleep(objeto.misobjetos.get(0).getTsal()*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(hilos2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        val5 -= 1;
        MenuInicial.jLabel3.setText(String.valueOf(val5));
        System.out.println(cosa);
        cosa += 1;
        System.out.println(cosa);
        MenuInicial.jLabel7.setText(String.valueOf(cosa));
        
        
        if (cosa == 30) {
            hilos.parametro = false;
        }
        
        
    }
    
    
}
