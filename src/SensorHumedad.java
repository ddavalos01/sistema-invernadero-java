public class SensorHumedad extends Sensor{
    private final String unidadMedida;

    public SensorHumedad(String id, String ubicacion){
        super(id, ubicacion);
        unidadMedida = "%";
    }

    @Override
    public void evaluarMedicion() {
        System.out.println("Valor medido por el sensor "+ getId() +": " + getUltimaMedicion() + unidadMedida);
        if (getUltimaMedicion() < 40.0) {
            System.out.println("Humedad baja.");
        } else if (getUltimaMedicion() > 70.0){
            System.out.println("Humedad alta.");
        } else{
            System.out.println("Humedad adecuada.");
        }
    }
}