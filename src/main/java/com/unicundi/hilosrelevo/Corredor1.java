/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicundi.hilosrelevo;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.rowset.spi.SyncResolver;

/**
 *
 * @author holman
 */
public class Corredor1 extends Thread {

    //declaracion de atributos para colorear los corredores
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    //declaracion de variables 
    private String pista = "";
    private int resto = 0, pasos = 0, contador = 0, posicion;
    private String equipo;
    private String nombre;
    private Equipo obj;

    //metodo constructor
    public Corredor1(String nombre, int posicion, Equipo obj) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.obj = obj;
    }

    //metodo para correr el hilo
    @Override
    public void run() {
        corredor1();
    }

    //metodo de logica del hilo
    public synchronized void corredor1() {
        //bucle para definir el tamaño de lo que debe correr el primer corredor
        while (contador < 33) {
            try {
                pasos = (int) Math.floor(Math.random() * 3 + 1);//operacion de numero ramdom
                contador += pasos;//suma los pasos al contador de pasos
                //validacion para que no se pase de la cantidad de pasos limites
                if (contador >= 33) {
                    contador = 33;
                }
                //bucle para imprimir en pantalla el "piso" de la pista atras del corredor
                for (int i = 1; i < contador; i++) {
                    pista += "_";
                }
                pista += nombre;
                resto = 32 - contador;
                //bucle para imprimir en pantalla el "piso" de la pista adelante del corredor
                for (int i = 0; i <= resto; i++) {
                    pista += "_";
                }
                System.err.println(ANSI_YELLOW + "\n" + pista + ANSI_GREEN + nombre + "________________________________" + ANSI_BLUE + nombre + "__________________________________");
                pista = "";
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Corredor1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    //metodos getters and setters
    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPista() {
        return pista;
    }

    public void setPista(String pista) {
        this.pista = pista;
    }

    public int getResto() {
        return resto;
    }

    public void setResto(int resto) {
        this.resto = resto;
    }

    public int getPasos() {
        return pasos;
    }

    public void setPasos(int pasos) {
        this.pasos = pasos;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Equipo getObj() {
        return obj;
    }

    public void setObj(Equipo obj) {
        this.obj = obj;
    }

}
