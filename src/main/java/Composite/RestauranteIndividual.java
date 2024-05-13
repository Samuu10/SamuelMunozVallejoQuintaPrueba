package Composite;

//Clase RestauranteIndividual que implementa la interfaz ComponenteRestaurante (Hoja)
public class RestauranteIndividual implements ComponenteRestaurante{
    @Override
    public void agregar(ComponenteRestaurante componente) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void eliminar(ComponenteRestaurante componente) {
        throw new UnsupportedOperationException();
    }
}