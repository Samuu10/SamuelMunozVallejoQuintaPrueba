import Singleton.GestionRestaurantes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSingleton {
    @Test
    public void testInstanciaUnica() {
        GestionRestaurantes instancia1 = GestionRestaurantes.obtenerInstancia();
        GestionRestaurantes instancia2 = GestionRestaurantes.obtenerInstancia();

        assertSame(instancia1, instancia2, "Las instancias no son las mismas");
    }
}