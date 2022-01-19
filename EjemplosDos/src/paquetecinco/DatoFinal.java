package paquetecinco;

/**
 *
 * @author Daniel
 */
public class DatoFinal {

    public static double obtenerPromedio(double[] n) {
        
        double suma = 0;
        double promedio;
        
        for (int i = 0; i < n.length; i++ ){
            suma = suma + n[i];
        }
        promedio = suma/n.length;
        return promedio;
    }
}
