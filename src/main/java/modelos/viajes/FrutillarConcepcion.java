package modelos.viajes;

import modelos.*;

import java.util.ArrayList;

public class FrutillarConcepcion implements EstrategiaRecorrido{
    @Override
    public void crearRecorrido(ArrayList<Bus> buses, BusFactory busFactory, BusFactory busFactory2) {
        int precioBase = 12000;
        buses.add(busFactory.crearBus(precioBase,TipoAsiento.COMUN));
        buses.add(busFactory2.crearBus(precioBase, TipoAsiento.SALONCAMA, TipoAsiento.SEMICAMA));
        buses.add(busFactory2.crearBus(precioBase, TipoAsiento.SEMICAMA, TipoAsiento.SEMICAMA));
    }
}
