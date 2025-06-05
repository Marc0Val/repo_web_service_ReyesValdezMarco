/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.mycompany.parcial1_reyesvaldezmarco_web_operaciones_9a;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;   
import jakarta.jws.WebParam;

/**
 *
 * @author Dispositivo
 */
@WebService(serviceName = "calcularIntensidad")
public class calcularIntensidad {

    /**
     * This is a sample web service operation
     *
     * @param voltaje
     * @param resistencia
     * @return
     */
    @WebMethod(operationName = "calcularIntensidad")
    public double calcularIntensidad(@WebParam(name = "voltaje") double voltaje, @WebParam(name = "resistencia") double resistencia) {
        if (resistencia == 0) {
            throw new IllegalArgumentException("no puede se cero 0");
        }
        return voltaje / resistencia;
    }

}
