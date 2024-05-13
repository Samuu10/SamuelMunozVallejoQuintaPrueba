package Factory;

public class FabricaRestaurantesLujo implements FabricaRestaurantes{
    @Override
    public Restaurante crearRestaurante() {
        return new RestauranteLujo();
    }
}