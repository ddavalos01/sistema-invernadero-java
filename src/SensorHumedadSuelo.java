public class SensorHumedadSuelo extends Sensor{
    private final String unidadMedida;

    public SensorHumedadSuelo(String id, String ubicacion){
        super(id, ubicacion);
        unidadMedida = "%";
    }
}