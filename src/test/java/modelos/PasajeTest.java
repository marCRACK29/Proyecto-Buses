package modelos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasajeTest {
    private Pasaje pasaje;
    private int precioTotal = 2000;

    @BeforeEach
    void setUp() {
        SalonCama asiento1 = new SalonCama(1);
        pasaje = new Pasaje(asiento1, precioTotal);
    }

    /*
    @Test
    void setDatos() {
        pasaje.setDatos("Marcos", "Martinez", "12345678-9");
        assertEquals("Marcos", pasaje.getNombre());
        assertEquals("Martinez", pasaje.getApellido());
        assertEquals("12345678-9", pasaje.getRut());
        assertEquals(precioTotal, pasaje.getPrecioTotal());
    }*/
}