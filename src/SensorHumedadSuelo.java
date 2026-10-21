public class SensorHumedadSuelo extends Sensor{
    private final String unidadMedida;

    public SensorHumedadSuelo(String id, String ubicacion){
        super(id, ubicacion);
        unidadMedida = "%";
    }

    @Override
    public void evaluarMedicion() {
        System.out.println("Valor medido por el sensor "+ getId() +": " + getUltimaMedicion() + unidadMedida);
    }

    public void evaluarHumedadSuelo(){
        if( getUltimaMedicion()<30.0 ){
            System.out.println("Humedad del suelo baja");
        } else if (getUltimaMedicion() > 70.0){
            System.out.println("Humedad del suelo alta.");
        } else {
            System.out.println("Humedad del suelo adecuada");
        }
    }
}