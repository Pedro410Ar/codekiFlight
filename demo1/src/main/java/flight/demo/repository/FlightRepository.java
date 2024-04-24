package flight.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import flight.demo.model.Flight;


@Repository
public interface FlightRepository extends JpaRepository <Flight, Long> {
    List<Flight> findByOrigin(String origin);
    List<Flight> findByOriginAndDestiny(String origin, String destiny);
}
