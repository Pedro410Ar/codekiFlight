package flight.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Flight {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private String origin;
   private String destiny;
   private String departureTime;
   private String arrivingTime;
   private double price;
   private String frequency;

   //anotacion relacionada con BD: muchos a uno, primero lo externo
   @ManyToOne
   // con que atributo se van a relacionar
   @JoinColumn(name = "company_ID")
   private Company company;

}
