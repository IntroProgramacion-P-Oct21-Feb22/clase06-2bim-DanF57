/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

import paquetedos.DatoPersonal;
import paquetetres.DatosUbicacion;
import paquetedos.DatoTrabajo;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        String nombre;
        String ciudad;
        String apellidoRetornado;
        String empresa;
        String direcempresa;
        
        nombre = DatoPersonal.obtenerNombre();
        apellidoRetornado = DatoPersonal.obtenerApellido();
        ciudad = DatosUbicacion.obtenerCiudad();
        empresa = DatoTrabajo.obtenerEmpresa();
        direcempresa = DatoTrabajo.obtenerDireccion();
        
        System.out.printf("Los datos ingresados son:\n"
                + "Nombre: %s\n"
                + "Ciuadad: %s\n"
                + "Apellido: %s\n"
                + "Empresa: %s\n"
                + "Dirección: %s\n",
                nombre,
                ciudad,
                apellidoRetornado,
                empresa,
                direcempresa);
    }
    
}
