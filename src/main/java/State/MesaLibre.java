package State;

//Clase MesaLibre que implementa la interfaz MesaEstado y establece el estado de la mesa como libre
public class MesaLibre implements MesaEstado{
    @Override
    public void establecerEstado(){
        System.out.println("La mesa esta libre");
    }
}