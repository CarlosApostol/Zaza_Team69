public class JuegoCompletado {
    public static boolean juegoCompletado(String palabra, String letrasDisponibles) {
        for (char letra : palabra.toCharArray()) {
            if (letrasDisponibles.indexOf(letra) == -1) {
                return false;
            }
        }
        return true;
    }
}