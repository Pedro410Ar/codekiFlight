package com.codoacodo.vuelosapi.models;

import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;

@Data
public class Dolar {


    private String moneda;
    private String casa;
    private String nombre;
    @Getter
    private double compra;
    @Getter
    private double venta;
    private LocalDateTime fechaActualizacion;

        public double getPromedio() {
        return ((getCompra() + getVenta())/2);
    }
}
