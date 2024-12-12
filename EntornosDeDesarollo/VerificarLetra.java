public class VerificarLetra {
    public static boolean verificarLetra(String palabra, char letra, StringBuilder letrasAdivinadas) {
        if (palabra.indexOf(letra) >= 0) {
            letrasAdivinadas.append(letra);
            return true;
        }
        return false;
    }
}
