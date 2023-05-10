public class Controller {
    static Model miModelo;
    static View miVista;

    /**
     * Este es el punto inicial de nuestra aplicación
     * Las tareas iniciales estarían en este método
     *
     * @param args no usadas
     */
    public static void main(String[] args) {
        miModelo = new Model();
        miVista = new View();

        // instanciamos al observador
        ObserverVelocidad observoVelocidad = new ObserverVelocidad();
        miModelo.addObserver(observoVelocidad);

        // instanciamos un segundo observador
        SegundoObserve otroObservador = new SegundoObserve();
        miModelo.addObserver(otroObservador);
    }


    /**
     * @param modelo
     * @param matricula
     * @param aireAcondicionado
     * @param tapizadoDeCuero
     * @param numeroDePuertas
     * @param velocidad;
     */

    public void  crearCoche(String modelo, String matricula, boolean aireAcondicionado, boolean tapizadoDeCuero, int numeroDePuertas, int velocidad) {
        Coche coche = miModelo.crearCoche(modelo, matricula, aireAcondicionado, tapizadoDeCuero, numeroDePuertas, velocidad);
        if (coche != null)
            View.mostrarCoche(coche.modelo, coche.matricula, coche.aireAcondicionado, coche.tapizadoDeCuero, coche.numeroDePuertas, coche.velocidad);

         }

    /**
     * Metodo aumentarVelocidad
     *
     * @param matricula
     * @param velocidad
     * @return velocidad
     */
    public void aumentarVelocidad(String matricula, int velocidad) {
         miModelo.subirVelocidad(matricula, velocidad);
    }

    /**
     * Metodo  dismuirVelocidad
     *
     * @param matricula
     * @param velocidad
     * @return velocidad
     */
    public void disminuirVelocidad(String matricula, int velocidad) {
         miModelo.bajarVelocidad(matricula, velocidad);
    }
    public Coche buscar(String matricula) {
        return  Model.getCoche(matricula);
    }
}
