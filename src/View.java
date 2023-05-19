import javax.swing.*;

public class View {


    public static Iu form;

    public View() {
        // creamos la ventana
        form = Iu.crearVentana();
    }

    /**
     * agregamos varios atributos para poder çonstruir un builder
     * @param matricula del coche
     * @param  modelo que queremos mostrar
     * @param aireAcondicionado  que utilizamos un booleano
     * @param numeroDePuertas del coche
     * @param  tapizadoDeCuero del asiento del coche
     * @param velocidad del coche
     * @return true si todo bien
     */

   static boolean mostrarCoche(String modelo, String matricula,boolean aireAcondicionado,boolean tapizadoDeCuero, int numeroDePuertas, int velocidad ) {

        String mensaje = "Modelo : " + modelo + "\nCon matricula: " + matricula  + "\nAire Acondicionado: " + aireAcondicionado + "\nNumero de puertas : " + numeroDePuertas + "\nTapizado de cuero: "
                + tapizadoDeCuero +"\nLA velocidad es :"+ velocidad;

        System.out.println(mensaje);
       form.textFieldVelocidad.setText(String.valueOf(velocidad));
        Dialogo.mostrarMensaje(mensaje);
        return true;
    }


}




