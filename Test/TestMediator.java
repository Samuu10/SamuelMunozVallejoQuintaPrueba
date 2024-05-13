import Command.*;
import Mediator.MediadorRestaurante;
import org.junit.jupiter.api.Test;
import static javax.management.Query.times;

public class TestMediator {
    @Test
    public void testRecibirOrden() {
        Cocina cocinaMock =  new Cocina();
        MediadorRestaurante mediador = new MediadorRestaurante(cocinaMock, new ServicioCliente());
        mediador.recibirOrden();
    }

    // Test para verificar si el mediador envía correctamente la solicitud de reserva de mesa
    @Test
    public void testReservarMesa() {
        Mesa mesaMock = new Mesa(5);
        MediadorRestaurante mediador = new MediadorRestaurante(new Cocina(), new ServicioCliente());
        mediador.reservarMesa(mesaMock);
    }
}