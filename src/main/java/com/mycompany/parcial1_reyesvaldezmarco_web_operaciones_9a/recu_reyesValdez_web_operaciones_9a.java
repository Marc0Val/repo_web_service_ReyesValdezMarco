package com.mycompany.parcial1_reyesvaldezmarco_web_operaciones_9a;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;

@WebService(serviceName = "recu_reyesValdez_web_operaciones_9a")
public class recu_reyesValdez_web_operaciones_9a {

    @WebMethod(operationName = "calcularMasa")
    public double calcularMasa(
            @WebParam(name = "densidad") double densidad,
            @WebParam(name = "volumen") double volumen
    ) {
        return densidad * volumen;
    }
}
