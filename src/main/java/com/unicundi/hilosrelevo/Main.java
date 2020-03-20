/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicundi.hilosrelevo;

/**
 *
 * @author holman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Equipo obj = new Equipo();
        //declaracion objetos corredores
        Corredor1 X1 = new Corredor1("X", 1, obj);
        Corredor2 X2 = new Corredor2("X", 2, obj);
        Corredor3 X3 = new Corredor3("X", 3, obj);
        Corredor1 O1 = new Corredor1("O", 1, obj);
        Corredor2 O2 = new Corredor2("O", 2, obj);
        Corredor3 O3 = new Corredor3("O", 3, obj);
        Corredor1 Y1 = new Corredor1("Y", 1, obj);
        Corredor2 Y2 = new Corredor2("Y", 2, obj);
        Corredor3 Y3 = new Corredor3("Y", 3, obj);
        //declaracion de objeto imprimir
        HiloImprimir imprimir = new HiloImprimir(X1, X2, X3, O1, O2, O3, Y1, Y2, Y3);
        //inicia el hilo imprimir
        imprimir.start();
    }

}
