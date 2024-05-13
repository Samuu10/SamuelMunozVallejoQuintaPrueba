package State;

//Clase MesaOcupada que implementa la interfaz MesaEstado y establece el estado de la mesa como ocupada
public class MesaOcupada implements MesaEstado{
    @Override
    public void establecerEstado() {
        System.out.println("Mesa ocupada");
    }
}