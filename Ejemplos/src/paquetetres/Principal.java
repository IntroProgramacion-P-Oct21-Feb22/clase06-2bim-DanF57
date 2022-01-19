/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetetres;


import paquete04.OperadorDos;
import paquete04.OperadorUno;

public class Principal {
    
    public static void main(String[] args) {
        int valorA = OperadorUno.obtenerNumero();
        int valorB = OperadorUno.obtenerNumero();
        int suma = OperadorDos.obtenerSuma(valorA, valorB);
        System.out.printf("La suma de %d + %d es igual a: %d\n", 
                valorA,
                valorB,
                suma);
    }
}
