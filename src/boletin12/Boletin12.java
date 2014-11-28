/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12;

import javax.swing.JOptionPane;

/**
 *
 * @author oquintansocampo
 */
public class Boletin12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Garaje par = new Garaje();
        Garaje par2 = new Garaje();
        Garaje par3 = new Garaje();
        Garaje par4 = new Garaje();
        Garaje par5 = new Garaje();
        Garaje par6 = new Garaje();

        par.entraCoche();
        par2.entraCoche();
        par.factura();
        par2.factura();

    }
}
