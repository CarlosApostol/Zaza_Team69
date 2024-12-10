import java.util.Scanner;

public class AdivinarLetra {
    private static final Scanner scanner = new Scanner(System.in);

    public static char adivinarLetra(String letrasUsadas) {
        char letra;
        while (true) {
            System.out.print("Introduce una letra: ");
            letra = scanner.next().toLowerCase().charAt(0); // Usamos `scanner` para leer la entrada

            if (letrasUsadas.indexOf(letra) >= 0) { // Comprobamos si la letra ya ha sido usada
                System.out.println("Ya has usado esa letra. Intenta otra.");
            } else {
                break; // Salimos del bucle si la letra no se ha usado
            }
        }
        return letra; // Devolvemos la letra que el usuario ha introducido
    }
}
