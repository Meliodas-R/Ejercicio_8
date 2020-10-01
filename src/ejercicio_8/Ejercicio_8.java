package ejercicio_8;

import java.util.Scanner;

/**
 * 8. Generar un número aleatorio entre el 1 y 10 y pedir al usuario que trate
 * de adivinarlo introduciendo por teclado números. El programa no acabará hasta
 * que el usuario acierte el numero, y el programa le informará de si el número
 * que indique cada vez, está cerca o no del resultado generado aleatoriamente.
 *
 */
public class Ejercicio_8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroAleatorio = (int) (Math.random() * 10 + 1);
        int numeroUsuario;
        boolean salir = false;

        while (salir != true) {
            System.out.print("Introduce un número del 1 al 10: ");
            numeroUsuario = teclado.nextInt();
            if (numeroAleatorio == numeroUsuario) {
                salir = true;
            }

            if (numeroUsuario < numeroAleatorio) {
                System.out.println("Soy un número mayor que: " + numeroUsuario);
            }

            if (numeroUsuario > numeroAleatorio) {
                System.out.println("Soy un número menor que: " + numeroUsuario);
            }
        }
        System.out.println("¡Has ganado!");
    }

}
