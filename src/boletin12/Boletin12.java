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

        par.plazas();
        par.entraCoche();
        par2.entraCoche();
        System.out.println(Garaje.numC);
        par.saleCoche();
        par.factura();

    }
}