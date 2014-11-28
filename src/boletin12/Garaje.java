package boletin12;

import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JOptionPane;

public class Garaje {

    static int numC = 0;
    private String matr;
    private float precio;
    private float tiempo;
    private long t_salida, t_entrada;

    public boolean plazas() {
        if (numC < 5) {
            JOptionPane.showMessageDialog(null, "Hay Plazas");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Parking Completo");
            return false;
        }
    }

    public long entraCoche() {
        if (plazas() == true) {
            t_entrada = System.currentTimeMillis();
            matr = JOptionPane.showInputDialog("Introducir Matrícula");
            numC++;
        }
        return t_entrada;
    }

    public long saleCoche() {
        t_salida = System.currentTimeMillis();
        numC--;
        return t_salida;
    }

    public float tiempo() {
        tiempo = (float) (t_salida - t_entrada) / 1000;
        return tiempo;
    }

    public float precio() {
        precio = (((tiempo / 3) - 1) * 0.2f) + 0.4f;
        return precio;
    }

    public BigDecimal redondearPrecio() {
        BigDecimal big = new BigDecimal(precio);
        big = big.setScale(2, RoundingMode.HALF_UP);
        return big;
    }

    public void factura() {
        saleCoche();
        this.tiempo();
        this.precio();
        float pagado = Float.parseFloat(JOptionPane.showInputDialog("Precio: " + redondearPrecio() + "\nIntroducir importe"));
        if (pagado < precio) {
            do {
                pagado = Float.parseFloat(JOptionPane.showInputDialog("ERROR Importe insuficiente\nPrecio: " + redondearPrecio() + "\nIntroducir importe"));
            } while (pagado < precio);
        }
        float devol = pagado - precio;
        BigDecimal big = new BigDecimal(devol);
        big = big.setScale(2, RoundingMode.HALF_UP);
        JOptionPane.showMessageDialog(null, "FACTURA\n MATRICULA COCHE: " + matr + "\nTIEMPO: " + tiempo + " segundos" + "\nPRECIO: " + redondearPrecio() + "€" + "\nCARTOS RECIBIDOS: " + pagado + "€" + "\nCARTOS DEVOLTOS: " + big + "€");
    }

}
