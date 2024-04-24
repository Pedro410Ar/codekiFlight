package flight.demo.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import flight.demo.model.Dolar;



@SpringBootTest
public class FlightUtilsTest {

    @Autowired
    FlightUtils flightUtils;


    @Test
    void fetchDolarTest(){

        //Contexto
        Dolar dummyDolar = new Dolar();
        
        dummyDolar.setMoneda("USD");
        dummyDolar.setCasa("tarjeta");
        dummyDolar.setNombre("Tarjeta");
        dummyDolar.setCompra(1000);
        dummyDolar.setVenta(1200);
        //dummyDolar.setFechaActualizacion(null);


        FlightUtils mockedFlightUtils = mock(FlightUtils.class);
        when(mockedFlightUtils.fetchDolar()).thenReturn(dummyDolar);

        Dolar dolar = mockedFlightUtils.fetchDolar();

    //VERIFICACIONES
        assertEquals(1100, dolar.getPromedio());

    }

}
