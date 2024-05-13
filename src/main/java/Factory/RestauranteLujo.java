package Factory;
import Strategy.EstrategiaServicio;
import Strategy.EstrategiaServicioLujo;

public class RestauranteLujo extends Restaurante{
    @Override
    public void atenderServicio() {
        EstrategiaServicio estrategia = obtenerEstrategiaServicio();
        estrategia.darServicio();
    }

    @Override
    public EstrategiaServicio obtenerEstrategiaServicio() {
        return new EstrategiaServicioLujo();
    }
}