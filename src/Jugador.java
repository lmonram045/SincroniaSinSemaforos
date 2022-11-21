import java.util.logging.Level;
import java.util.logging.Logger;

public class Jugador extends Thread {
    private final Silla silla;
    private final String jugador;
    private int contador;
    public boolean centinela;

    public Jugador(int numero, Silla silla) {
        jugador = "Jugador " + numero;
        this.silla = silla;
        contador = 0;
        centinela = true;
    }

    @Override
    public void run() {
        while (centinela) {
            System.out.println(jugador + " esta sentado.");
            silla.sentarse();
            System.out.println(jugador + " se ha levantado");
            contador++;
            System.out.println(jugador + " se ha sentado un total de " + contador + " veces");
            try {
                this.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(Jugador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
