import java.util.ArrayList;

public class Model {
    static ArrayList<Coche> parking = new ArrayList<>();

    Coche coche;


    /**
     * Crea un coche y lo mete en el parking
     *
     * @param modelo    del coche
     * @param matricula identificador unico
     * @return el coche creado
     */
    public Coche crearCoche(String modelo, String matricula) {
        coche = new Coche(modelo, matricula);
        parking.add(coche);
        return coche;
    }


    /**
     * Busca coche segun matricula
     *
     * @param matricula a buscar
     * @return chche o null si no existe
     */
    public Coche getCoche(String matricula) {
        // recorre el array buscando por matricula
        for (Coche coche1 : parking) {
            if (coche1.matricula.equals(matricula)) {
                return coche = coche1;
            }
        }
        return null;
    }

    /**
     * @param matricula
     * @param velocidadTotal nueva velocidad
     * @return velocidad modificada
     */
    public Integer cambiarVelocidad(String matricula, int velocidadTotal) {
        // busca el coche
        Coche coche = getCoche(matricula);
        coche.velocidad = velocidadTotal;

        // retorna la nueva velocidad
        return coche.velocidad;
    }


    /**
     * Ddevuelve la velocidad segun la matricula
     *
     * @param matricula
     */
    public Integer getVelocidad(String matricula) {
        Coche coche = getCoche(matricula);
        return coche.velocidad;
    }

    /**
     * @param velocidadAumentar nueva velocidad
     * @return velocidad modificada
     */
    public Integer subirVelocidad(String matricula, int velocidadAumentar) {
        // busca el coche
        Coche coche = getCoche(matricula);
        coche.velocidad += velocidadAumentar;

        // retorna la nueva velocidad
        return coche.velocidad + velocidadAumentar;

    }

    public Integer bajarVelocidad(String matricula, int velocidaDisminuida) {
        // busca el coche
        Coche coche = getCoche(matricula);
        coche.velocidad -= velocidaDisminuida;
        // retorna la nueva velocidad
        return coche.velocidad - velocidaDisminuida;
    }
}







