public class MostrarEstado {
    public static void mostrarEstado(String palabra, String letrasAdivinadas) {
        StringBuilder estado = new StringBuilder();
        for (char letra : palabra.toCharArray()) {
            if (letrasAdivinadas.indexOf(letra) >= 0) {
                estado.append(letra).append(" ");
            } else {
                estado.append("_ ");
            }
        }
        System.out.println("Estado actual: " + estado.toString());
    }
}
