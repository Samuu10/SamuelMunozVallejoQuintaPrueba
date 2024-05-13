package Factory;

public class FabricaRestaurantesTematicos implements FabricaRestaurantes{
    @Override
    public Restaurante crearRestaurante() {
        return new RestauranteTematico();
    }
}