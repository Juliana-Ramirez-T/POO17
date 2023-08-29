/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poor17;

/**
 *
 * @author Juliana
 */
//EJERCICIO RESUELTO #17
import java.util.Scanner;
public class POOR17 {
    public static void main(String[] args) {
        double n;
        int num, suma;
        suma=0;
        num=1;
        System.out.println("Cantidad de numeros naturales a sumar:"); //Ingreso
        Scanner entrada = new Scanner(System.in);
        n = entrada.nextDouble(); //Ventas 1
        
        while (num <= n){
            suma= suma + num;
            num= num + 1;
        }
        
        System.out.println("La suma es: " + suma);
    }
}

