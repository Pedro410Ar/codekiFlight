package flight.demo.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import flight.demo.model.Dolar;
import flight.demo.model.Flight;
import flight.demo.model.FlightDTO;

@Component
public class FlightUtils {


    public FlightDTO flightMapper(Flight flight, double price ){
        //convierto la lista de vuelos que viene por parametro en flujo
        //la mapeo para que por cada vuelo cree un nuevo flightDTO con otro precio
        return new FlightDTO(
            flight.getId(),
            flight.getOrigin(), 
            flight.getDestiny(), 
            flight.getDepartureTime(),
            flight.getArrivingTime(),
            flight.getPrice()*price, 
            flight.getFrequency());
       
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public Dolar fetchDolar(){
        RestTemplate restTemplate = restTemplate();
        String apiURL = "https://dolarapi.com/v1/dolares/tarjeta";
        return restTemplate.getForObject(apiURL, Dolar.class);
    }

}
