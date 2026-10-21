public class SensorTemperatura extends Sensor{
    private final String unidadMedida;

    public SensorTemperatura(String id, String ubicacion){
        super(id, ubicacion);
        unidadMedida = "°C";
    }
}
