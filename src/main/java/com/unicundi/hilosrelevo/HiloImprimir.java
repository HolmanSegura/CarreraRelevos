/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicundi.hilosrelevo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author holman
 */
public class HiloImprimir extends Thread {

    Thread c1, c2, c3, c4, c5, c6, c7, c8, c9;

    //metodo constructor que recibe los hilos
    public HiloImprimir(Thread c1, Thread c2, Thread c3, Thread c4, Thread c5, Thread c6, Thread c7, Thread c8, Thread c9) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
        this.c5 = c5;
        this.c6 = c6;
        this.c7 = c7;
        this.c8 = c8;
        this.c9 = c9;
    }

    //metodo que corre el hilo para imprimir todos los hilos
    public void run() {
        try {
            c1.start();
            c4.start();
            c7.start();
            c1.join();
            c4.join();
            c7.join();
            c2.start();
            c5.start();
            c8.start();
            c2.join();
            c5.join();
            c8.join();
            c3.start();
            c6.start();
            c9.start();
            c3.join();
            c6.join();
            c9.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloImprimir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
