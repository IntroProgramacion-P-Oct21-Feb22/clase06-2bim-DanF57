package paquetecuatro;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class DatoAcademico {

    public static double[] obtenerNotas(int n) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double[] notas = new double[n];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese su nota: ");
            notas[i] = entrada.nextDouble();

        }
        return notas;
    }

}
