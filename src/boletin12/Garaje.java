package boletin12;

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
        t_entrada = System.currentTimeMillis();
        numC++;
        matr = JOptionPane.showInputDialog("Introducir Matrícula");
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

    public void factura() {
        this.tiempo();
        this.precio();
        float pagado = Float.parseFloat(JOptionPane.showInputDialog("Introducir importe"));
        float devol = pagado - precio;

        JOptionPane.showMessageDialog(null, "FACTURA\n MATRICULA COCHE: " + matr + "\nTIEMPO: " + tiempo+" segundos" + "\nPRECIO: " + precio + "€" + "\nCARTOS RECIBIDOS: " + pagado + "€" + "\nCARTOS DEVOLTOS: " + devol + "€");
    }

}
