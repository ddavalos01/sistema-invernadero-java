public class SensorHumedad extends Sensor{
    private final String unidadMedida;

    public SensorHumedad(String id, String ubicacion){
        super(id, ubicacion);
        unidadMedida = "%";
    }
}