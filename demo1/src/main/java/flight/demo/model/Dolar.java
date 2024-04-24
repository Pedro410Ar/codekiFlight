package flight.demo.model;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.Getter;

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

    public double getPromedio(){
        return((getCompra()+getVenta())/2);
    }

}
