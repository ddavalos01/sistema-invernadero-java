public class SensorHumedad extends Sensor{
    private final String unidadMedida;

    public SensorHumedad(String id, String ubicacion){
        super(id, ubicacion);
        unidadMedida = "%";
    }

    @Override
    public void interpretacionMedicion() {
        System.out.println("Valor medido por el sensor "+ SensorTemperatura.getId() +": " + SensorTemperatura.getUltimaMedicion() + unidadMedida);
    }
}