import Adapter.AdaptadorSistemaExterno;
import Adapter.SistemaExterno;
import org.junit.jupiter.api.Test;

public class TestAdapter {
    @Test
    public void testEjecutar() {
        SistemaExterno sistemaExterno = new SistemaExterno() {
            @Override
            public void conectar() {
                System.out.println("Conectado al sistema externo.");
            }
        };

        AdaptadorSistemaExterno adaptador = new AdaptadorSistemaExterno(sistemaExterno);
        adaptador.ejecutar();
    }
}
