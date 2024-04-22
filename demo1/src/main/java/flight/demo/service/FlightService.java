package flight.demo.service;

import java.util.Optional;

//import java.util.stream.Collectors;

//import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import flight.demo.configuration.FlightConfiguration;
import flight.demo.model.Flight;
//import flight.demo.model.FlightDTO;
import flight.demo.repository.FlightRepository;
import flight.demo.utils.FlightUtils;

@Service
public class FlightService  {

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    FlightUtils flightUtils; 

    @Autowired
    FlightConfiguration flightConfiguration;

    public void createFlight(Flight flight){
        flightRepository.save(flight);
    }

    /*
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    public List<FlightDTO> findAllflight(){
        List<Flight> flightList = flightRepository.findAll();
        return flightList
                .stream()
                .map(flight -> flightUtils.flightMapper(flight, getDolar()))
                .collect(Collectors.toList());
    }
     */

    public double getDolar(){
        return flightUtils.fetchDolar().getPromedio();
    }

    public Optional<Flight> update(Flight flight) {
        flightRepository.save(flight);
        return flightRepository.findById(flight.getId());
    }

    public void deleteFlight(Long id){
        flightRepository.deleteById(id);
    }

    

   


}
