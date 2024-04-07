package com.codoacodo.vuelosapi.utils;

import com.codoacodo.vuelosapi.models.Flight;
import com.codoacodo.vuelosapi.models.FlightDTO;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class FlightUtils {

    public Flight flightMapper;

    public List<Flight> detectOffers(List<Flight> flights, Integer offerPrice) {
        return flights.stream()
                .filter(flight -> flight.getPrice() < offerPrice)
                .collect(Collectors.toList());
    }

    public FlightDTO flightMapper(Flight flight, double price){
        return new FlightDTO(flight.getId(),
                flight.getOrigin(),
                flight.getDestiny(),
                flight.getDepartureTime(),
                flight.getArrivingTime(),
                flight.getPrice() * price,
                flight.getFrequency());
    }
}
