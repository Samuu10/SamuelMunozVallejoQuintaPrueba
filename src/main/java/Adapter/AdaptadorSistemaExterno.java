package Adapter;

//Clase AdaptadorSistemaExterno que implementa la interfaz SistemaExterno y se encarga de adaptar el sistema externo
public class AdaptadorSistemaExterno {
    //Atributos
    private SistemaExterno sistemaExterno;

    //Constructor
    public AdaptadorSistemaExterno(SistemaExterno sistemaExterno) {
        this.sistemaExterno = sistemaExterno;
    }

    //Método para ejecutar la conexión
    public void ejecutar() {
        sistemaExterno.conectar();
    }
}