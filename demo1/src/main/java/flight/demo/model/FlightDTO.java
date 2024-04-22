package flight.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class FlightDTO {
   private Long id;
   private String origin;
   private String destiny;
   private String departureTime;
   private String arrivingTime;
   private double converterPrice;
   private String frequency;
   

}
