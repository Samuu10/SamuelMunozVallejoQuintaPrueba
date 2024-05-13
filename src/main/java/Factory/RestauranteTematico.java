package Factory;
import Strategy.EstrategiaServicio;
import Strategy.EstrategiaServicioTematico;

public class RestauranteTematico extends Restaurante{
    @Override
    public void atenderServicio() {
        EstrategiaServicio estrategia = obtenerEstrategiaServicio();
        estrategia.darServicio();
    }

    @Override
    public EstrategiaServicio obtenerEstrategiaServicio() {
        return new EstrategiaServicioTematico();
    }
}