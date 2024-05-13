package Mediator;
import Command.*;

//Clase MediadorRestaurante que se encarga de mediar entre la cocina y el servicio al cliente
public class MediadorRestaurante {
    private Cocina cocina;
    private ServicioCliente servicioCliente;

    public MediadorRestaurante(Cocina cocina, ServicioCliente servicioCliente) {
        this.cocina = cocina;
        this.servicioCliente = servicioCliente;
    }

    public void recibirOrden() {
        ComandoPedirComida comando = new ComandoPedirComida(cocina);
        comando.ejecutar();
    }

    public void reservarMesa(Mesa mesa) {
        ComandoReservarMesa comando = new ComandoReservarMesa(mesa);
        comando.ejecutar();
    }
}