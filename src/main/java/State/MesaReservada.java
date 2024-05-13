package State;

//Clase MesaReservada que implementa la interfaz MesaEstado y establece el estado de la mesa como reservada
public class MesaReservada implements MesaEstado{
    @Override
    public void establecerEstado(){
        System.out.println("Mesa reservada");
    }
}