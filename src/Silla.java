import java.util.logging.Level;
import java.util.logging.Logger;

public class Silla {
    public synchronized void sentarse(){
        try {
            Thread.sleep(20);
        } catch (InterruptedException ex) {
            Logger.getLogger(Silla.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
