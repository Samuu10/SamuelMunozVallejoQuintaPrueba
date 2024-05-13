package Factory;
import Strategy.EstrategiaServicio;
import Strategy.EstrategiaServicioComidaRapida;

public class RestauranteComidaRapida extends Restaurante{
    @Override
    public void atenderServicio() {
        EstrategiaServicio estrategia = obtenerEstrategiaServicio();
        estrategia.darServicio();
    }

    @Override
    public EstrategiaServicio obtenerEstrategiaServicio() {
        return new EstrategiaServicioComidaRapida();
    }
}