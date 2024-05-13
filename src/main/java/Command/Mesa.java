package Command;
import State.*;

//Clase Mesa que simula una mesa de un restaurante
public class Mesa {
    //Atributos
    private MesaEstado estado;
    private int numeroOcupantes;

    //Constructor
    public Mesa(int numeroOcupantes){
        this.estado = new MesaLibre();
        this.numeroOcupantes = numeroOcupantes;
    }

    //Getters y Setters
    public MesaEstado getEstado() {
        return estado;
    }

    public void setEstado(MesaEstado estado) {
        this.estado = estado;
    }

    public int getNumeroOcupantes() {
        return numeroOcupantes;
    }

    public void setNumeroOcupantes(int numeroOcupantes) {
        this.numeroOcupantes = numeroOcupantes;
    }

    //Método para reservar la mesa
    public void reservar(){
        this.estado = new MesaReservada();
        this.estado.establecerEstado();
    }
}