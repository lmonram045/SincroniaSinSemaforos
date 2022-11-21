import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Silla silla = new Silla();
        Jugador j1 = new Jugador(1, silla);
        Jugador j2 = new Jugador(2, silla);
        Jugador j3 = new Jugador(3, silla);
        Jugador j4 = new Jugador(4, silla);
        Jugador j5 = new Jugador(5, silla);
        Jugador j6 = new Jugador(6, silla);

        j1.start();
        j2.start();
        j3.start();
        j4.start();
        j5.start();
        j6.start();

        try {
            Thread.sleep(20000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        j1.centinela = false;
        j2.centinela = false;
        j3.centinela = false;
        j4.centinela = false;
        j5.centinela = false;
        j6.centinela = false;
    }
}
