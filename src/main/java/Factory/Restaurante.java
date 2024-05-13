package Factory;

import Strategy.EstrategiaServicio;

public abstract class Restaurante {
    public void atenderServicio() {
        EstrategiaServicio estrategia = obtenerEstrategiaServicio();
        estrategia.darServicio();
    }

    protected abstract EstrategiaServicio obtenerEstrategiaServicio();

}