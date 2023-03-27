
import javax.swing.JOptionPane;

public class hilos extends Thread{
    public static boolean parametro = true; 
    
    @Override
    public void run(){
        int minutos = 0, segundos = 0;
        parametro = true; 
        
        if (hilos2.cosa == 30 && hilos2.val1 == 0 ) {
            hilos2.cosa = 0;
            hilos2.val1 = 30;
        }
        while (parametro) {            
            try {
                Thread.sleep(1000);
                
                segundos += 1;
                
                if (segundos == 60) {
                    segundos =0;
                    minutos += 1;
                }
                
                if (minutos == 0 && segundos < 10) {
                    MenuInicial.jLabel1.setText("00:0" + segundos);
                }else if (minutos == 0 && segundos >= 0) {
                    MenuInicial.jLabel1.setText("00:" + segundos);
                }else if (minutos < 10 && segundos <10) {
                    MenuInicial.jLabel1.setText("0" + minutos + ":0" + segundos);
                }else if (minutos < 10 && segundos >= 10) {
                    MenuInicial.jLabel1.setText("0" + minutos + ":" + segundos);
                }else if (minutos >= 10 && segundos < 10) {
                    MenuInicial.jLabel1.setText(minutos + ":0" + segundos);
                }else if (minutos >= 10 && segundos >=10) {
                    MenuInicial.jLabel1.setText(minutos + ":" + segundos);
                }
                
                //System.out.println(Menu.jLabel1.getText());
               
            } catch (Exception e) {
                System.out.println("Error en hora/hilo1");
            }
        }
        
        MenuInicial.jButton1.setEnabled(true);
        JOptionPane.showMessageDialog(null, "La Simulacion ha Terminado.");
        
    }
    
}
