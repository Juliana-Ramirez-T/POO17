/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo17;

/**
 *
 * @author Juliana
 */
//EJERCICIO PROPUESTO #17
import java.util.Scanner;
public class POO17 {
    public static void main(String[] args) {
        double radio, area, longitud;
        System.out.println("Ingrese el radio:"); //Ingrese un numero
        Scanner entrada = new Scanner(System.in);
        radio = entrada.nextDouble(); //Radio de la circunfer.
        area = Math.PI * Math.pow(radio, 2); //Area de la circunfer.
        longitud = 2 * Math.PI * radio; //Longitud de la circunfer.
        System.out.println("Radio de la circunferencia : " + radio);
        System.out.println("Area de la circunferencia : " + area);
        System.out.println("Longitud de la circunferencia : " + longitud);
    }
}

