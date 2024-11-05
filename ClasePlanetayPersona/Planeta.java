package ClasePlanetayPersona;/*
 * Copyright (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

import org.w3c.dom.ls.LSOutput;

import java.security.spec.RSAOtherPrimeInfo;

public class Planeta {
    String nombre = null;
    int satelites = 0;
    double masa = 0;
    double volumen = 0;
    int diametro = 0;
    int distanciaSol = 0;
    String tipo;
    boolean observable = false;
    double densidad;
    boolean exterior = false;


    Planeta(String nombre, int satelites, double masa, double volumen, int diametro, int distanciaSol, String tipo, boolean observable){
        this.nombre = nombre;
        this.satelites = satelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.observable = observable;
        densidad = masa / volumen;
        exterior = distanciaSol > (2.1 * 149597870) && distanciaSol < (3.1 * 149597870);

    }

    void imprimir(){
        System.out.println("Nombre" + nombre);
        System.out.println("Satelites" + satelites);
        System.out.println("Masa" + masa);
        System.out.println("Volumen" + masa);
        System.out.println("Diametro" + diametro);
        System.out.println("Distancia al Sol" + distanciaSol);
        System.out.println("Tipo de planeta" + tipo);
        System.out.println("Observable a simple vista" + observable);
        System.out.println("La densida es de:" + densidad);
        System.out.println("Planeta exterior:" + exterior);
        System.out.println();

    }

    public static void main(String args[]){
        Planeta p1 = new Planeta("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150000000, "TERRESTRE", true);
        Planeta p2 = new Planeta("Jupiter", 1, 1.899E27, 1.4313E15, 139820, 750000000, "GASEOSO", true);
        p1.imprimir();
        p2.imprimir();
    }
}
