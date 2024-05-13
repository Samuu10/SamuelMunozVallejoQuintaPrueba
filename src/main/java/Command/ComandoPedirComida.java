package Command;

//Clase ComandoPedirComida que implementa la interfaz Comando y pide comida
public class ComandoPedirComida implements Comando{
    //Atributos
    private Cocina cocina;

    //Constructor
    public ComandoPedirComida(Cocina cocina){
        this.cocina = cocina;
    }

    @Override
    public void ejecutar(){
        cocina.prepararComida();
    }
}