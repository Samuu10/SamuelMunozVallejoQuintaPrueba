package Command;

//Clase ComandoReservarMesa que implementa la interfaz Comando y reserva una mesa
public class ComandoReservarMesa implements Comando{
    private Mesa mesa;

    public ComandoReservarMesa(Mesa mesa){
        this.mesa = mesa;
    }

    @Override
    public void ejecutar(){
        mesa.reservar();
    }
}