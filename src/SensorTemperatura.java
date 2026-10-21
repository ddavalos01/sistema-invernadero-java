public class SensorTemperatura extends Sensor{
    private final String unidadMedida;

    public SensorTemperatura(String id, String ubicacion){
        super(id, ubicacion);
        unidadMedida = "°C";
    }

    @Override
    public void evaluarMedicion() {
        System.out.println("Valor medido por el sensor "+ getId() +": " + getUltimaMedicion() + unidadMedida);
    }
}
