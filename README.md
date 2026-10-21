# Sistema de Invernadero Inteligente

## Descripción breve del sistema
Aplicación de consola en Java que simula el monitoreo y control de un invernadero inteligente. El sistema permite registrar y analizar variables ambientales como temperatura del aire, humedad ambiental y humedad del suelo mediante sensores especializados, colaborando de manera directa con un sistema de riego para la automatización del cuidado del suelo.

## Clases implementadas
- Sensor (Superclase)
- SensorTemperatura (Subclase)
- SensorHumedad (Subclase)
- SensorHumedadSuelo (Subclase)
- SistemaRiego (Clase del actuador)
- Main (Clase principal)

## Responsabilidad de cada clase
- **Sensor**: Servir como superclase base para los sensores, encapsulando datos comunes (id, ubicacion, estado, ultimaMedicion) y definiendo el comportamiento general de evaluación.
- **SensorTemperatura**: Representar la lectura de temperatura en °C, evaluando si el nivel es bajo, adecuado o alto.
- **SensorHumedad**: Representar la lectura de humedad relativa ambiental en %, determinando si el ambiente requiere ajuste.
- **SensorHumedadSuelo**: Representar la lectura de humedad en la tierra (%) e incluir comportamiento específico para verificar si el suelo requiere agua.
- **SistemaRiego**: Modificar su estado (activado/desactivado) en función de las mediciones provistas por el sensor de humedad del suelo.
- **Main**: Crear las instancias, organizar la colección polimórfica de sensores y coordinar la ejecución del flujo del programa.

## Instrucciones para ejecutar el programa
1. Clonar el repositorio desde GitHub:
   git clone https://github.com/ddavalos01/sistema-invernadero-java/tree/master
2. Abrir el proyecto en IntelliJ IDEA (o IDE compatible).
3. Navegar a la carpeta src/ y abrir la clase Main.java.
4. Ejecutar la clase Main mediante la opción Run.

## Conceptos de POO aplicados

### Encapsulación
Todos los atributos en la superclase Sensor y demás clases son private, garantizando que el acceso y modificación de datos internos se realice únicamente mediante métodos getters y setters públicos.

### Herencia
Las clases SensorTemperatura, SensorHumedad y SensorHumedadSuelo extienden de la superclase Sensor mediante la palabra clave extends, heredando sus atributos y métodos comunes sin duplicar código.

### Uso de super
Se utiliza super(id, ubicacion) en los constructores de las subclases para delegar la inicialización de los datos comunes al constructor de la superclase Sensor.

### Sobrescritura (@Override)
Las subclases sobrescriben el método evaluarMedicion() definido en la superclase Sensor para proporcionar una interpretación específica según el tipo de variable medida.

### Polimorfismo
En la clase Main, se utiliza un arreglo de tipo general Sensor[] para almacenar objetos de distintas subclases (SensorTemperatura, SensorHumedad, SensorHumedadSuelo), tratándolos de manera uniforme.

### Enlace dinámico (Dynamic Binding)
Al iterar el arreglo en el ciclo for y ejecutar sensor.evaluarMedicion(), la Máquina Virtual de Java (JVM) determina en tiempo de ejecución la versión específica del método que debe ejecutarse según el tipo real del objeto.

### Uso de instanceof y Casting
Se utiliza if (sensor instanceof SensorHumedadSuelo) para verificar el tipo real del objeto en tiempo de ejecución y, mediante un casting explícito (SensorHumedadSuelo) sensor, se accede al comportamiento exclusivo evaluarHumedadSuelo().

## Pruebas realizadas
- Creación e inicialización: Creación de los objetos sensores con sus respectivas identificaciones y ubicaciones iniciales.
- Asignación de mediciones: Simulación de distintas lecturas de temperatura, humedad ambiental y humedad de suelo mediante setUltimaMedicion().
- Recorrido polimórfico: Verificación de la ejecución de evaluarMedicion() en cada elemento del arreglo Sensor[].
- Evaluación y activación de riego: Comprobación del encendido/apagado del SistemaRiego cuando la humedad del suelo cae por debajo del umbral mínimo del 30%.

## Enlace al documento de análisis y diseño
El análisis completo, tablas de responsabilidades y diagramas UML inicial y final se encuentran documentados en:  
[Documento de Análisis y Diseño](docs/01-analisis-diseno.md)

## Conclusión
La realización de esta práctica permitió aplicar de forma integrada conceptos importantes de la programación orientada a objetos en Java. La correcta estructuración mediante herencia y polimorfismo facilitó la reutilización de código y la extensibilidad del sistema, mientras que el desacoplamiento entre los sensores y el sistema de riego permitió simular una configuración modular del invernadero que facilita la implementación de más sensores o sistemas de riego.
