public class SensorHumedad extends Sensor{
    private final String unidadMedida;

    public SensorHumedad(String id, String ubicacion){
        super(id, ubicacion);
        unidadMedida = "%";
    }

    @Override
    public void evaluarMedicion() {
        System.out.println("Valor medido por el sensor "+ getId() +": " + getUltimaMedicion() + unidadMedida);
    }
}