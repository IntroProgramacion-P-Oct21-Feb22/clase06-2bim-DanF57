/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

// import java.security.SecureRandom;
import java.security.*;

/**
 *
 * @author reroes
 */
public class Ejemplo021 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        int [] valores = new int [5];
        
        for (int i = 0; i<5; i++){
            valores[i] = obtenerNumero();
        }
        int suma = obtenerSuma(valores);
        
        System.out.printf("La suma de %d + %d + %d + %d + %d es igual a: %d\n", 
                valores[0],
                valores[1],
                valores[2],
                valores[3],
                valores[4],
                suma);
    }
    
    public static int obtenerNumero() {
        // objeto generador de números aleatorios
        SecureRandom numerosAleatorios = new SecureRandom();
        
        // Returns a pseudorandom, uniformly distributed int value 
        // between 0 (inclusive) and the specified value (exclusive)
        int valorAleatorio = numerosAleatorios.nextInt(5);
        return valorAleatorio;
    }
    
    public static int obtenerSuma(int sumandos[]){
        int suma = 0;
        for (int i = 0; i<5; i++){
            suma = sumandos[i] + suma;
        }
        return suma;
    }
    
}
